package interview;

public class PrintEvenOdd {
    private int counter = 1;
    private final int limit = 50;

    public void printEven() {
        synchronized (this) {
            while (counter < limit) {
                while (counter % 2 == 1) {  // Wait until it's even
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Even: " + counter);
                counter++;
                notify();
            }
        }
    }
    public void printOdd() {
        synchronized (this) {
            while (counter < limit) {
                while (counter % 2 == 0) {  // Wait until it's odd
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Odd: " + counter);
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        PrintEvenOdd peo = new PrintEvenOdd();

        Thread t1 = new Thread(() -> peo.printEven());
        Thread t2 = new Thread(() -> peo.printOdd());

        t1.start();
        t2.start();

    }
}
