package lld.lld1.IterableAndIterator;

import java.util.*;
public class Numbers implements  Iterable<Integer> {
    List<Integer> numlist;
    public Numbers(List<Integer> list){
        this. numlist=list;
    }

    @Override
    public Iterator<Integer> iterator() {
//        //first way
//        Iterator<Integer> rr =  new RandomIterator(this);
//        return rr;
                //second way
           Iterator<Integer> rr = new Iterator<Integer>() {
            int index = 0;

//            @Override
            public boolean hasNext() {
//                return index < list.size();
                while (index < numlist.size()) {
                    if (numlist.get(index) % 2 == 0) {
                        return true;
                    }
                    index++;
                }
                return index != numlist.size();
            }

            @Override
            public Integer next() {
                return numlist.get(index++);
            }

    };


        return rr;
    }
}
