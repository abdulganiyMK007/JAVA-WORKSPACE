package Chapter6;

import java.util.Scanner;
import java.util.Random;

public class WordCharacterPermute {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		Random gen = new Random();
		
		String word, first, middle, last;
		word = first = middle = last = "";
		
		int index1, index2;
		index1 = index2 = 0;
		
		System.out.print("Enter a word: ");
		word = in.nextLine();
		
		for (int i = 0; i < word.length() - 1; i++) {
			index1 = gen.nextInt(word.length() - 2);
			index2 = index1 + 1 + gen.nextInt(word.length() - 1 - index1);	
			
			first = word.substring(0, index1);
			middle = word.substring(index1 + 1, index2);
			last = word.substring(index2 + 1);
			
			word = first + word.charAt(index2) + middle + word.charAt(index1) + last;
			
			//System.out.println(word);
		}
		
		
		System.out.println(word);
		in.close();
	
	}

}
