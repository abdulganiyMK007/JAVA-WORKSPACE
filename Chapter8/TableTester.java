
public class TableTester {

    public static void main(String[] args) {
        Table tab = new Table();

        
        tab.addLine("John Jacob Astor,1763,1848");
        tab.addLine("\"William Backhouse Astor, Jr.\",1829,1892");
        tab.addLine("\"John Jacob \"\"Jakey\"\" Astor VI\",1912,1992");
        System.out.println("Cols: " + tab.columns());
        System.out.println("Rows: " + tab.rows());

        tab.printTable();

        System.out.println("" + tab.getEntry(1, 1));
        System.out.println("" + tab.getEntry(1, 2));
        System.out.println("" + tab.getEntry(1, 3));

    }

}
