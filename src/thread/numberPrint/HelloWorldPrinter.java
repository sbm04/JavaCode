package thread.numberPrint;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Hello World");

    }
}
