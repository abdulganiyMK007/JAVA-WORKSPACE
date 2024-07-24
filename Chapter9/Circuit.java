package Chapter9;

public abstract class Circuit {

    public abstract double getResistance();
    

    public String toString() {
        return getClass().getName();
    }
}
