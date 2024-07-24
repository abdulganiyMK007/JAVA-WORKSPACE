package Chapter9;

public class WorldClock extends Clock {

    private static final int N_HOURS_IN_A_DAY = 24;
    

    private int timeOffset;

    public WorldClock(int timeOffset) {
        this.timeOffset = timeOffset % N_HOURS_IN_A_DAY;
    }

    public String getHours() {
        return ((Integer.parseInt(super.getHours()) + timeOffset) % N_HOURS_IN_A_DAY) + "";
        // System.out.println("HOURS: "+ hours);
        // return hours;
    }

    public String toString() {
        return super.toString() + "[timeOffset=" + timeOffset + "]";
    }
    
}
