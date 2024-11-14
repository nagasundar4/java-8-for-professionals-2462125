package BasicSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicSortingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 7, 4, 6, 9, 0);
        Collections.sort(numbers);
        System.out.println("Sorted in Ascending Order: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + numbers);

    }
}
