package chapter14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * This program reads a file with numbers, and writes the numbers to another
 * file, lined up in a column and followed by their total.
 */
public class CountryFileReader {
	public static void main(String[] args) throws FileNotFoundException {
		// Prompt for the input and output file names
		Scanner console = new Scanner(System.in);
		
//		System.out.print("Input file: ");
//		String inputFileName = console.next();
		String inputFileName = "POP mini.txt";
		
//		System.out.print("Output file: ");
//		String outputFileName = console.next();
		String outputFileName = "POP1.txt";
		
		// Construct the Scanner and PrintWriter objects for reading and writing
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		
		ArrayList<Country> countriesList = new ArrayList<>();
		
		// Read the input and write the output
		String line = "";
		int iName, iPopulation, iArea, iDensity;
		while (in.hasNextLine()) {
			line = in.nextLine();
			if (line.length() == 0) continue;
			if (line.charAt(0) == '#') continue;

			char ch = ' ';
			iName = iPopulation = iArea  = iDensity = 0;
			for (int i = 0; i < line.length(); i++) {
				ch = line.charAt(i);

				
				// Extract country name
				if (Character.isAlphabetic(ch) && iName == 0) iName = i;
				// Extract country populaton
				if (Character.isDigit(line.charAt(i)) && iName != 0 && iPopulation == 0) iPopulation = i;
				// Extract country density
				if (line.charAt(i) == ' ' && iArea != 0 && iDensity == 0) iDensity = i;
				// Extract country area
				if (line.charAt(i) == ' ' && iPopulation != 0 && iArea == 0) iArea = i;
			}

			// System.out.println(iName);
			// System.out.println(iPopulation);
			// System.out.println(iArea);
			// System.out.println(iDensity);


			String name = line.substring(iName, iPopulation - 1);
			long population = Long.parseLong(stripComma(line.substring(iPopulation, iArea)));
			long area = Long.parseLong(stripComma(line.substring(iArea + 1, iDensity)));
			double density = Double.parseDouble(stripComma(line.substring(iDensity + 1)));

			Country aCountry = new Country(name, population, area, density);
			countriesList.add(aCountry);
			// System.out.println(aCountry.toString());

		}
		
		
		for (int i = 0; i < countriesList.size(); i++) {
			System.out.println(countriesList.get(i).toString());
		}

		Country[] countryArray = new Country[countriesList.size()];
		countryArray = countriesList.toArray(countryArray);
		// Arrays.sort(countryArray, new CountryComparator());

		System.out.println("=========== SORTED ===========");
		for (int i = 0; i < countryArray.length; i++) {
			System.out.println(countryArray[i].toString());
		}

		
		console.close();
		in.close();
		out.close();
	}


	private static String stripComma(String str) {
		String newStr = "";
		char ch = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (!Character.isDigit(ch)) continue;
			newStr += ch;
		}

		return newStr;
	}


	
}
