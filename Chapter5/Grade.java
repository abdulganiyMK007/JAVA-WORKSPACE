package Chapter5;


/*
Write a program that translates a letter grade into a number grade. Letter grades are A, B, C, D, and F, possibly followed by + or –. Their numeric values are 4, 3, 2, 1, and 0. There is no F+ or F–. A + increases the numeric value by 0.3, a – decreases it by 0.3. However, an A+ has value 4.0.

Enter a letter grade: B 
The numeric value is 2.7. 
Use a class Grade with a method getNumericGrade.


Write a program that translates a number between 0 and 4 into the closest letter grade. For example, the number 2.8 (which might have been the average of several grades) would be converted to B–. Break ties in favor of the better grade; for example 2.85 should be a B. Use a class

2.8  = B-
2.85 = B
Grade with a method getLetterGrade.




*/
public class Grade {

	private static final double N_GRADE_A = 4.0;
	private static final double N_GRADE_B = 3.0;
	private static final double N_GRADE_C = 2.0;
	private static final double N_GRADE_D = 1.0;
	//private static final double N_GRADE_F = 0.0;
	
	private static final double GRADE_DIFF = 0.3;
	
	private static final String PLUS_SIGN = "+";
	//private static final String MINUS_SIGN = "-";
	
	private static final String L_GRADE_A_PLUS = "A+";
	private static final String L_GRADE_A = "A";
	private static final String L_GRADE_A_MINUS = "A-";
	private static final String L_GRADE_B_PLUS = "B+";
	private static final String L_GRADE_B = "B";
	private static final String L_GRADE_B_MINUS = "B-";
	private static final String L_GRADE_C_PLUS = "C+";
	private static final String L_GRADE_C = "C";
	private static final String L_GRADE_C_MINUS = "C-";
	private static final String L_GRADE_D_PLUS = "D+";
	private static final String L_GRADE_D = "D";
	private static final String L_GRADE_D_MINUS = "D-";
	private static final String L_GRADE_F_PLUS = "F+";
	private static final String L_GRADE_F = "F";
	private static final String L_GRADE_F_MINUS = "F-";
	

	public Grade() {}
	
	
	public String getLetterGrade(double numberGrade) {

		System.out.print(numberGrade +" : ");
		
		if (numberGrade < 0) return L_GRADE_F_MINUS;
		if (numberGrade < 0) return L_GRADE_A_PLUS;
		
		int deciDigit = (int) Math.round(numberGrade * 10) % 10;
		

		
		
		switch ((int) numberGrade) {
		  
		  case 4:
		  	if (deciDigit > 0) {
		  	  return L_GRADE_A_PLUS;
				} else {
				  return L_GRADE_A;
				}
		  	
		  case 3:
		  	if (deciDigit >= 0 && deciDigit <= 1) {
		  	  return L_GRADE_B;
		  	  
				} else if (deciDigit >= 2 && deciDigit <= 4) {
				  return L_GRADE_B_PLUS;
				  
				} else if (deciDigit >= 5 && deciDigit <= 8) { 
				  return L_GRADE_A_MINUS;
				  
				} else {
				  return L_GRADE_A;
				  
				}
		  	
		  case 2:
		  	if (deciDigit >= 0 && deciDigit <= 1) {
		  	  return L_GRADE_C;
		  	  
				} else if (deciDigit >= 2 && deciDigit <= 4) {
				  return L_GRADE_C_PLUS;
				  
				} else if (deciDigit >= 5 && deciDigit <= 8) { 
				  return L_GRADE_B_MINUS;
				  
				} else {
				  return L_GRADE_B;
				  
				}
		  	
		  case 1:
		  	if (deciDigit >= 0 && deciDigit <= 1) {
		  	  return L_GRADE_D;
		  	  
				} else if (deciDigit >= 2 && deciDigit <= 4) {
				  return L_GRADE_D_PLUS;
				  
				} else if (deciDigit >= 5 && deciDigit <= 8) { 
				  return L_GRADE_C_MINUS;
				  
				} else {
				  return L_GRADE_C;
				  
				}
		  	
		  case 0:
		  	if (deciDigit >= 0 && deciDigit <= 1) {
		  	  return L_GRADE_F;
		  	  
				} else if (deciDigit >= 2 && deciDigit <= 4) {
				  return L_GRADE_F_PLUS;
				  
				} else if (deciDigit >= 5 && deciDigit <= 8) { 
				  return L_GRADE_D_MINUS;
				  
				} else {
				  return L_GRADE_D;
				  
				}
		  	
		  default :
		  	return "Null";
		}
	
	}
	
	
	
	
	public double getNumericGrade(String letterGrade) {
		System.out.print(letterGrade + " : ");
	
		boolean isUnitLong = (letterGrade.length() == 1);
		char firstChar = letterGrade.charAt(0);
	  
	  switch (firstChar) {
	  
	  	case 'A': 
	  		if (isUnitLong) {
	  		  return N_GRADE_A;
				} else {
					boolean secondCharIsPlus = 						letterGrade.substring(1, 2).equals(PLUS_SIGN);
					return (secondCharIsPlus) ? N_GRADE_A : N_GRADE_A - GRADE_DIFF;	
				}
				
	    case 'B':
	  		if (isUnitLong) {
	  		  return N_GRADE_B;
				} else {
					boolean secondCharIsPlus = 						letterGrade.substring(1, 2).equals(PLUS_SIGN);
					return (secondCharIsPlus) ? N_GRADE_B + GRADE_DIFF : N_GRADE_B - GRADE_DIFF;	
				}
				
			case 'C':
	  		if (isUnitLong) {
	  		  return N_GRADE_C;
				} else {
					boolean secondCharIsPlus = 						letterGrade.substring(1, 2).equals(PLUS_SIGN);
					return (secondCharIsPlus) ? N_GRADE_C + GRADE_DIFF : N_GRADE_C - GRADE_DIFF;	
				}
				
			case 'D':
	  		if (isUnitLong) {
	  		  return N_GRADE_D;
				} else {
					boolean secondCharIsPlus = 						letterGrade.substring(1, 2).equals(PLUS_SIGN);
					return (secondCharIsPlus) ? N_GRADE_D + GRADE_DIFF : N_GRADE_D - GRADE_DIFF;	
				}
			
			default:
	  		if (isUnitLong) {
	  		  return N_GRADE_D;
				} else {
					boolean secondCharIsPlus = 						letterGrade.substring(1, 2).equals(PLUS_SIGN);
					return (secondCharIsPlus) ? N_GRADE_D + GRADE_DIFF : N_GRADE_D - GRADE_DIFF;	
				}
		}
		
	}
	

}
