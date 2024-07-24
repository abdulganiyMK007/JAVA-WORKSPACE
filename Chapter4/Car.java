package Chapter4;

import java.util.Scanner;



/*
Write a program that asks the user to input 
• The number of gallons of gas in the tank
• The fuel efficiency in miles per gallon 
• The price of gas per gallon 
Then print the cost per 100 miles and how far the car can go with the gas in the tank.
*/
public class Car {

  public static void main(String[] args) {
  
  
  	Scanner sc = new Scanner(System.in);
  	
  	double numOfGas, fuelEfficiency, price, cost, distance;
  	numOfGas = fuelEfficiency = price = cost = distance = 0;
  	
  	System.out.print("Enter the number of gas in tank: ");
  	
  	numOfGas = sc.nextDouble();
  	
  	System.out.print("Enter the fuel efficiency (mil/gal): ");
  	fuelEfficiency = sc.nextDouble();
  	
  	System.out.print("Enter the price of gas (per gal): ");
  	price = sc.nextDouble();
  	
  	cost = price / fuelEfficiency / 100;
  	distance = numOfGas * fuelEfficiency;
  	
  	System.out.printf("Cost per 100 miles is %.2f\n", cost);
  	System.out.printf("Distance fuel can covered: %.2f\n", distance);
  	
  	
		sc.close();
  }

}
