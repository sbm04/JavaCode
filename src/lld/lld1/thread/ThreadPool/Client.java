package lld.lld1.thread.ThreadPool;

import lld.lld1.thread.numberPrint.HelloWorldPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Runnable h = new HelloWorldPrinter();

//        for(int i=0;i<100;i++){
//            Thread t = new Thread(h);
//            //t.run();
//            t.start();
//        }
//        for(int i=1;i<=1000000;i++){
//         NumberPrinter numberPrinter = new NumberPrinter(i);
//         Thread lld.lld1.thread = new Thread(numberPrinter);
//         //lld.lld1.thread.run();
//         lld.lld1.thread.start();
//        }

        //ExecutorService es = Executors.newFixedThreadPool(10 );
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=1;i<=10000;i++){
            if(i==80){
                continue;
            }
            NumberPrinter x1 = new NumberPrinter(i);
            es.execute(x1);
        }


    }


}

// Implementing Runnable vs Extending Thread Class
// Since you can inherit only 1 class, scope of extension is not there in 2nd Case
// Thread is also using runnable.
//Composition vs Inheritance

//run(); Can you return anything? NO: Callable
//ThreadPool : ExecutorService
// Multithreaded mergeSort