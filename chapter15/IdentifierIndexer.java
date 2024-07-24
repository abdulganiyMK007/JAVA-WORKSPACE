package chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IdentifierIndexer {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inLine = new Scanner(new File("einstein_summary.txt"));

        int lineCounter = 0;
        String word = "";
        while (inLine.hasNextLine()) {
            lineCounter++;
            word = inLine.nextLine();

            Scanner inWord = new Scanner(word);
            inWord.useDelimiter("[^A-Za-z0-9_]+");
            while (inWord.hasNext()) {
                //inWord.useDelimiter("[^A-Za-z0-9_]+");
                
                System.out.println("Line "+ lineCounter +": "+ inWord.next());
            }
            inWord.close();
        }
        inLine.close(); 
    }
    
}
