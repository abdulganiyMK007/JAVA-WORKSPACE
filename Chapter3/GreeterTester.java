package Chapter3;



public class GreeterTester {

  public static void main(String[] args) {
		
		Greeter gt = new Greeter();
		Greeter gh = new Greeter("Dave");
		
		System.out.println(gt.sayHello());
		System.out.println(gt.sayGoodBye());
		System.out.println(gt.refuseHelp());
		
		System.out.println(gh.sayHello());
		System.out.println(gh.sayGoodBye());
		System.out.println(gh.refuseHelp());
		
  }

}
