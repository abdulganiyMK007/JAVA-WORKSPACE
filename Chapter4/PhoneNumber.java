package Chapter4;

/*
4155551212 --> (415) 555-1212
*/
public class PhoneNumber {

  public static void main(String[] args) {
  	
  	String pNum = "4155551212";
  	
  	
  	String qNum = "("+ pNum.substring(0, 3) +") "+ pNum.substring(3, 6) +"-"+ pNum.substring(6);
  	
  	System.out.println(pNum);
  	System.out.println(qNum);

  }

}
