package Chapter9;


public class Bike {

    private int startSpeed;
    private int startGear;

    public Bike(int startSpeed, int startGear) {
        this.startSpeed = startSpeed;
        this.startGear = startGear;
    }

    public void applyBrake(int speedDecrement) {
        this.startSpeed -= speedDecrement;
    }

    public void speedUp(int speedIncrement) {
        this.startSpeed += speedIncrement;
    }

    public void setGear(int newGear) {
        this.startGear = newGear;
    }

    public int getSpeed() {
        return this.startSpeed;
    }

    public int getGear() {
        return this.startGear;
    }

    

}
