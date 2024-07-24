
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class OnlyCharacters {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (InputStream in = new FileInputStream("bank.dat")) {
            int next = 0;
            int counter = 0;
            String outStr = "";
            while (next != -1) {
                next = in.read();
                counter++;
                if (next >= 32 && next <= 126) {
                    outStr += Character.toString(next);
                }

                if (counter == 64) {
                    System.out.println(outStr);
                    outStr = "";
                    counter = 0;
                }
            }
                System.out.println("END OF FILE");
        }
    }
    
}
