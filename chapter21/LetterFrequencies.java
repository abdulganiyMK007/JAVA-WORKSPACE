import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;


public class LetterFrequencies {
/*
 * This program reads an input file and prints the letter frequencies in that file.
 * Neglecting non alphabet characters.
 */
    public static void main(String[] args) {
        String inFile = "einstein_summary.txt";
        Map<Character, Long> letterCount = new TreeMap<>();
        long allLetterCount = 0;

        try (InputStream inStream = new FileInputStream(inFile)) {
            long count = 0;
            boolean done = false;
            while (!done) {
                int next = inStream.read();
                if (next != -1) {
                    allLetterCount++;
                    if (!isLetter(next)) continue;
                    char nextChar = Character.toUpperCase((char) next);
                    if (letterCount.containsKey(nextChar)) {
                        count = letterCount.get(nextChar) + 1;
                    } else {
                        count = 1;
                    }
                    letterCount.put(nextChar, count);
                } else {
                    done = true;
                }
            }
            
        } catch (IOException exception) {
           System.out.println("Error processing file: " + exception);
        }

        
        for (Character letter : letterCount.keySet()) {
            long freqeuncy = letterCount.get(letter);
            double percent = freqeuncy * 100.0 / allLetterCount;
            System.out.printf("%-2s%-7d%2.2f%-1s", letter + "", freqeuncy, percent, "%");
            System.out.println();
        }
   
    }

    private static boolean isLetter(int next) {
        return (next >= 'a' && next <= 'z') || (next >= 'A' && next <= 'Z');
    }
    
}
