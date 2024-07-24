package Chapter3;

public class Employee {

	private static final double HUNDRED = 100;

	private String name;
	private double salary;

	public Employee(String employeeName, double currentSalary) {
	  name = employeeName;
	  salary = currentSalary;
	}

	public String getName() {
  	return name;
	}
	
	public double getSalary() {
	  return salary;
	} 
	
	// Raise the employee’s salary by a certain percentage.
	public void raiseSalary(double byPercent) {
	  salary += (salary * byPercent / HUNDRED);
	}
	

}
