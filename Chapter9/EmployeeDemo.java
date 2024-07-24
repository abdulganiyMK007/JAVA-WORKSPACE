package Chapter9;

public class EmployeeDemo {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Margeret John", 20000);
        Employee emp2 = new Employee("Lucas Ebele", 30000);
        Employee emp3 = new Manager("Ahmad Ajadi", 50000, 10000);
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

    }

}
