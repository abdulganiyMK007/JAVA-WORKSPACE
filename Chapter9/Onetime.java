package Chapter9;

public class Onetime extends Appointment {

    private String year, month, day;

    public Onetime(String description, String date) {
        super.description = description;
        super.date = date;

        year = date.substring(0, 4);
        month = date.substring(5, 7);
        day = date.substring(8);

        // System.out.printf("Year: %s , Month: %s , Day: %s%n", year, month, day);
    }

    public boolean occursOn(int year, int month, int day) {
        String yearString, monthString, dayString;

        yearString = year + "";
        monthString = month + "";
        dayString = day + "";

        if (month < 10)
            monthString = "0" + monthString;
        if (day < 10)
            dayString = "0" + dayString;

        // System.out.println(this.year + " ==> " + yearString);
        // System.out.println(this.month + " ==> " + monthString);
        // System.out.println(this.day + " ==> " + dayString);

        boolean isValidDay = this.day.equals(dayString);
        boolean isValidMonth = this.month.equals(monthString);
        boolean isValidYear = this.year.equals(yearString);

        // System.out.println(isValidDay + "-" + isValidMonth + "-" + isValidYear);

        return isValidDay && isValidMonth && isValidYear;
    }

    // public String getYear() {
    // return year;
    // }

    // public String getMonth() {
    // return month;
    // }

    // public String getDay() {
    // return day;
    // }

}
