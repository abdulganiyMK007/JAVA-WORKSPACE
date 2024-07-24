package chapter14;

import java.util.Scanner;

public class TableTimerDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SortingTableTimer timer = new SortingTableTimer();
		
		System.out.print("Enter smallest value: ");
		timer.getMinValue(in.nextLong());
		
		System.out.print("Enter largest value: ");
		timer.getMaxValue(in.nextLong());
		
		System.out.print("Enter number of measurement: ");
		timer.getNumOfInterval(in.nextInt());
		
		timer.printTable();
		in.close();
		
	}

}
