// StopWatch timer = new StopWatch();
// timer.start();
// ShellSorter.sort(a);
// timer.stop();
// System.out.println("Elapsed time with Shell sort: "
// + timer.getElapsedTime() + " milliseconds");
// timer.reset();

package chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetTimer {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("book-war-and-peace.txt")); 
        hashSetRead(in);
        treeSetRead(in);
    }

    /**
     * Times the results of inserting all words 
     * from a large file into a hash set. 
     * 
     * @param in Scanner of the large file
     */
    private static void hashSetRead(Scanner in) {
        Set<String> hashSet = new HashSet<>();
        String word = "";

        StopWatch timer = new StopWatch();
        timer.start();
        while (in.hasNext()) {
            word = in.next();
            hashSet.add(word);
        }
        timer.stop();
        System.out.println("Elapsed time with Hash set: "
                                + timer.getElapsedTime() + " milliseconds");
        timer.reset();
    }

     /**
     * Times the results of inserting all words 
     * from a large file into a tree set. 
     * 
     * @param in Scanner of the large file
     */
    private static void treeSetRead(Scanner in) {
        Set<String> treeSet = new TreeSet<>();
        String word = "";

        StopWatch timer = new StopWatch();
        timer.start();
        while (in.hasNext()) {
            word = in.next();
            treeSet.add(word);
        }
        timer.stop();
        System.out.println("Elapsed time with Tree set: "
                                + timer.getElapsedTime() + " milliseconds");
        timer.reset();
    }

    
}