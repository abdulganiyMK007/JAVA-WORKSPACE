package Chapter5;
import java.util.Scanner;

public class Temperature {

	private static final double VOLTAGE_Vs = 20;
  private static final double RESISTANCE_Rs = 75;
  private static final double RESISTANCE_Ro = 100;
  private static final double CONSTANT_k = 0.5;
  
  private static final double MAX_VOLTAGE_Vm = 18;
  private static final double MIN_VOLTAGE_Vm = 12;

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  	double voltageVm, temperature;
  	voltageVm = temperature = 0;
  	
  	System.out.print("Enter volatge value (between 12 and 18): ");
  	voltageVm = in.nextDouble();
  	
  	
  	if (voltageVm >= MIN_VOLTAGE_Vm && voltageVm <= MAX_VOLTAGE_Vm) {
  	  temperature = (RESISTANCE_Rs / CONSTANT_k) * (voltageVm / (VOLTAGE_Vs - voltageVm)) - (RESISTANCE_Ro / CONSTANT_k);
  	  
  	  System.out.println("Temperature value is "+ temperature);
  } else {
    System.out.println("Error! Volage value must be between "+ MIN_VOLTAGE_Vm +" and "+ MAX_VOLTAGE_Vm);
  }
  
  	in.close();
  }

}
