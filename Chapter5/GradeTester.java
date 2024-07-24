package Chapter5;



public class GradeTester {

  public static void main(String[] args) {
  
  	/*
  	System.out.println(Math.round(2.85 * 10)%10);
  	System.out.println(Math.round(2.80 * 10)%10);
  	System.out.println(Math.round(2.45 * 10)%10);
  	*/
  	
  	Grade g = new Grade();
  	
  	System.out.println(g.getLetterGrade(0.0));
  	System.out.println(g.getLetterGrade(0.1));
  	System.out.println(g.getLetterGrade(0.2));
  	System.out.println(g.getLetterGrade(0.3));
  	System.out.println(g.getLetterGrade(0.4));
  	System.out.println(g.getLetterGrade(0.5));
  	System.out.println(g.getLetterGrade(0.6));
  	System.out.println(g.getLetterGrade(0.7));
  	System.out.println(g.getLetterGrade(0.8));
  	System.out.println(g.getLetterGrade(0.9));
  	System.out.println(g.getLetterGrade(1.0));
  	System.out.println(g.getLetterGrade(5.7));
  	System.out.println(g.getLetterGrade(-0.7));
  	
  	
  	/*
  	System.out.println(g.getLetterGrade(4));
  	System.out.println(g.getLetterGrade(3));
  	System.out.println(g.getLetterGrade(2));
  	System.out.println(g.getLetterGrade(1));
  	System.out.println(g.getLetterGrade(0));
  	System.out.println(g.getLetterGrade(2.7));
  	*/
  	
  	/*
  	System.out.println(g.getNumericGrade("A+"));
  	System.out.println(g.getNumericGrade("A"));
  	System.out.println(g.getNumericGrade("A-"));
  	System.out.println(g.getNumericGrade("B+"));
  	System.out.println(g.getNumericGrade("B"));
  	System.out.println(g.getNumericGrade("B-"));
  	System.out.println(g.getNumericGrade("C+"));
  	System.out.println(g.getNumericGrade("C"));
  	System.out.println(g.getNumericGrade("C-"));
  	System.out.println(g.getNumericGrade("D+"));
  	System.out.println(g.getNumericGrade("D"));
  	System.out.println(g.getNumericGrade("D-"));
  	System.out.println(g.getNumericGrade("F+"));
  	System.out.println(g.getNumericGrade("F"));
  	System.out.println(g.getNumericGrade("F-"));
  	System.out.println(g.getNumericGrade("G"));
  	System.out.println(g.getNumericGrade("L"));
  	System.out.println(g.getNumericGrade("Z"));
  	*/
  }

}
