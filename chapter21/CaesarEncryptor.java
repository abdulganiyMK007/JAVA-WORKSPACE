
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * This program encrypts a file, using the Caesar cipher.
 */
public class CaesarEncryptor {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Input file: ");
      String inFile = "c-encrypt.txt"; //in.next();
      System.out.print("Output file: ");
      String outFile = "c-output.txt"; //in.next();
      System.out.print("Encryption key: ");
      int key = 3; //in.nextInt();
      in.close();

      
      
      try (InputStream inStream = new FileInputStream(inFile);
            OutputStream outStream = new FileOutputStream(outFile)) {
         CaesarCipher cipher = new CaesarCipher(key);
         cipher.encryptStream(inStream, outStream);
      } catch (IOException exception) {
         System.out.println("Error processing file: " + exception);
      }
   }
}
