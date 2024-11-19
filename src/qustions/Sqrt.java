package qustions;

public class Sqrt {
    public static int fun1(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            if(i*i<=n){
                ans=i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    public static int fun2(int n){
        int low=1;
        int high=n;
        int ans=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(fun1(10));
        int n=10;
        double ans=fun2(n);

        for(int i=9;i>=1;i--){
            double temp=ans+i*0.1;
            if(temp*temp<=n){
                ans=temp;
                break;
            }


        }
        for(int i=9;i>=1;i--){
            double temp=ans+i*0.01;
            if(temp*temp<=n){
                ans=temp;
                break;
            }
        }
        for(int i=9;i>=1;i--){
            double temp=ans+i*0.001;
            if(temp*temp<=n){
                ans=temp;
                break;
            }
        }
        System.out.println(ans);

                          //10
        //10 ---> 3 --->3.1 --->3.16----> 3.162

    }
}
