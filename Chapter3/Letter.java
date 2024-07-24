package Chapter3;

/*
Class Letter authors a simple letter. In the constructor.
*/

public class Letter {

	private String recepient;
	private String sender;
	private String text;
	
	public Letter(String from, String to) {
	  sender = from;
	  recepient = to;
	  text = "";
} 
	
	// add a line of text to the body of the letter.
	public void addLine(String line) {
	  text += line + "\n";
	} 

	// Returns the entire text of the letter.
	public String getText() {
	  String letter = "Dear "+ recepient + "\n\n";
	  letter += text + "\n";
	  letter += "Sincerely, \n\n"+ sender;
	  
	  return letter;
	}

}
