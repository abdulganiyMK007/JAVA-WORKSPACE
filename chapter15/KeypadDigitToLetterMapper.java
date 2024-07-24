package chapter15;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;

public class KeypadDigitToLetterMapper {

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "words_alpha_mini.txt";
        Map<Long, String> dictionary = getDictionary(filename);

        for (Long key : dictionary.keySet()) {
            System.out.println(key +": {"+ dictionary.get(key) +"}");
        }
    }


    private static Map<Long, String> getDictionary(String filename) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filename));
        Map<Long, String> dictionary = new TreeMap<>();
        
        String currentWord = "";
        String key = "";
        int keypad = 0;
        while (in.hasNext()) {
            currentWord = in.next();
            if (currentWord.length() > 10) continue;

            key = "";
            for (int i = 0; i < currentWord.length(); i++) {
                keypad = getKeypadDigit(currentWord.charAt(i));
                if (keypad > 0 && keypad < 10) {
                    key += keypad;
                }
            }

            dictionary.merge(Long.parseLong(key), currentWord, (oldValue, value) -> oldValue +", "+ value);
        }

        in.close();
        return dictionary;
    }

    private static int getKeypadDigit(char letter) {

        switch (Character.toUpperCase(letter)) {
            case 'A': case 'B': case 'C':
                return 2;
            case 'D': case 'E': case 'F':
                return 3;
            case 'G': case 'H': case 'I':
                return 4;
            case 'J': case 'K': case 'L':
                return 5;
            case 'M': case 'N': case 'O':
                return 6;
            case 'P': case 'Q': case 'R': case 'S':
                return 7;
            case 'T': case 'U': case 'V':
                return 8;
            case 'W': case 'X': case 'Y': case 'Z':
                return 9;
            default:
                return 0;
        }
    }
    
}
