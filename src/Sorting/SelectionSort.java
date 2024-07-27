package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]< arr[min_index]){
                    min_index=j;
                }

            }
            int temp =arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }

    }
    public static void main(String[] args) {
        int[] arr = {4, 8, 3, 1, 5, 7, 2,6};


        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
