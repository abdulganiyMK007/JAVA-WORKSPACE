//package chapter21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class RandomMonoalphabetEncryptor {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input file: ");
        String inFile = "mono-encrypt.txt"; //in.next();
        System.out.print("Output file: ");
        String outFile = "mono-output.txt"; //in.next();
        System.out.print("Encryption key: ");
        String key = "FEATHER"; //in.nextLine();
        in.close();
        
        try (InputStream inStream = new FileInputStream(inFile);
               OutputStream outStream = new FileOutputStream(outFile)) {
               
        	      RandomMonoalphabetCipher cipher = new RandomMonoalphabetCipher(key);
               cipher.encryptStream(inStream, outStream);
        } catch (IOException exception) {
           System.out.println("Error processing file: " + exception);
        }
     }
    
    
}
