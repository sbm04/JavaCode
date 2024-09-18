package thread.ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
    //private List<Object> items;
    private ConcurrentLinkedQueue<Object> items;
    Store(int maxSize){
        this.maxSize=maxSize;
        this.items= new ConcurrentLinkedQueue<>();
    }
    public int getMaxSize(){
        return maxSize;
    }
    public ConcurrentLinkedQueue<Object> getItems(){

        return items;

    }
    public void addItem(){
        System.out.println("Producer production time, current size" + this.items.size() );
        this.items.add(new Object());
       // System.out.println("Producer production time, current size" + this.items.size() );
    }
    public void removeItem(){
        System.out.println("Cunsumer consumming time, current size" + this.items.size() );
        this.items.remove();
    }
}
