package Sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n =arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int s=i-1;
            while(s>=0 && arr[s] > temp){

                    arr[s+1] =arr[s];


                s--;
            }
            arr[s+1]=temp;


        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 3, 1, 5, 7, 2,6};


        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
