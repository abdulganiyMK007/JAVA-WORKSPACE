
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class RandomMonoalphabetCipher {

   private static String key;
   private static Map<Character, Character> mapKeys;

   /**
    * Constructs a cipher object with a given key.
    * 
    * @param aKey the encryption key
    */
   public RandomMonoalphabetCipher(String aKey) {
      key = aKey.toUpperCase();
      mapKeys = new TreeMap<>();
      setLetterKeyMap();

      // for (char key : mapKeys.keySet()) {
      // System.out.println(key +" -> "+ mapKeys.get(key));
      // }
   }

   /**
    * Encrypts the contents of an input stream.
    * 
    * @param in  the input stream
    * @param out the output stream
    */
   public void encryptStream(InputStream in, OutputStream out) throws IOException {
      boolean done = false;
      while (!done) {
         int next = in.read();
         if (next == -1) {
            done = true;
         } else {
            int encrypted = next;
            if (mapKeys.containsKey((char) next)) {
               encrypted = mapKeys.get((char) next);
            }
            // System.out.println(next +" -> "+ ((char) next) +" : "+ ((char) encrypted));
            out.write(encrypted);
         }
      }
   }

   private static void setLetterKeyMap() {
      key = key.chars()
            .distinct()
            .mapToObj(c -> String.valueOf((char) c))
            .collect(Collectors.joining());

      for (int i = 0; i < key.length(); i++) {
         mapKeys.put((char) ('A' + i), key.charAt(i));
      }

      int j = 'A' + key.length() - 1;
      for (int i = 'Z'; i >= 'A'; i--) {
         if (key.contains(Character.toString(i)))
            continue;
         j++;
         mapKeys.put((char) j, (char) i);
      }
   }
}
