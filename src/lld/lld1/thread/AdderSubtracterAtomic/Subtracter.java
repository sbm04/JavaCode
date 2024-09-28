package lld.lld1.thread.AdderSubtracterAtomic;

import java.util.concurrent.Callable;

public class Subtracter implements Callable<Void> {
    private Value v;

    Subtracter(Value v){
        this.v=v;

    }

    @Override
    public Void call() throws Exception {

        for(int i=1;i<=10000;i++){
            synchronized (this.v) {
                System.out.println(" Subtracter " + i);
                this.v.value.addAndGet(-i);
            }
        }

        return null;
    }
}
