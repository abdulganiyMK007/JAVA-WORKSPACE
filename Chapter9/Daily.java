package Chapter9;

public class Daily extends Appointment {

    // private String year, month, day;

    public Daily(String description, String date) {
        super.description = description;
        super.date = date;

        // year = date.substring(0, 4);
        // month = date.substring(5, 7);
        // day = date.substring(8);
    }

    public boolean occursOn(int year, int month, int day) {
        return true;
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
