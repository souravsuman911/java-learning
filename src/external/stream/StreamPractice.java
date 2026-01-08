package external.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        // Convert a List<Integer> into a List<Integer> containing only even numbers using Stream API.
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integers = integers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(integers);

        // Given a List<String>, convert all strings to uppercase.
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        fruits = fruits.stream()
                .map(fruit -> fruit.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(fruits);

        // Count how many numbers in a list are greater than 50.
        List<Integer> integerList = Stream.generate(() -> (int) (Math.random() * 100))
                .limit(100)
                .collect(Collectors.toList());

        int countG50 = integerList.stream().filter(n -> n > 50).count();




    }
}
