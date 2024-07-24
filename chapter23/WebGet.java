import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This program demonstrates how to use a socket to communicate
 * with a web server. Supply the name of the host and the
 * resource on the command-line, for example java WebGet 
 * horstmann.com index.html
 */
public class WebGet {

   private static final Logger logger = Logger.getLogger(Test.class.getName());
   public static void main(String[] args) throws IOException {
      logger.setLevel(Level.OFF);

      // Get command-line arguments
      String host;
      String resource;

      if (args.length == 2) {
         host = args[0];
         resource = args[1];

      } else {
         System.out.println("Getting / from horstmann.com");
         host = "horstmann.com";
         resource = "/";
      }

      // Open socket
      final int HTTP_PORT = 80;
      try (Socket s = new Socket(host, HTTP_PORT)) {

         // Get streams
         InputStream instream = s.getInputStream();
         OutputStream outstream = s.getOutputStream();

         // Turn streams into scanners and writers
         Scanner in = new Scanner(instream);
         PrintWriter out = new PrintWriter(outstream);

         // Send command
         String command = "GET " + resource + " HTTP/1.1\n" + "Host: " + host + "\n\n";
         out.print(command);
         out.flush();

         // Read server response
         printTitle(in);
         in.close();
      } 
   }

   private static void printTitle(Scanner in) {
      final String TITLE_OPEN_TAG = "<title>";
      final String TITLE_CLOSE_TAG = "</title>";

      while (in.hasNextLine()) {
         String input = in.nextLine();

         if (input.contains(TITLE_OPEN_TAG)) {
            input = input.trim();

            int openTagIndex = input.indexOf(TITLE_OPEN_TAG);
            int closeTagIndex = input.indexOf(TITLE_CLOSE_TAG);

            logger.info("open index = "+ openTagIndex);
            logger.info("close index = "+ closeTagIndex);

            String title = input.substring(openTagIndex + TITLE_OPEN_TAG.length(), closeTagIndex);
            System.out.println("TITLE: "+ title);
            break;
         }
      }
   }

   private static void printHTTPHeader(Scanner in) {
      boolean isEmptyLine = false;

      while (in.hasNextLine() && !isEmptyLine) {
         String input = in.nextLine();

         if (input.trim().length() == 0) {
            isEmptyLine = true;
         }

         System.out.println(input);
      }
   }
   
   private static void printAll(Scanner in) {
      while (in.hasNextLine()) {
         String input = in.nextLine();
         System.out.println(input);
      }
   }

}
