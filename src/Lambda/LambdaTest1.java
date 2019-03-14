package Lambda;

@FunctionalInterface
interface LambdaFunction {
    void call();
}

public class LambdaTest1 {
    public static void main(String[] args) {
        LambdaFunction function = () -> System.out.println("Hello World");
        function.call();
    }
}
