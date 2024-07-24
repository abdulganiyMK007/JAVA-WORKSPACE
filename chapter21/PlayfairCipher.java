
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

/**
 * This class encrypts files using the Caesar cipher.
 * For decryption, use an encryptor whose key is the
 * negative of the encryption key.
 */
public class PlayfairCipher {
   private String key;
   
   /**
    * Constructs a cipher object with a given key.
    * 
    * @param aKey the encryption key
    */
   public PlayfairCipher(String aKey) {
      key = aKey;
   }

   /**
    * Encrypts the contents of an input stream.
    * 
    * @param in  the input stream
    * @param out the output stream
    */
    public void encryptStream(InputStream in, OutputStream out) throws IOException {
        boolean done = false;
        int positionTracker = 0;
        while (!done) {
            int next = in.read();
            if (next == -1) {
                done = true;
            } else {
                if (positionTracker == key.length()) positionTracker = 0;
                int encrypted = encrypt(next, positionTracker);
                out.write(encrypted);
                positionTracker++;
            }
        }
    }

   /**
    * Encrypts a value.
    * 
    * @param b the value to encrypt (between 0 and 255)
    * @return the encrypted value
    */
    public int encrypt(int b, int track) {
        int currKey = key.charAt(track) - 'A';
        System.out.println(track);
        return (b + currKey) % 256;
    }
}
