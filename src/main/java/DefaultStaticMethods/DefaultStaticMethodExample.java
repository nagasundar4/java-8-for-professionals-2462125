package DefaultStaticMethods;

public class DefaultStaticMethodExample implements MyInterface{
    public static void main(String[] args) {
        DefaultStaticMethodExample example = new DefaultStaticMethodExample();
        example.defaultMethod();
        MyInterface.staticMethod();
    }
}
