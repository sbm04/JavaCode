package Sorting;

public class HeapSort {

    public static void heapify(int heap[], int  i ){
        int n=heap.length-1;
        while((2*i)+1<n){
            int y =Math.min(heap[i], heap[(2*i)+1]);
            int x=Math.min(y, heap[(2*i)+2]);
            if(x==heap[i]){
                break;
            }
            else if (x==heap[(2*i)+1]){
                int temp=heap[i];
                heap[i]=heap[(2*i)+1];
                heap[(2*i)+1]=temp;
                i=(2*i)+1;
            }
            else{
                int temp=heap[i];
                heap[i]=heap[(2*i)+2];
                heap[(2*i)+2]=temp;
                i=(2*i)+2;
            }


        }

    }
    // Method to implement heap sort
    public static void heapSort(int[] array) {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(array, i);
        }

    }
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        int n = array.length;

        System.out.println("Original array:");
        printArray(array);

        heapSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
