package Chapter3;



public class LetterPrinter {

  public static void main(String[] args) {
  
  	Letter myLetter = new Letter("John", "Mary");
  	myLetter.addLine("I am sorry we must part.");
  	myLetter.addLine("I wish you all the best.");
  	 
  	String printer = myLetter.getText();
  	System.out.println(printer);

  }

}
