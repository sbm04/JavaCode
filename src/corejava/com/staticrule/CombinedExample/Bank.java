package corejava.com.staticrule.CombinedExample;

public class Bank {


    // Static variable (shared by all objects)
    static int totalAccounts=0;
    Bank(){
        totalAccounts++;

    }
    // Static method
    static void showTotalAccounts(){
        System.out.println("showTotalAccounts: "+totalAccounts);
    }

    static class Helper{
         void displayMessage(){
            System.out.println("Helper for Bank operations.");
        }
    }

}
