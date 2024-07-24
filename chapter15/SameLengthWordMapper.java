package chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SameLengthWordMapper {
    
    public static void main(String[] args) {
        String filename = "einstein_summary.txt";
        Map<Integer, String> dictionary = mapFile(filename);

        if (dictionary != null) {
            printMap(dictionary);
        } else {
            System.out.println("Dictionary is NULL");
        }
    }

    /**
     * Read all words from a file and add them to a map 
     * whose keys are word lengths and whose values are 
     * comma-separated strings of words of the same length
     * 
     * @param infilename input file name
     * @return A map with the appropriate keys and values
     */
    private static Map<Integer, String> mapFile(String infilename) {
        File inputFile = new File(infilename);
		try (Scanner in = new Scanner(inputFile)) {
            Map<Integer, String> dictionary = new TreeMap<>();

            String currentWord = "";
            int currentWordLength = 0;
            
            while (in.hasNext()) {
                currentWord = in.next();
                currentWordLength = currentWord.length();
                dictionary.merge(currentWordLength, currentWord, (oldValue, value) -> oldValue +", "+ value);
                // if (dictionary.containsKey(currentWordLength)) {
                //     currentWord = dictionary.get(currentWordLength) +", "+ currentWord;
                // } 
                // dictionary.put(currentWordLength, currentWord);
            }

            in.close();
            return dictionary;
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
            return null;
        }
        
    }


    /**
     * Prints words map in increasing order by the length of their entries.
     * 
     * @param dictionary whose keys are word lengths and whose values are 
     * comma-separated strings of words of the same length.
     */
    private static void printMap(Map<Integer, String> dictionary) {
        for (Integer key : dictionary.keySet()) {
            System.out.println(key +" : "+ dictionary.get(key));
        }
    }
    
    
    
}
