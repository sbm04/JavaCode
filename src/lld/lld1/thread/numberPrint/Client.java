package lld.lld1.thread.numberPrint;

public class Client {
    public static void main(String[] args) {
//        HelloWorldPrinter h = new HelloWorldPrinter();
//        for(int i=0;i<100;i++){
//            Thread th= new Thread(h);
//             th.start();
//
//        }

        for(int i=0;i<100;i++){
            NumberPrinter n = new NumberPrinter(i);
            Thread th  = new Thread(n);
            th.start();

        }
    }

    // Implementing Runnable vs Extending Thread Class
    // Since you can inherit only 1 class, scope of extension is not there in 2nd Case
    // Thread is also using runnable.
    //Composition vs Inheritance

    //run(); Can you return anything? NO: Callable
    //ThreadPool : ExecutorService
    // Multithreaded mergeSort
}
