package Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            Boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            // If no two elements were swapped in the inner loop, then break
            if(swapped==false){
                break;
            }
        }

    }
    public static void main(String[] args) {

        int[] arr = {4, 8, 3, 1, 5, 7, 2,6};


        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
