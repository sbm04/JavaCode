package lld.lld1.thread.AdderSubstractorSyncBlock;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;

    Adder(Value v){
        this.v=v;

    }

    @Override
    public Void call() throws Exception {

        for(int i=1;i<=10000;i++){
            synchronized (this.v){
                System.out.println(" Adder " + i);
                this.v.value +=i;
            }

        }

        return null;
    }
}
