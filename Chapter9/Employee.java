package Chapter9;

public class Employee {

    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setBaseSalary(double newSalary) {
        baseSalary = newSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return baseSalary;
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + "][baseSalary=" + baseSalary + "]";
    }
}