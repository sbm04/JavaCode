package corejava.com.staticrule.staticVariable;

public class Client {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        //System.out.println(counter1.counter);
        System.out.println(Counter.showCount());
    }
}
