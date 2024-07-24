
import java.util.Scanner;

public class Reader {

    private Scanner in;
    private String current;

    public Reader(String line) {
        in = new Scanner(line);
    }

    // Checks whether there is another element
    public boolean hasMoreElements() {
        return in.hasNext();
    }

    // Yields the current element without consuming it
    public String getCurrent() {
        return current;
    }

    // Consumes the current element
    public void next() {
        current = in.next();
    }

}
