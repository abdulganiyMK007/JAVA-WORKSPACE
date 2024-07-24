package Chapter3;

public class Greeter {

	private static final String HELLO = "Hello";
	private static final String WORLD = "World";
	private static final String GOODBYE = "Goodbye";
	
	private String name;
	
	public Greeter() {
		name = "";
	}
	
	public Greeter(String name) {
		this.name = name;
	}
	
	
	public String sayHello() {
		return (name.equals("")) ? 
		HELLO +", "+ WORLD : HELLO +", "+ name;
	}
	
	public String sayGoodBye() {
		return (name.equals("")) ? 
		GOODBYE +", "+ WORLD : GOODBYE +", "+ name;
	}
	
	public String refuseHelp() {
		if (name.equals("")) {
			return "I am sorry. I am afraid I can’t do that.";
		} else {
			return "I am sorry, "+ name +". I am afraid I can’t do that.";
		}
	}

}
