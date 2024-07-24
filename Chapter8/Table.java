import java.util.ArrayList;

public class Table {

    private static final char COMMA_CHAR = ',';
    private static final char QUOTE_CHAR = '"';

    private ArrayList<ArrayList<String>> table;

    public Table() {
        table = new ArrayList<>();
    }

    public void addLine(String line) {
        ArrayList<Integer> indexList = getSplitIndices(line.trim());
        ArrayList<String> tableRow = new ArrayList<>();

        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < indexList.size() - 1; i++) {
            endIndex = indexList.get(i);
            tableRow.add(line.substring(startIndex, endIndex));
            startIndex = endIndex + 1;
        }

        tableRow.add(line.substring(startIndex));
        table.add(tableRow);
    }

    public String getEntry(int row, int column) {
        row--;
        column--;
        boolean isRowValid = row >= 0 && row <= rows();
        boolean isColumnValid = column >= 0 && column <= columns();

        if (isRowValid && isColumnValid) {
            return table.get(row).get(column);
        } else {
            return "NONE";
        }
    }

    public int rows() {
        return table.size();
    }

    public int columns() {
        return table.get(0).size();

    }

    private ArrayList<Integer> getSplitIndices(String line) {
        char ch = ' ';
        boolean inQuote = false;
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            ch = line.charAt(i);
            if (inQuote) {
                if (ch == QUOTE_CHAR) {
                    if ((i + 1) < line.length() - 1 && line.charAt(i + 1) == COMMA_CHAR) {
                        indexList.add(i + 1);
                        inQuote = false;
                        i++;
                    }
                }
            } else {
                if (ch == QUOTE_CHAR)
                    inQuote = true;
                if (ch == COMMA_CHAR)
                    indexList.add(i);
            }
        }

        indexList.add(line.length() - 1);
        return indexList;
    }

    public void printTable() {
        String row = "";
        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> tableRow = table.get(i);
            for (int j = 0; j < tableRow.size(); j++) {
                row += tableRow.get(j) + " - ";
            }
            System.out.println(row);
            row = "";
        }
    }

}
