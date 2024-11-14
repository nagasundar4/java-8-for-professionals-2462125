package ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class CreateStreams {
    public static void main(String[] args) {
        String[] names = { "Adnan", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike" };
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        // create stream based on array
        Stream<String> arrayStream = Arrays.stream(names);

        // filter
        arrayStream.filter(s -> s.startsWith("M")).forEach(System.out::println);
        // create stream based on collection
        Stream<String> listStream = nameList.stream();

        // map
        listStream.map(s -> s + " student").forEach(System.out::println);

        // create stream using generate method
        Stream<Integer> generateStream = Stream.generate(() -> 5);
        generateStream.limit(5).forEach(System.out::println);
        // create stream using iterate method
        Stream<Integer> iterateStream = Stream.iterate(1, x -> x + 2);
        iterateStream.limit(5).forEach(System.out::println);
    }
}
