package Chapter9;

public class MountainBike extends Bike {

    private int seatHeight;

    public MountainBike(int seatHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newSeatHeight) {
        seatHeight = newSeatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

}
