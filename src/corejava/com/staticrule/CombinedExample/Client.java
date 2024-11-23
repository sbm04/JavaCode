package corejava.com.staticrule.CombinedExample;

public class Client {
    public static void main(String[] args) {

        /*
        * Key Takeaways
            Static Methods: Directly accessed using the class name (ClassName.methodName()).
            Static Variables: Shared across all instances, modified globally.
            Static Classes: Independent nested classes, used for grouping or utility
        * */

        // Create objects of the Bank class
        new Bank();
        new Bank();
        System.out.println("Total Accounts: " + Bank.totalAccounts);

         Bank.showTotalAccounts();
         Bank.Helper helper = new Bank.Helper();
         helper.displayMessage();


    }
}
