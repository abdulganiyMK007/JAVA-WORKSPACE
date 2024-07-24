package chapter2;


import java.util.logging.Logger;
// import java.util.logging.Level;


// Java program to illustrate logging in Java 
// The following code shows a basic example how logging  
// works in Java 
public class LoggerTest {

    private static final Logger logger = Logger.getLogger(LoggerTest.class.getName());

    public static void main(String[] args) {
        
        // logger.setLevel(Level.OFF);
       
        logger.severe("This is a SEVERE message");
        logger.warning("This is a WARNING message");
        logger.info("This is an INFO message");
       
        System.out.println("END - END -END.");

        
    }
}