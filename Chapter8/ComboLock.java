/*
Declare a class ComboLock that works like the combination lock 
in a gym locker, as shown here. The lock is constructed with 
a combination—three numbers between 0 and 39. The reset
method resets the dial so that it points to 0. The turnLeft and 
turnRight methods turn the dial by a given number of ticks to the 
left or right. The open method attempts to open the lock. The lock 
opens if the user first turned it right to the first number in the 
combination, then left to the second, and then right to the third. 

 */

public class ComboLock {

    private static final int MAX_LOCK_NUMBER = 40;

    private int combo1;
    private int combo2;
    private int combo3;

    private boolean isCombo1;
    private boolean isCombo2;
    private boolean isCombo3;

    private int dial;
    private int directionTrack;

    public ComboLock(int secret1, int secret2, int secret3) {
        combo1 = secret1;
        combo2 = secret2;
        combo3 = secret3;

        dial = directionTrack = 0;
        isCombo1 = isCombo2 = isCombo3 = false;
    }

    public void reset() {
        dial = directionTrack = 0;
        isCombo1 = isCombo2 = isCombo3 = false;
    }

    public void turnLeft(int ticks) {
        if (ticks > 0) {
            dial = getDialLocation(dial - ticks);

            if (directionTrack == 1) {
                if (dial == combo2)
                    isCombo2 = true;
                directionTrack++;
            }
        }
    }

    public void turnRight(int ticks) {
        if (ticks > 0) {
            dial = getDialLocation(dial + ticks);

            if (directionTrack == 0) {
                if (dial == combo1)
                    isCombo1 = true;
                directionTrack++;
            }

            if (directionTrack == 2) {
                if (dial == combo3)
                    isCombo3 = true;
            }
        }
    }

    public boolean open() {
        return (isCombo1 && isCombo2 && isCombo3);
    }

    private int getDialLocation(int ticks) {
        if (ticks >= 0) {
            return ticks % MAX_LOCK_NUMBER;
        } else {
            return (ticks % MAX_LOCK_NUMBER) + MAX_LOCK_NUMBER;
        }
    }

}
