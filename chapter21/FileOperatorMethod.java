import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperatorMethod {

    public static void main(String[] args) {
        Path fromDir = Paths.get("C:\\Users\\USER\\Desktop\\fromDir");
        Path toDir = Paths.get("C:\\Users\\USER\\Desktop\\toDir");

        copyDirectory(fromDir,toDir);
    }

    
    /**
     * This method removes all files (but none of the directories) from a directory.
     * Be careful when testing it!
     * 
     * @param dir
     */
    public static void clearDirectory(Path dir) {
        try (Stream<Path> entries = Files.list(dir)) {
            List<Path> pathsList = entries.collect(Collectors.toList());
            for (Path aPath : pathsList) {
                if (Files.isRegularFile(aPath)) {
                    Files.delete(aPath);
                    System.out.println(">>> File ("+ aPath.getFileName() +") deleted");
                }
            }

            System.out.println(">>> [ALL FILES SUCCESSFULLY DELETED]");
        } catch (IOException exception) {
            System.out.println("Error processing file: " + exception);
        }
    }

    /**
     * Write a method  that removes all files and all subdirectories from a directory. 
     * Be very careful when testing it!
     * 
     * @param dir
     */
    public static void clearAllDirectories(Path dir) {
        try (Stream<Path> entries = Files.list(dir)) {
            List<Path> pathsList = entries.collect(Collectors.toList());
            for (Path aPath : pathsList) {
                if (Files.isRegularFile(aPath)) {
                    Files.delete(aPath);
                    System.out.println(">>> File ("+ aPath.getFileName() +") deleted");
                }

                if (Files.isDirectory(aPath)) {
                    clearAllDirectories(aPath);
                    Files.delete(aPath);
                    System.out.println(">>> Directory ("+ aPath.getFileName() +") deleted");
                }
            }

            System.out.println(">>> [DIRECTORY SUCCESSFULLY DELETED]");        
        } catch (IOException exception) {
            System.out.println("Error processing file: " + exception);
        }
    }

    /**
     * This method that copies all files and directories from one directory to another.
     * 
     * @param fromDir Source directory
     * @param toDir Target directory
     */
    public static void copyDirectory(Path fromDir, Path toDir) {
        try (Stream<Path> entries = Files.list(fromDir)) {
            List<Path> pathsList = entries.collect(Collectors.toList());

            for (Path aPath : pathsList) {

                if (Files.isRegularFile(aPath)) {
                    copyAFile(aPath.getFileName(), fromDir, toDir);
                }

                if (Files.isDirectory(aPath)) {
                    copyADirectory(aPath.getFileName(), fromDir, toDir);
                }
            }
            System.out.println(">>> ["+ fromDir.getFileName() +" files successfully copied]");
        } catch (IOException exception) {
            System.out.println("Error processing file: " + exception);
        }
    }
   
    /**
     * This method copies all files (but none of the directories) from one directory to another.
     * 
     * @param fromDir Source directory
     * @param toDir Target directory
     */
    public static void copyFiles(Path fromDir, Path toDir) {
        try (Stream<Path> entries = Files.list(fromDir)) {
            List<Path> pathsList = entries.collect(Collectors.toList());

            for (Path aPath : pathsList) {
                if (Files.isRegularFile(aPath)) {
                    copyAFile(aPath.getFileName(), fromDir, toDir);
                }
            }

            System.out.println(">>> [Files successfully copied]");
        } catch (IOException exception) {
            System.out.println("Error processing file: " + exception);
        }
    }
 
    /**
     * This method creates and copies one files from one subdirectory to another.
     * 
     * @param filename name of file
     * @param fromDir Source directory
     * @param toDir Target directory
     */
    private static void copyADirectory(Path filename, Path fromDir, Path toDir) {
        try {
            Path newDir = toDir.resolve(filename);
            Files.createDirectory(newDir);
            System.out.println(">>> Directory: ("+ newDir.getFileName() +") created/copied.");
            copyDirectory(fromDir.resolve(filename), newDir);

        } catch (IOException exception) {
            System.out.println("Error processing file: " + exception);
        }
    }

    /**
     * This method copies one file from one directory to another.
     * 
     * @param filename name of file
     * @param fromDir Source directory
     * @param toDir Target directory
     */
    private static void copyAFile(Path filename, Path fromDir, Path toDir) {
        try {
            if (Files.exists(toDir.resolve(filename))) {
                Files.delete(toDir.resolve(filename));
                System.out.println("File: ("+ filename +") deleted.");
            }
            
            Files.createFile(toDir.resolve(filename));
            Files.copy(fromDir.resolve(filename), toDir.resolve(filename), StandardCopyOption.REPLACE_EXISTING);
            System.out.println(">>> File: ("+ filename +") copied.");
            
        } catch (IOException exception) {
            System.out.println("Error processing file: " + exception);
        }
    }


    
}
