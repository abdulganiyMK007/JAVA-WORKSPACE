package Chapter9;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }

}
