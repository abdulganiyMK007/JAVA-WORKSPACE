package Chapter5;

import java.util.Scanner;

public class ElectromagneticSpectrum {

	private static final double MAX_RADIO_WAVES_FREQ = 3E+9;
	private static final double MAX_MICROWAVES_FREQ = 3E+11;
	private static final double MAX_INFRARED_FREQ = 4E+14;
	private static final double MAX_VISIBLE_LIGHT_FREQ = 7.5E+14;
	private static final double MAX_ULTRA_VIOLET_FREQ = 3E+16;
	private static final double MAX_X_RAYS_FREQ = 3E+19;
	
	
	private static final String RADIO_WAVES = "Radio waves";
	private static final String MICROWAVES = "Microwaves";
	private static final String INFRARED = "Infrared";
	private static final String VISIBLE_LIGHT = "Visible light";
	private static final String ULTRA_VIOLET = "Ultra violet";
	private static final String X_RAYS = "X-rays";
	private static final String GAMMA_RAYS = "Gamma-rays";
	
	
	private static final double MAX_MICROWAVES_WAVELENGTH = 1E-1;
	private static final double MAX_INFRARED_WAVELENGTH = 7E-3;
	private static final double MAX_VISIBLE_LIGHT_WAVELENGTH = 7E-7;
	private static final double MAX_ULTRA_VIOLET_WAVELENGTH  = 4E-7;
	private static final double MAX_X_RAYS_WAVELENGTH = 1E-8;
	private static final double MAX_GAMMA_RAYS_WAVELENGTH = 1E-11;
	
	
  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	System.out.print("Wavelength or Frequency input? ");
  	boolean isFreq = in.nextLine().substring(0, 1).equalsIgnoreCase("F");
  	
  	System.out.print("Enter value: ");
  	double value = in.nextDouble();
  	
  	if (isFreq) {
  	  System.out.println(useFrequency(value));
  	} else {
  	  System.out.println(useWaveLength(value));
  	}

		in.close();
  }
  
  
  
  private static String useWaveLength(double wavelength) {
  	if (wavelength < MAX_GAMMA_RAYS_WAVELENGTH) {
  	  return GAMMA_RAYS;
  	  
  	} else if (wavelength < MAX_X_RAYS_WAVELENGTH) { 
  	
  	  return X_RAYS;
  	  
  	} else if (wavelength < MAX_ULTRA_VIOLET_WAVELENGTH) {
  	return ULTRA_VIOLET;
  	  
  	} else if (wavelength < MAX_VISIBLE_LIGHT_WAVELENGTH) {
  	return VISIBLE_LIGHT;
  	  
  	} else if (wavelength < MAX_INFRARED_WAVELENGTH) {
  	return INFRARED;
  	  
  	} else if (wavelength < MAX_MICROWAVES_WAVELENGTH) {
  	  return MICROWAVES;
  	  
  	} else {
  		return RADIO_WAVES;  
  	}
  }
  
  
  
  private static String useFrequency(double freq) {
    if (freq < MAX_RADIO_WAVES_FREQ) {
      return RADIO_WAVES;
      
    } else if (freq < MAX_MICROWAVES_FREQ) {
    	return MICROWAVES;
    	
    } else if (freq < MAX_INFRARED_FREQ) {
      return INFRARED;
      
    } else if (freq < MAX_VISIBLE_LIGHT_FREQ) {
      return VISIBLE_LIGHT;
      
    } else if (freq < MAX_ULTRA_VIOLET_FREQ) {
      return ULTRA_VIOLET;
      
    } else if (freq < MAX_X_RAYS_FREQ) {
       return X_RAYS;
       
    } else {
      return GAMMA_RAYS;
      
    }
  }

}
