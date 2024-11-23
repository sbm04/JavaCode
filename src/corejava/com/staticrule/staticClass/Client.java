package corejava.com.staticrule.staticClass;

public class Client {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.display();
    }
}
