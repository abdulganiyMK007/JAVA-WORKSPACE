package chapter19;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdjacentDuplicates {

    public static List<String> findAdjacentDuplicates(Stream<String> stream) {
        String[] previous = {null};

        Predicate<String> isDuplicate = current -> {
            boolean isDuplicateO = current.equals(previous[0]);
            previous[0] = current;
            return isDuplicateO;
        };

        return stream.filter(isDuplicate)
                     .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "a", "b", "c", "c", "c", "d", "e", "e");
        List<String> duplicates = findAdjacentDuplicates(stream);
        System.out.println(duplicates); // Output: [a, c, c, e]
    }
}
