package chapter15;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GradeEditor {

    private static final String ADD_SYMBOL = "1";
    private static final String REMOVE_SYMBOL = "2";
    private static final String MODIFY_SYMBOL = "3";
    private static final String PRINT_SYMBOL = "4";
    private static final String QUIT_SYMBOL = "5";

    private static Map<Integer, Student> record = new TreeMap<>();
    private static Map<String, Student> printRecord = new TreeMap<>();

    public static void main(String[] args) {
/* 
        Student a = new Student("Betty", "Funmi", "A+");
        record.put(a.getId(), a);
        printRecord.put(a.getLastname() + a.getFirstname() + a.getId(), a);

        Student b = new Student("Caroline", "Aba", "B-");
        record.put(b.getId(), b);
        printRecord.put(b.getLastname() + b.getFirstname() + b.getId(), b);

        Student c = new Student("Dare", "Aba", "C+");
        record.put(c.getId(), c);
        printRecord.put(c.getLastname() + c.getFirstname() + c.getId(), c);

        Student d = new Student("Betty", "Secondus", "C-");
        record.put(d.getId(), d);
        printRecord.put(d.getLastname() + d.getFirstname() + d.getId(), d);
        
        Student e = new Student("Alex", "Aba", "B+");
        record.put(e.getId(), e);
        printRecord.put(e.getLastname() + e.getFirstname() + e.getId(), e);

        Student f = new Student("Betty", "Funmi", "D-");
        record.put(f.getId(), f);
        printRecord.put(f.getLastname() + f.getFirstname() + f.getId(), f);
*/
        
        int id = -1;
        String grade = "";
        String lastname = "";
        String firstname = "";
        String info = "This is Student Grade Editor Program: "
                        +"\n>>> Enter \""+ ADD_SYMBOL +"\" To add students "
                        +"\n>>> Enter \""+ REMOVE_SYMBOL +"\" To remove students "
                        +"\n>>> Enter \""+ MODIFY_SYMBOL +"\" To modify grades "
                        +"\n>>> Enter \""+ PRINT_SYMBOL +"\" To print grades "
                        +"\n>>> Enter \""+ QUIT_SYMBOL +"\" To quit \n\n";
        String action = "";
        Scanner in = new Scanner(System.in);

        System.out.print(info);
        while (true) {
            System.out.print(">>> Enter: ");
            action = in.next();

            if (action.equals(ADD_SYMBOL)) {
                System.out.print("Enter student's lastname: ");    
                lastname = in.next();

                System.out.print("Enter student's firstname: ");    
                firstname = in.next();

                System.out.print("Enter student's grade: ");    
                grade = in.next();

                Student newStudent = new Student(lastname, firstname, grade);

                record.put(newStudent.getId(), newStudent);
                printRecord.put(lastname + firstname + newStudent.getId(), newStudent);

                System.out.println(lastname +" "+ firstname +", GRADE: "+ grade +" SUCCESFULLY ADDED with ID: "+ newStudent.getId());


            } else if (action.equals(MODIFY_SYMBOL)) {
                System.out.print("Enter student's ID: ");    
                id = Integer.parseInt(in.next());
                if (!record.containsKey(id)) {
                    System.out.println("Student with ID: "+ id +" is NOT AVAILABLE");
                    System.out.println();
                    continue;
                }

                System.out.print("Enter student's grade: ");    
                grade = in.next();

                Student updateStudent = record.get(id);
                firstname = updateStudent.getFirstname();
                lastname = updateStudent.getLastname();
                record.get(id).setGrade(grade);
                printRecord.get(lastname + firstname + id).setGrade(grade);;

                System.out.println("Student with ID: "+ id +", NAME: "+ firstname +" "+ lastname +" SUCCESSFULLY MODIFIED.");

            } else if (action.equals(REMOVE_SYMBOL)) {
                System.out.print("Enter student's ID: ");    
                id = Integer.parseInt(in.next());
                if (!record.containsKey(id)) {
                    System.out.println("Student with ID: "+ id +" is NOT AVAILABLE");
                    System.out.println();
                    continue;
                }

                Student removeStudent = record.get(id);
                lastname = removeStudent.getLastname();
                firstname = removeStudent.getFirstname();
                grade = removeStudent.getGrade();
                record.remove(id);
                printRecord.remove(removeStudent.getLastname() + removeStudent.getFirstname() + id);
                
                System.out.println("Student with ID: "+ id +", NAME: "+ firstname +" "+ lastname +" SUCCESSFULLY REMOVED.");

            } else if (action.equals(PRINT_SYMBOL)) {
                printAll();

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
    
    private static void printAll() {
        Student from = null;
        String info = "";

        for (String key : printRecord.keySet()) {
            from = printRecord.get(key);
            info = "NAME: "+ from.getLastname() +" "+ from.getFirstname() 
                        +", ID: "+ from.getId() +", GRADE: "+ from.getGrade(); 
            System.out.println(info);
        }

    }

}
