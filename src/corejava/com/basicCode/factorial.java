package corejava.com.basicCode;

import java.util.Scanner;

public class factorial {
    public static int factorial(int n) {
        int fact =1;
        for(int i=1;i<=n;i++){
            fact= fact*i;
        }
        return fact;
    }
    public static int fact(int n) {
        if(n==1){
            return 1;
        }

        return fact(n-1)+fact(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(fact(n));

    }
}
