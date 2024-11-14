package ComplicatedSorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComplexSortingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 30, "New York"),
                new Person("Jane", 25, "Los Angeles"),
                new Person("Jack", 35, "San Francisco"),
                new Person("Jill", 40, "Toronto")
        );

        people.sort(Comparator.comparingInt(Person::getAge)
                .thenComparing(Person::getCity).thenComparing(Person::getName));
        System.out.println("Sorted List:");
        people.forEach(System.out::println);
    }
}
