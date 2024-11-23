package corejava.com.staticrule.staticMethod;

public class Client {
    public static void main(String[] args) {
        System.out.println(Calculator.add(2,5));
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(2,5));

    }
}
