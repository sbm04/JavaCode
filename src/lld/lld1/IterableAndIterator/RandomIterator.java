package lld.lld1.IterableAndIterator;

import java.util.Iterator;

public class RandomIterator  implements Iterator<Integer> {
    int index;
    Numbers numbers;
    public RandomIterator(Numbers numbers) {
        index = 0;
        this.numbers = numbers;

    }

    @Override
    public boolean hasNext() {
        while(index<numbers.numlist.size()){
            if(numbers.numlist.get(index)%5==0){
                return true;
            }
            index++;
        }
        return  index!=numbers.numlist.size();
    }

    @Override
    public Integer next() {
        return numbers.numlist.get(index++);
    }
}
