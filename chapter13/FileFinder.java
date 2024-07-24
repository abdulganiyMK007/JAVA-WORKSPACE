package chapter13;

import java.io.File;

public class FileFinder {
   private File[] children;

   /**
    * Constructs a file finder for a given directory tree.
    * 
    * @param startingDirectory the starting directory of the tree
    */
   public FileFinder(File startingDirectory) {
      children = startingDirectory.listFiles();
   }

   /**
    * Prints all files whose names end in a given extension.
    * 
    * @param extension a file extension (such as ".java")
    */
   public void find(String extension) {
      for (File child : children) {
         String fileName = child.toString();
         if (child.isDirectory()) {
            System.out.println("[Directory] "+ child.getName());
            FileFinder finder = new FileFinder(child);
            finder.find(extension);
         } else if (fileName.endsWith(extension)) {
            System.out.println("    [FIle] "+ child.getName());
         }
      }
   }
}
