import java.util.ArrayList;

public class NumbersInStringDemo {
    public static void main(String[] args) {
        String line = "In 1987, a typical personal computer cost $3,000 and had 512 kilobytes of RAM. Add 23%.";

        System.out.println("IGNORE SPECIAL CHARACTERS:");
        ArrayList<String> numList = NumbersInString.getNumbersInString(line, true);
        for (String value : numList) {
            System.out.println(value);
        }

        System.out.println("DON'T IGNORE SPECIAL CHARACTERS:");
        numList = NumbersInString.getNumbersInString(line, false);
        for (String value : numList) {
            System.out.println(value);
        }
    }

}
