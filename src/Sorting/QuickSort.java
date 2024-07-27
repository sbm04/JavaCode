package Sorting;

public class QuickSort {
    public static int patition(int l,int h, int arr[]){
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j){
            while(arr[i]<=  pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }
        int temp=arr[j];
        arr[j]=arr[l];
        arr[l]=temp;
        return j;
    }
    public static void quickSort(int arr[],int l,int h){
        if(l<h){
            int pivot=patition(l,h,arr);
            quickSort( arr,l,pivot-1);
            quickSort( arr,pivot+1,h);
        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 3, 1, 5, 7, 2,6};


        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(arr,0,arr.length-1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
