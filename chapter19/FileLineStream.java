package chapter19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileLineStream {
    public static void main(String[] args) throws IOException {
        String findWord = "the";
        String filename = "einstein_summary.txt";

        groupWordsByFirstLetter(filename);
        groupWordsbylength(filename);
        findAnyPalindromeWord();
        maxVowel(filename);

        printWordOfLength(filename, 4);

        Long count1 = countWordInFile(filename, findWord);
        System.out.println(count1);
        long count2 = countWordInLine(filename, findWord);
        System.out.println(count2);

        printLineWordFound(filename, findWord);
    }

    
    private static void groupWordsByFirstLetter(String filename) {
        List<String> wordList = new ArrayList<>();
        try (Scanner in = new Scanner(new File(filename), "UTF-8");) {
            while (in.hasNext()) {
                wordList.add(in.next());
            }
            in.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<String, Double> maplength = wordList.stream()
            .map(w -> w.toLowerCase())
            .collect(Collectors.groupingBy(
                w -> w.substring(0, 1), 
                Collectors.averagingDouble(w -> w.length())));

        for (String key : maplength.keySet()) {
            // System.out.println("KEY: "+ key);
            System.out.printf("%10s%5.2f", "KEY: "+ key +", L: ", maplength.get(key));
            System.out.println();
        }
    }


    private static void groupWordsbylength(String filename) {
        List<String> wordList = new ArrayList<>();
        try (Scanner in = new Scanner(new File(filename), "UTF-8");) {
            while (in.hasNext()) {
                wordList.add(in.next());
            }
            in.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<Integer, Set<String>> maplength = wordList.stream()
            .collect(Collectors.groupingBy(
                w -> w.length(), Collectors.toSet()));

        for (Integer key : maplength.keySet()) {
            System.out.println("KEY: "+ key);
            System.out.println(maplength.get(key));
        }
    }

    private static void findAnyPalindromeWord() {
        List<String> wordList = new ArrayList<>();
        try (Scanner in = new Scanner(new File("words.txt"), "UTF-8");) {
            while (in.hasNext()) {
                wordList.add(in.next());
            }
            in.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Stream<String> p = wordList.stream()
            .parallel()
            .filter(w -> isPalindrome(w))
            .filter(w -> w.length() >= 4);
            // .findAny()
            // .orElse("NONE");

        List<String> s = p.collect(Collectors.toList());
        for (String string : s) {
            System.out.println(string);
        }

        // System.out.println(p);
    }

    private static int maxVowel(String filename) {
        List<String> wordList = new ArrayList<>();
        try (Scanner in = new Scanner(new File(filename));) {
            while (in.hasNext()) {
                wordList.add(in.next());
            }
            in.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String vowelMaxLength = wordList.stream()
            .map(w -> w.toLowerCase())
            .map(w -> w.replaceAll("[b-df-hj-np-tv-z0-9]", ""))
            .max((v, w) -> v.length() - w.length())
            .orElse("");

        System.out.println("MAX VOWEL: "+ vowelMaxLength +", LENGTH: "+ vowelMaxLength.length());
        return vowelMaxLength.length();
    }

    private static void printWordOfLength(String filename, int length) throws IOException {
        File inputFile = new File(filename);
        Scanner in = new Scanner(inputFile);
        List<String> wordList = new ArrayList<>();

        while (in.hasNext()) {
            wordList.add(in.next());
        }
        in.close();

        wordList.stream()
                .filter(w -> w.length() <= length)
                .distinct()
                .forEach(w -> System.out.println(w));
                
    }

    private static Long countWordInFile(String filename, String findWord) throws IOException {
        Long count;
        try (Stream<String> lineStream = Files.lines(Paths.get(filename))) {
            Stream<String> words = lineStream.flatMap(
                line -> Arrays.stream(line.split("\\s+")));

            count = words.filter(w -> w.equals(findWord))
            .count();
        }

        return count;
        
    }

    private static long countWordInLine(String filename, String findWord)  throws IOException {
        long count = 0;
        try (Stream<String> lineStream = Files.lines(Paths.get(filename))) {
            count = lineStream.filter(w -> w.contains(findWord))
            .count();
        }

        return count;
    }

    private static void printLineWordFound(String filename, String findWord)  throws IOException {
        try (Stream<String> lineStream = Files.lines(Paths.get(filename))) {
            lineStream.filter(w -> w.contains(findWord))
            .forEach(w -> System.out.println(">>> " + w));
        }
    }

    private static boolean isPalindrome(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result = word.charAt(i) + result;
        }

        // System.out.println(word +"-"+ result +" => "+ word.equals(result));

        return word.equals(result);
    }
}
