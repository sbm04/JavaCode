package interview;

public class FindingSubString {
    public static boolean isSubstring(String main, String sub){
        return main.matches("(.*)" + sub + "(.*)");

    }
    public static boolean isSubstring1(String main, String sub){
        return main.contains(sub);

    }
    public static boolean isSubstring2(String main, String sub){
        return main.indexOf(sub)!=-1;

    }

    public static void main(String[] args) {
        System.out.println(isSubstring("My name is Shubham Bharti " , "Shubham"));
        System.out.println(isSubstring1 ("My name is Shubham Bharti " , "Shubham"));

    }
}
