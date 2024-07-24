package chapter15;

import java.util.Scanner;
import java.util.Stack;

/**
 * Use a stack to reverse the words of a sentence. Keep reading words 
 * until you have a word that ends in a period, adding them onto a stack. 
 * When you have a word with a period, pop the words off and print them. 
 * Stop when there are no more words in the input. For example, you 
 * should turn the input
 * 
 * >> Mary had a little lamb. Its fleece was white as snow.
 * into
 * >> Lamb little a had mary. Snow as white was fleece its.
 * 
 * Pay attention to capitalization and the placement of the period.
 */
public class StackSentenceReverser {

    private static final String PERIOD = ".";
    public static void main(String[] args) {
        String testSentence = "Mary had a little lamb. Its fleece was white as snow.";
        String currentWord = "";
        String reversedSentence = "";

        Scanner in = new Scanner(testSentence);
        Stack<String> wordStack = new Stack<>();

        while (in.hasNext()) {
            currentWord = in.next();
            wordStack.push(currentWord);
            if (currentWord.endsWith(PERIOD)) {
                reversedSentence += reverseSentence(wordStack) + " ";
            }
        }
        in.close();

        System.out.println(testSentence);
        System.out.println(reversedSentence);
    }

    private static String reverseSentence(Stack<String> wordStack) {
        String reversedStr = wordStack.pop();
        reversedStr = Character.toUpperCase(reversedStr.charAt(0)) + reversedStr.substring(1, reversedStr.length() - 1);
        while (wordStack.size() > 1) {
            reversedStr += " "+ wordStack.pop();
        }

        String lastWord = wordStack.pop();
        reversedStr += " "+ Character.toLowerCase(lastWord.charAt(0)) + lastWord.substring(1, lastWord.length()) + PERIOD;
        return reversedStr;
    }
    
}
