package lld.lld1.thread.ProducerConsumer;

import java.util.*;

public class Store {
    private int maxSize;
    private List<Object> items;
    Store(int maxSize){
        this.maxSize=maxSize;
        this.items= new ArrayList<>();
    }
    public int getMaxSize(){
        return maxSize;
    }
    public List<Object> getItems(){

        return items;

    }
    public void addItem(){
        System.out.println("Producer production time, current size" + this.items.size() );
        this.items.add(new Object());
       // System.out.println("Producer production time, current size" + this.items.size() );
    }
    public void removeItem(){
        System.out.println("Cunsumer consumming time, current size" + this.items.size() );
        this.items.remove(this.items.size()-1);
    }
}
