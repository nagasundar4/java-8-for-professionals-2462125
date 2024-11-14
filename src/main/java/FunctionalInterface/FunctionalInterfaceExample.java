package FunctionalInterface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello " + name);
        greeting.sayHello("John");
    }
}
