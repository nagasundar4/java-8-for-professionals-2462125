package DefaultStaticMethods;

public interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }
}
