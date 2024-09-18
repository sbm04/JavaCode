package thread.ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements  Runnable{
    private Store store;
    Semaphore productSemphore;
    Semaphore consumerSemphore;

    Producer(Store st, Semaphore productSemphore,
    Semaphore consumerSemphore){
        this.store=st;
        this.productSemphore=productSemphore;
        this.consumerSemphore=consumerSemphore;
    }
    @Override
    public void run() {
        while(true){
            try{
                productSemphore.acquire();
            }catch(InterruptedException e){
                throw  new RuntimeException(e);
            }

//                    System.out.println(" Cleared product check ");
                    store.addItem();
            consumerSemphore.release();


        }

    }
}
