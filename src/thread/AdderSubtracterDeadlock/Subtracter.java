package thread.AdderSubtracterDeadlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtracter implements Callable<Void> {
    private Value v;
    private Lock lock1;
    private Lock lock2;
    Subtracter(Value v, Lock l1, Lock l2){
        this.v=v;
        this.lock1=l1;
        this.lock2=l2;
    }

    @Override
    public Void call() throws Exception {
        lock1.lock();
        lock2.lock();
        for(int i=1;i<=10000;i++){
            System.out.println(" Subtracter " + i);
            this.v.value-=i;
        }
        lock2.unlock();
        lock1.unlock();
        return null;
    }
}
