package qustions;

public class Sqt {

    public static double findSqt(int num){
        if(num<2){
            return num;
        }
        double y=num;
        double d= (y+(num/y))/2;
        while(Math.abs(d-y)>=0.001){
            y=d;
            d=(y+(num/y))/2;
        }
        return d;
    }
    public static void main(String[] args) {
        System.out.println(findSqt(10));

    }
}
