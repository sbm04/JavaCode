package corejava.com.staticrule.staticVariable;

public class Counter {
    static int counter = 0;
    public Counter() {
        counter++;
    }
    static int showCount(){
        return counter;
    }
}
