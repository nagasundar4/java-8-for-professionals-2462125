package StreamExample;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike" );
        names.stream().filter(name -> name.startsWith("M"))
                      .map(name -> name + " student")
                      .forEach(System.out::println);
    }
}
