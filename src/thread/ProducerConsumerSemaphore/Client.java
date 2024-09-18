package thread.ProducerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Semaphore producerSemphore = new Semaphore(5);
        Semaphore consumerSemphore = new Semaphore(0);

        ExecutorService es = Executors.newCachedThreadPool();
        Store store = new Store(5);
        for(int i=1;i<=8;++i){
            es.execute(new Producer(store,producerSemphore,consumerSemphore));
        }
        for(int i=1;i<=20;++i){
            es.execute(new Consumer(store,producerSemphore,consumerSemphore));
        }
    }
}
