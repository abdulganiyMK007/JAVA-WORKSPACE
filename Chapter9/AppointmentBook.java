package Chapter9;

import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentBook {

    private static ArrayList<Appointment> appList;
    

    private static final String ZERO_STR = "0";
    private static final String ONE_STR = "1";
    private static final String TWO_STR = "2";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        appList = new ArrayList<>();
        appList.add(new Onetime("o - see the dentist", "2001-01-23"));
        appList.add(new Onetime("o - see the surgeon", "2001-02-23"));
        appList.add(new Onetime("o - see the therapist", "2001-03-23"));

        appList.add(new Daily("d - see the teacher", "2001-01-23"));
        appList.add(new Daily("d - see the student", "2001-02-24"));
        appList.add(new Daily("d - see the lecturer", "2001-03-23"));

        appList.add(new Monthly("m - see the chef", "2001-01-12"));
        appList.add(new Monthly("m - see the cooker", "2001-02-13"));
        appList.add(new Monthly("m - see the caterer", "2001-03-23"));

        while (true) {
            System.out.print("What do you wanna do? \n ===> (0) To quit (1) To add (2) To search: ");
            String toDo = in.next();

            if (toDo.equals(ZERO_STR)) {
                break;
            } else if (toDo.equals(ONE_STR)) {
                add();
            } else if (toDo.equals(TWO_STR)) {
                search();
            } else {
                continue;
            }

            System.out.println("============================");
        }

        in.close();

    }


    private static void search() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter date: ");
        String searchDate = in.nextLine();

        int year = Integer.parseInt(searchDate.substring(0, 4));
        int month = Integer.parseInt(searchDate.substring(5, 7));
        int day = Integer.parseInt(searchDate.substring(8));
        in.close();
        
        String description;
        for (int i = 0; i < appList.size(); i++) {
            if (appList.get(i).occursOn(year, month, day)) {
                description = appList.get(i).getDescription();
                System.out.printf("Description: %s%n", description);
            }
        }

    }

    private static void add() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Appointment type\n===> 0 for [Onetime], 1 for [Daily] Else [Monthly]: ");
        String type = in.nextLine();

        System.out.print("Enter description: ");
        String description = in.nextLine();

        System.out.print("Enter date: ");
        String date = in.nextLine();

        in.close();
        Appointment newApp;

        if (type.equals(ZERO_STR)) {
            newApp = new Onetime(description, date);

        } else if (type.equals(ONE_STR)) {
            newApp = new Daily(description, date);

        } else {
            newApp = new Monthly(description, date);
        }

        appList.add(newApp);
        // System.out.println("5");
    }

}
