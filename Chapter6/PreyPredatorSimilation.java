package Chapter6;
import java.util.Scanner;

/*
In a predator-prey simulation, you compute the populations of predators and prey, using the following equations: 

preyn+1 = preyn × (1 + A – B × predn) 
predn+1 = predn × (1 – C + D × preyn) 

Here, 
A is the rate at which prey birth exceeds natural death, 
B is the rate of predation, 
C is the rate at which predator deaths exceed births without food, and 
D represents predator increase in the presence of food. 

Write a program that prompts users for these rates, the initial population sizes, and  the number of peri ods. Then print the populations for the given number of periods.  

As inputs, try A = 0.1, B = C = 0.01, and D = 0.00002 with initial prey and predator  populations of 1,000 and 20.
*/

public class PreyPredatorSimilation {

  public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double rateA, rateB, rateC, rateD, preySize, predatorSize, numOfPeriods;
	
		rateA = rateB = rateC = rateD = preySize = predatorSize = numOfPeriods = 0;
		
		System.out.print("Enter the rate at which prey birth exceeds natural death (A): ");
		rateA = in.nextDouble();
		
		System.out.print("Enter the rate of predation (B): ");
		rateB = in.nextDouble();
		
		System.out.print("Enter the rate at which predator deaths exceed births without food (C): ");
		rateC = in.nextDouble();
		
		System.out.print("Enter rate of predator increase in the presence of food (D) ");
		rateD = in.nextDouble();

		System.out.print("Enter prey population size: ");
		preySize = in.nextDouble();
		
		System.out.print("Enter predator population size: ");
		predatorSize = in.nextDouble();
		
		System.out.print("Enter number of periods: ");
		numOfPeriods = in.nextDouble();
		
		double newPreySize = 0;
		double newPredatorSize = 0;
		
		for (int i = 0; i < numOfPeriods; i++) {
		  newPreySize = preySize * (1 + rateA - rateB * predatorSize);
		  
		  newPredatorSize = predatorSize * (1 + rateC - rateD * preySize);
		}
		
		newPreySize = Math.round(newPreySize);
		newPredatorSize = Math.round(newPredatorSize);

		System.out.println("New prey size: "+ newPreySize);
		System.out.println("New predator size: "+ newPredatorSize);

		in.close();
  }

}
