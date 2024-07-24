package chapter19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) throws IOException  {

        words();
        String option = longestContain("an");
        System.out.println(option);

        smallestProperDivisor(11);
        
    
    }


    public static void smallestProperDivisor(int n) {
        Optional<Integer> min = Stream.iterate(2, i -> i + 1)
            .limit(n)
            .filter(w -> n % w == 0)
            .min((v, w) -> v - w);

        System.out.println(min.get());
        // return Optional.of(min.isPresent() ? min.get() : 0);
    }

    private static String longestContain(String findWord) throws IOException {
        String option;
        try (Stream<String> lineStream = Files.lines(Paths.get("einstein_summary.txt"))) {
            Stream<String> words = lineStream.flatMap(
                line -> Arrays.stream(line.split("\\s+")));

                option = words.filter(w -> w.contains(findWord))
                .max((v, w) -> v.length() - w.length())
                .orElse("None");
        }

        return option;
    }

    private static void words() {
        String[] words = {"May", "you", "not", "be", "scam"};

        Stream.of(words).map(w -> w.substring(0, 1) +"..."+ w.substring(w.length() - 1))
        .forEach(w -> System.out.println(w));
    }

    public static <T> String toString(Stream<T> stream, int n) {
        // String str = stream.collect(Collectors.joining(", "));
        String str = stream.map(w -> w.toString())
            .collect(Collectors.joining(", "));

        return str;
    }
    


    
}
