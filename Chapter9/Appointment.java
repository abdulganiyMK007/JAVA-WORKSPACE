package Chapter9;

public abstract class Appointment {

    protected String description;
    protected String date;

    public abstract boolean occursOn(int aYear, int aMonth, int aDay);

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

}
