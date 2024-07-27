package searching;

public class BinarySearch {
    public static int binarySearch(int arr[], int k){
        int l=0;
        int h=arr.length-1;

        while(l<=h){
            int mid = l + (h - l) / 2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]<k){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int k = 10;

        int result = binarySearch(arr, k);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
