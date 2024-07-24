package chapter15;


import java.util.Stack;

public class TagsChecker {

    public static void main(String[] args) {
        Stack<String> tagStack = new Stack<>();
        String text = "<p> <ul> <li> </li> </ul> <a> </a> </p>";
        // boolean isProperNest = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '<') {
                if (text.charAt(i + 1) == '/') {
                    String tag = extractTag(text, i + 1);
                    if (tag == null) {
                        // isProperNest = false;
                        break;
                    }
                    if (!tagStack.pop().equals(tag)) {
                        // isProperNest = false;
                        break;
                    }
                } else {
                    tagStack.push(extractTag(text, i));
                }
            }
        }
        
        
    }

    private static String extractTag(String text, int start) {
        int closeBracesPos = -1;
        for (int i = start; i < text.length(); i++) {
            if (text.charAt(i) == '>') {
                closeBracesPos = i;
                break;
            }
        }

        if (closeBracesPos < 0) return null;
        return text.substring(start, closeBracesPos);
    }
}