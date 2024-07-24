public class ReaderDemo {

    public static void main(String[] args) {
        String line = "I like you";
        String line2 = "1 2 3 4 5";
        Reader rd = new Reader(line);

        System.out.println(rd.getCurrent());

        while (rd.hasMoreElements()) {
            rd.next();
            line2 = "1 2 3 4 5";
            Reader rd1 = new Reader(line2);

            while (rd1.hasMoreElements()) {
                rd1.next();
                System.out.println(rd1.getCurrent() + ": " + rd.getCurrent());
            }

        }
    }

}
