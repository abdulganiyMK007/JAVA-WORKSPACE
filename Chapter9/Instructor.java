package Chapter9;

public class Instructor extends Person {

    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return super.toString() + "[salary=" + salary + "]";
    }

}
