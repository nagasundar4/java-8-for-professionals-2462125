package ParallelStreams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = numbers.parallelStream()
                    .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
