
// Java program to illustrate logging in Java 
// The following code shows a basic example how logging  
// works in Java 
import java.util.logging.Level;
import java.util.logging.Logger;
// import java.util.logging.Level;



public class Test {

    private static final Logger logger = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) {
        
        logger.setLevel(Level.OFF);
       
        logger.severe("This is a SEVERE message");
        logger.warning("This is a WARNING message");
        logger.info("This is an INFO message");
       
        System.out.println("END - END -END.");

        
    }
}