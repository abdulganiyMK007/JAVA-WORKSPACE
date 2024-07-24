package Chapter3;

/*
A Person has a name (just a first name for simplicity) and friends. Store the names of the friends in a string, separated by spaces. Provide a constructor that constructs a person with a given name and no friends. Provide methods
*/
public class Person {

	private String name;
	private String friends;
	private int friendCount;

	public Person(String name) {
	  this.name = name;
	  friends = "";
	  friendCount = 0;
	}
	
	public void befriend(Person p) {
		friends += p.getName() + " ";
		friendCount++; 
	}
	
	public String getName() {
		return name;  
	}

	public void unfriend(Person p) {
		if (friends.contains(p.getName())) {
			
			friends = friends.replace(p.getName() + " ", "");
			friendCount--;
		}
	}


	public String getFriendNames() {
	  return friends;
	}

	public int getFriendCount() {
		return friendCount; 
	}
	
	public void getProfile() {
	  String profile = "Name: "+ name +"\n";
	  profile += "Friends: "+ friends +"\n";
	  profile += "No of friends: "+ friendCount +"\n\n";
	  System.out.println(profile);
	  
}

}
