package Chapter3;



public class PersonTester {

  public static void main(String[] args) {
  
  	Person me = new Person("Me");
  	Person a = new Person("Alaba");
  	Person b = new Person("Becky");
		Person c = new Person("Cathrine");
		
		me.befriend(a);
		me.befriend(b);
		me.befriend(c);
		me.getProfile();
		
		Person d = new Person("David");
  	Person e = new Person("Elizabeth");
		
		
		me.befriend(d);
		me.befriend(e);
		
		me.getProfile();
		
		me.unfriend(a);
		me.getProfile();
		
		
		
  }

}
