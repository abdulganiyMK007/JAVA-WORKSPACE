
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;


public class FIleReader {

    public static void main(String[] args) {
        reverseLineByLine("mary_copy.txt");
        System.out.println("DONE");
    }

    private static void reverseLineByLine(String filename) {
        String line = "";
        try {
            Scanner in = new Scanner(new File(filename));
            // PrintWriter out = new PrintWriter("mary_copy.txt");
            PrintWriter out = new PrintWriter(filename);

            while (in.hasNextLine()) {
                line = in.nextLine();
                out.append(reverse(line));
            }

            out.println();
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Error Processing: "+ e);
        }
    }

    private static String reverse(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
           rev = str.charAt(i) + rev; 
        }

        return rev;
    }
    
}
