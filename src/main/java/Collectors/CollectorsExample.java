package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike" );
        String result = names.stream().collect(Collectors.joining(", "));
        System.out.println( "Names: "  + result);
    }
}
