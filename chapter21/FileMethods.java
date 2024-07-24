
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileMethods {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        copy("mary.txt", "mary_copy.txt");
    }


    public static void copy(String infile, String outfile) throws FileNotFoundException, IOException {
        try (InputStream in = new FileInputStream(infile);
                OutputStream out = new FileOutputStream(outfile)) {
            int next = 0;
            while (next != -1) {
                next = in.read();
                out.write(next);
            }
            System.out.println("END OF FILE");
        }
    }
    
}
