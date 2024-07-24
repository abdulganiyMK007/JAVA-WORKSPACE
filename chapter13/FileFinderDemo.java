package chapter13;

import java.io.File;

public class FileFinderDemo {
   public static void main(String[] args) {
      File startingDirectory = new File("C:\\Users\\USER\\Desktop\\bigjava\\ch13");
      FileFinder finder = new FileFinder(startingDirectory);
      finder.find(".java");
   }
}
