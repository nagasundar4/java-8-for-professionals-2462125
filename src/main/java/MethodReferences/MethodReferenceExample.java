package MethodReferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike" );
        names.forEach(System.out::println);
    }
}
