package Chapter5;
import java.util.Scanner;
/*
Write a unit conversion program that asks the users from which unit they want to convert (fl. oz, gal, oz, lb, in, ft, mi) and to which unit they want to convert (ml, l, g, kg, mm, cm, m, km). 
Reject incompatible conversions (such as gal → km). 
Ask for the value to be converted, then display the result: 

Convert from? gal 
Convert to? ml 
Value? 2.5 
2.5 gal = 9462.5 ml
*/
public class UnitConverter {

	private static final String GALLON = "gal";
	private static final String OUNCE = "oz";
	private static final String MILLILITER = "ml";
	private static final String LITER = "l";
	
	private static final String INCH = "in";
	private static final String FEET = "ft";
	private static final String MILE = "mi";
	private static final String MILLIMETER= "mm";
	private static final String CENTIMETER = "cm";
	private static final String KILOMETER = "km";
	
	private static final String POUND = "lb";
	private static final String GRAM = "g";
	private static final String KILOGRAM = "kg";
	
	
	
	
	private static final double POUND_PER_GRAM = 453.592;
	private static final double OUNCE_PER_LITER = 0.029574;
	private static final double GALLON_PER_LITER = 3.78541;
	
	private static final double INCH_PER_METER = 0.0254;
	private static final double FOOT_PER_METER = 0.3048;
	private static final double MILE_PER_METER = 1609.344;
	
	
	private static final double KILO = 1E+3;
	private static final double MILLI = 1E-3;
	private static final double CENTI = 1E-2;
	
	

	private static String from;
	private static String to;
	
	private static double value;

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	double aValue = 0;
  	
  	
  	System.out.print("Convert from? \n (gal, oz, lb, in, ft, mi) ");
  	from = in.next();
  	
  	System.out.print("Convert to? \n (ml, l, g, kg, mm, cm, km) ");
  	to = in.next();
  	
  	System.out.print("Value? ");
  	aValue = in.nextDouble();
  	value = aValue;
  	
  	
  	if (isValidWeightUnits()) {
  	  System.out.println("Compatible weight units");
  	  weightConvert();
  	  
  	} else if (isValidVolumeUnits()) {
  	  System.out.println("Compatible volume units");
  	  volumeConvert();
  	  
  	} else if (isValidDistanceUnits()) {
  	  System.out.println("Compatible distance units");
  	  distanceConvert();
  	  
  	} else {
  	  System.out.println("ERROR! Incompatible units");
  	}
  	
  	
  	System.out.println(aValue +" "+ from +" = "+ value +" "+ to);
  	
		in.close();
  }
  
  
  // from (in, ft, mi) ==> to (mm, cm km)
  private static void distanceConvert() {
  	if (from.equals(INCH)) {
  	  value *= INCH_PER_METER;
  	  
  	} else if (from.equals(FEET)) {
  	  value *= FOOT_PER_METER;
  	  
  	} else if (from.equals(MILE)) {
  	  value *= MILE_PER_METER;
  	  
 	 }
 	 
 	 
 	 if (to.equals(MILLIMETER)) {
 	    value *= MILLI;
 	    
		} else if (to.equals(CENTIMETER)) {
		  value *= CENTI;
		  
		} else if (to.equals(KILOMETER)) {
		  value *= KILO;
		  
		}
  
  }
  
  // from (lb) ==> to (g, kg)
  private static void weightConvert() {
  	value *= POUND_PER_GRAM; // to gram
  	
    if (to.equals(KILOGRAM)) {
      value /= KILO;	// to kilogram
    } 
  }
  
  // from (oz, gal) ==> to (ml, l)
  private static void volumeConvert() {
    if (from.equals(OUNCE)) {
      value *= OUNCE_PER_LITER; // from oz to l
    } else {
      value *= GALLON_PER_LITER; // from gal to l
    }
    
    
    if (to.equals(MILLILITER)) {
      value *= KILO;
    }
  }
  

	private static boolean isValidDistanceUnits() {
		return (from.equals(INCH) || from.equals(FEET) || from.equals(MILE)) && (to.equals(MILLIMETER) || to.equals(CENTIMETER) || to.equals(KILOMETER));
	}

	private static boolean isValidVolumeUnits() {
		return (from.equals(GALLON) || from.equals(OUNCE)) && (to.equals(MILLILITER) || to.equals(LITER));
	}
	
	private static boolean isValidWeightUnits() {
		return from.equals(POUND) && (to.equals(GRAM) || to.equals(KILOGRAM));
	}




}
