package Chapter9;

public class Clock {

    private String timeString;
    private String alarmTime;

    public Clock() {
        timeString = java.time.LocalTime.now().toString();
        alarmTime = "";
    }

    public String getHours() {
        return timeString.substring(0, 2);
    }

    public String getMinutes() {
        return timeString.substring(3, 5);
    }

    public void setAlarm(int hours, int minutes) {
        hours %= 24;
        minutes %= 60;

        String alarmHours, alarmMinutes;

        if (hours < 10) {
            alarmHours = "0" + hours + "";
        } else {
            alarmHours = hours + "";
        }

        if (minutes < 10) {
            alarmMinutes = "0" + minutes + "";
        } else {
            alarmMinutes = minutes + "";
        }

        alarmTime = alarmHours + ":" + alarmMinutes;
    }

    public String getTime() {
        String alarmString = "";
        String currentTime = getHours() + ":" + getMinutes();

        if (alarmTime.compareTo(currentTime) >= 0 && alarmTime.length() > 0) {
            alarmString = " \u23F0";
            alarmTime = "";
        }

        return currentTime + alarmString;
    }

    public boolean equals(String time) {
        return getTime().equals(time);
    }

    public String toString() {
        return getClass().getName() + "[Time=" + getTime() + "]";
    }

}