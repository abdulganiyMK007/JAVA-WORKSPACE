package chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SameFirstLetterWordMapper {

    public static void main(String[] args) {
        String filename = "einstein_summary.txt";
        Map<Character, String> dictionary = mapFile(filename);

        if (dictionary != null) {
            printMap(dictionary);
        } else {
            System.out.println("Dictionary is NULL");
        }
    }

    /**
     * Reads all words from a file and add them to a map whose 
     * keys are the first letters of the words and whose values 
     * are sets of words that start with that same letter. 
     * 
     * @param infilename input file name
     * @return A map with the appropriate keys and values
     */
    private static Map<Character, String> mapFile(String infilename) {
        File inputFile = new File(infilename);
		try (Scanner in = new Scanner(inputFile)) {
            Map<Character, String> dictionary = new TreeMap<>();

            String currentWord = "";
            char firstChar = ' ';
            
            while (in.hasNext()) {
                currentWord = in.next();
                firstChar = Character.toUpperCase(currentWord.charAt(0));
                dictionary.merge(firstChar, currentWord, (oldValue, value) -> oldValue +" "+ value);
                // if (dictionary.containsKey(firstChar)) {
                //     currentWord = dictionary.get(firstChar) +" "+ currentWord;
                // } 
                // dictionary.put(firstChar, currentWord);
            }

            in.close();
            return dictionary;
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
            return null;
        }
        
    }


    /**
     * Prints out the word sets in alphabetical order
     * 
     * @param dictionary A map whose key are the first letters of the words 
     * and whose values are sets of words that start with that same letter.
     */
    private static void printMap(Map<Character, String> dictionary) {
        for (Character key : dictionary.keySet()) {
            System.out.println(key +" : "+ dictionary.get(key));
        }
    }
    
}
