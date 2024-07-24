package chapter15;

import java.util.LinkedList;
import java.util.Queue;

public class StringQueuePermutator {

    private static final String DASH = "-";
    
    public static void main(String[] args) {
        String word = "eat";
        Queue<String> wordQueue = new LinkedList<>();
        LinkedList<String> permutations = new LinkedList<>();

        wordQueue.add(DASH + word);

        String tempWord = "";
        String[] wordArray = null;
        int length = 0;

        while (!wordQueue.isEmpty()) {
            tempWord = wordQueue.remove();

            if (tempWord.endsWith(DASH)) {
                permutations.add(tempWord.substring(0, tempWord.length() - 1));
            } else {
                wordArray = tempWord.split(DASH);
                length = wordArray[1].length();

                for (int i = 0; i < length; i++) {
                    tempWord = wordArray[0] + wordArray[1].charAt(i) + DASH + wordArray[1].substring(0, i) + wordArray[1].substring(i + 1);
                    wordQueue.add(tempWord);
                }
            }
        }


        for (int i = 0; i < permutations.size(); i++) {
            System.out.println(permutations.get(i));
        }

    }


}
