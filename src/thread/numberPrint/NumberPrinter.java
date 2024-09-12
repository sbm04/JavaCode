package thread.numberPrint;

public class NumberPrinter implements Runnable{
    int number;
    public NumberPrinter(int n){
        this.number=n;
    }
    @Override
    public void run() {
        System.out.println(this.number+" "+Thread.currentThread().getName());
    }
}
