package chapter15;

import java.util.LinkedList;
import java.util.Stack;

public class StringStackPermutator {

    private static final String DASH = "-";
    
    public static void main(String[] args) {
        String word = "eat";
        Stack<String> wordStack = new Stack<>();
        LinkedList<String> permutations = new LinkedList<>();

        wordStack.push(DASH + word);

        String tempWord = "";
        String[] wordArray = null;
        int length = 0;

        while (!wordStack.isEmpty()) {
            tempWord = wordStack.pop();

            if (tempWord.endsWith(DASH)) {
                permutations.add(tempWord.substring(0, tempWord.length() - 1));
            } else {
                wordArray = tempWord.split(DASH);
                length = wordArray[1].length();

                for (int i = 0; i < length; i++) {
                    tempWord = wordArray[0] + wordArray[1].charAt(i) + DASH + wordArray[1].substring(0, i) + wordArray[1].substring(i + 1);
                    wordStack.add(tempWord);
                }
            }
        }


        for (int i = 0; i < permutations.size(); i++) {
            System.out.println(permutations.get(i));
        }

    }


}
