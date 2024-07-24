package Chapter7;

/*
Your task is to analyze whether a die is fair by counting how often the values 1, 2, ..., 6 appear. Your input is a sequence of die toss values, and you should print a table with the frequencies of each die value.
*/
public class DiceAnalyzer {

	public static void main(String[] args) {  
		final int SIDES = 6;
		
		Dice dice = new Dice(SIDES);
		dice.countInputs();
		dice.printCounters();
	}
	
}