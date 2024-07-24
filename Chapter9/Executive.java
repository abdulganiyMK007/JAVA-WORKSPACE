package Chapter9;

public class Executive extends Worker {

    private String department;

    public Executive(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
     
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return super.toString() + "[department=" + department + "]";
    }

    

    
    
}
