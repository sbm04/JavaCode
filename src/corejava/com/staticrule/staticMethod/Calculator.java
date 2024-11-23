package corejava.com.staticrule.staticMethod;

public class Calculator {

    /*1. Static Methods
    Static methods belong to the class, not any specific object.
    They can be called without creating an object of the class.
    They cannot directly access non-static (instance) members of the class.
    * */
    static int add(int a, int b) {
        return a + b;
    }
    int multiply(int a, int b) {
        return a * b;
    }

}
