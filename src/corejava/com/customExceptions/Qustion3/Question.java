package corejava.com.customExceptions.Qustion3;

public class Question {
    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            System.out.println(new int[]{1, 2, 3}[5]);  // Accessing an invalid index
            System.out.println(10 / 0);                // Division by zero
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!"); // Catches the first exception
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error!");         // Skipped because the first exception is already caught
        }

    }
}
