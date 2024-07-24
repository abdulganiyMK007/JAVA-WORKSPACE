package Chapter5;
import java.util.Scanner;

/*
Write a program that reads in three floating-point numbers and prints the largest of the three inputs. For example: 
Please enter three numbers: 4 9 2.5 
The largest number is 9.
*/

public class ThreeFloatingPoints {

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	System.out.print("Please enter three numbers: ");
  	double float1, float2, float3;
  	float1 = in.nextDouble();
  	float2 = in.nextDouble();
  	float3 = in.nextDouble();
  	

		System.out.println("The largest number is "+ Math.max(Math.max(float1, float2), float3));
		
		in.close();
  }

}
