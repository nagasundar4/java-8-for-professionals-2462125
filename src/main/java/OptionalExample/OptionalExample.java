package OptionalExample;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.empty();
        System.out.println(optionalName.orElse("John Doe"));
    }

}
