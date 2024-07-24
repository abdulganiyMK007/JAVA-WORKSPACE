package Chapter9;

public class Worker {

    private String name;
    private double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getClass().getName() + " [name=" + name + ", salary=" + salary + "]";
    }

    
    
}
