
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * This program encrypts a file, using the Playfair cipher.
 */
public class PlayfairEncryptor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input file: ");
        String inFile = "v-encrypt.txt"; //in.next();
        System.out.print("Output file: ");
        String outFile = "v-output.txt"; //in.next();
        System.out.print("Encryption key: ");
        String key = "TIGER"; //in.next();
        in.close();
      
        try (InputStream inStream = new FileInputStream(inFile);
                OutputStream outStream = new FileOutputStream(outFile)) {
                    PlayfairCipher cipher = new PlayfairCipher(key);
            cipher.encryptStream(inStream, outStream);
        } catch (IOException exception) {
            System.out.println("Error processing file: " + exception);
        }
    }
}
