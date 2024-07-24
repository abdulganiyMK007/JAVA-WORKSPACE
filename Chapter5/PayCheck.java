package Chapter5;

/*
Write a program that reads in the name and salary of an employee. Here the salary will denote an hourly wage, such as $9.25. Then ask how many hours the employee worked in the past week. Be sure to accept fractional hours. Compute the pay. Any overtime work (over 40 hours per week) is paid at 150 percent of the regular wage. Print a paycheck for the employee. In your solution, implement a class Paycheck.
*/
public class PayCheck {

	private static final double MAX_HOURS_PER_WEEK = 40;
	private static final double OVERTIME_RATE = 1.5;


	private double salary;

	public PayCheck(double salary) {
	  this.salary = salary;
	}
	
	public double getPay(double hours) {
		double overhours = 0;
		
		if (hours > MAX_HOURS_PER_WEEK) {
		  overhours = hours - MAX_HOURS_PER_WEEK;
		  hours = MAX_HOURS_PER_WEEK;
		}
	  
	  return (hours + overhours * OVERTIME_RATE) * salary;
	}

}
