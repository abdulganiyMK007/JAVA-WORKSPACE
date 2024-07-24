package Chapter4;

/*
Write a program that displays the properties of a letter-size (8.5 × 11 inches) sheet of paper in millimeters. There are 25.4 millimeters per inch. The program should print: 
• The width and height 
• The perimeter 
• The length of the diagonal 
Use constants and comments in your program.
*/

public class LetterToMilli {

	private static final double MM_PER_INCH = 25.4;
	private static final double LETTER_WIDTH_IN_INCH = 8.54;
	private static final double LETTER_HEIGHT_IN_INCH = 11.0;
	

  public static void main(String[] args) {
  	double width, height, perimeter, diagonal;
  	width = height = perimeter = diagonal = 0;
  	
  	
  	width = LETTER_WIDTH_IN_INCH * MM_PER_INCH;
  	height = LETTER_HEIGHT_IN_INCH * MM_PER_INCH;
  	perimeter = 2 * (width + height);
  	diagonal = Math.sqrt(width * width + height * height);
  	
  	String format ="Width: %5.2f\nHeight: %5.2f\nPerimiter: %5.2f\nDiagonal: %5.2f";
  	System.out.printf(format, width, height, perimeter, diagonal);

  }










}
