package Chapter3;

/*
Change the Menu class in Worked Example 3.1 so that the menu options are labeled A, B, C, and so on. Hint: Make a string of the labels.
*/
public class Menu {
	private static final String LABELS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private String menuText;  
	private int optionCount;

	/** 
		Constructs a menu with no options.
	*/  			
	public Menu()  {
	  menuText = "";  
	  optionCount = 0;
	}  

	/** 
		Adds an option to the end of this menu.
		@param option the option to add  
	*/  
	public void addOption(String option)  { 
		optionCount++;
		menuText += "("+ LABELS.charAt(optionCount - 1) + ") " + option + "\n";
	  //menuText = menuText + optionCount + ") " + option + "\n";
	 
	}  
	
	/** 
		Displays the menu on the console.  
	*/  
	public void display()  {
	  System.out.println(menuText);
	}
	
	

}
