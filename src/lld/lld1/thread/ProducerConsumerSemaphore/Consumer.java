package lld.lld1.thread.ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Consumer(Store st,Semaphore producerSemaphore,
    Semaphore consumerSemaphore){
        this.store=st;
        this.consumerSemaphore=consumerSemaphore;
        this.producerSemaphore=producerSemaphore;
    }
    @Override
    public void run() {
        while(true){
            try{
                consumerSemaphore.acquire();
            }
            catch(InterruptedException e){
                throw new RuntimeException();
            }
             store.removeItem();
            producerSemaphore.release();

        }
    }
}
