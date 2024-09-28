package lld.lld1.thread.AdderSubtracter;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder a = new Adder(v);
        Subtracter s= new Subtracter(v);
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Void>  futureAdder = es.submit(a);
        Future<Void>  futureSub = es.submit(s);

        futureAdder.get();
        futureSub.get();
        System.out.println(v.value);



    }
}
