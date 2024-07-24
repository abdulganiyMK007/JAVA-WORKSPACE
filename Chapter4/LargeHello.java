package Chapter4;

public class LargeHello {

	private static final String LETTER_H =
			"*   *%n*   *%n*****%n*   *%n*   *%n%n";

	private static final String LETTER_E =
			"*****%n*%n*****%n*%n*****%n%n";
			
	private static final String LETTER_L =
			"*%n*%n*%n*%n*****%n%n";
	
	private static final String LETTER_O =
			"*****%n*   *%n*   *%n*   *%n*****%n%n";

  public static void main(String[] args) {
		System.out.printf(LETTER_H + LETTER_E + LETTER_L + LETTER_L + LETTER_O);
  }

}
