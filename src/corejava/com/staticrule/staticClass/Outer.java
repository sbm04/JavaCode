package corejava.com.staticrule.staticClass;
   /*
     3. Static Classes
        Static classes are nested classes declared as static inside another class.
        They do not require an instance of the outer class to be instantiated.
        Useful for grouping related classes together.
   * */
public class Outer {
    static class Inner {
        void display() {
            System.out.println("Inside display method");
        }
    }
}
