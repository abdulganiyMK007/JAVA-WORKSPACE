package chapter15;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GradeUpdater {

    private static final String ADD_SYMBOL = "1";
    private static final String REMOVE_SYMBOL = "2";
    private static final String MODIFY_SYMBOL = "3";
    private static final String PRINT_SYMBOL = "4";
    private static final String QUIT_SYMBOL = "5";

    public static void main(String[] args) {
        
        Map<String, String> record = new TreeMap<>();
        record.put("Alex", "A+");
        record.put("Betty", "B-");
        record.put("Cara", "C+");
        record.put("Dave", "D-");

        String name = "";
        String grade = "";
        String info = "\n>>> ["+ ADD_SYMBOL +"] To add students \n>>> ["+ REMOVE_SYMBOL +"] To remove students \n>>> ["+ MODIFY_SYMBOL +"] To modify grades \n>>> ["+ PRINT_SYMBOL +"] To print grades \n>>> ["+ QUIT_SYMBOL +"] To quit \n";
        String action = "";
        Scanner in = new Scanner(System.in);

        System.out.print(info);
        while (true) {
            System.out.print("Enter: ");
            action = in.next();

            if (isUpdate(action)) {
                System.out.print("Enter student's name: ");
                name = in.next();
                
                if (action.equals(ADD_SYMBOL) || action.equals(MODIFY_SYMBOL)) {
                    System.out.print("Enter student's grade: ");
                    grade = in.next();
                    record.put(name, grade);

                } else {
                    record.remove(name);
                }
            } else if (action.equals(PRINT_SYMBOL)) {
                printAll(record);
            } else if (action.equals(QUIT_SYMBOL)) {
                System.out.println("[PROGRAM END]");
                break;
            } else {
                System.out.println("[INVALID INPUT]\n");

                continue;
            }
            System.out.println("");
        }
        in.close();

    }

    private static boolean isUpdate(String action) {
        return (action.equals(ADD_SYMBOL) || action.equals(REMOVE_SYMBOL) || action.equals(MODIFY_SYMBOL));
    }
    
    private static void printAll(Map<String, String> record) {
        for (String key : record.keySet()) {
            System.out.println(key +" : "+ record.get(key));
        }
    }
}
