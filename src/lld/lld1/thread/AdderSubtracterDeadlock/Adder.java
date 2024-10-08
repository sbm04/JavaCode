package lld.lld1.thread.AdderSubtracterDeadlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock1;
    private Lock lock2;
    Adder(Value v, Lock l1, Lock l2){
        this.v=v;
        this.lock1=l1;
        this.lock2=l2;
    }

    @Override
    public Void call() throws Exception {
        lock2.lock();
        lock1.lock();
        for(int i=1;i<=10000;i++){
            System.out.println(" Adder " + i);
            this.v.value +=i;
        }
        lock2.unlock();
        lock1.unlock();
        return null;
    }
}
