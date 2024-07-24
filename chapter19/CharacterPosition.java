package chapter19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class CharacterPosition {

    public static void main(String[] args) {
        String line = "This method returns a list of all positions of a given character in a string";
        char ch = 'a';

        System.out.println("// Using Loop");
        charPositionUsingLoop(line, ch);

        System.out.println("// Using Stream");
        charPositionUsingStream(line, ch);
        
        
    }

    /**
     * This method returns a list of all positions of a given character in a string.
     * 
     * @param line
     * @param ch 
     * @return a list of all positions of a given character in a string
     */
    private static List<Integer> charPositionUsingStream(String line, char ch) {
        List<Integer> positions = IntStream.range(0, line.length())
                        .filter(i -> line.charAt(i) == ch)
                        .boxed()
                        .collect(Collectors.toList());

        positions.stream().forEach(System.out::println);

        return positions;
    }
    

    /**
     * This method returns a list of all positions of a given character in a string.
     * 
     * @param line
     * @param ch 
     * @return a list of all positions of a given character in a string
     */
    private static List<Integer> charPositionUsingLoop(String line, char ch) {
        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) positions.add(i); 
        }

        positions.stream()
            .forEach(System.out::println);

         return positions;
    }
    
}



