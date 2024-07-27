package Sorting;

public class MergeSort {
    public static void merge(int s,int mid, int e,int arr[]){
        int p1=s;
        int p2=mid+1;
        int p3=0;
        int temp[] = new int[e-s+1];
        while(p1<=mid && p2<=e ){
           if(arr[p1] < arr[p2]){
              temp[p3++]=arr[p1++];
           }
           else{
               temp[p3++]=arr[p2++];
           }
        }
        while (p1<=mid){
            temp[p3++]=arr[p1++];
        }
        while (p2<=e){
            temp[p3++]=arr[p2++];
        }
        for(int i=0;i<=e-s;i++){
            arr[s+i]=temp[i];
        }
    }
    public static void mergeSort(int arr[],int s,int e){
        if(s==e){
            return;
        }
        int mid= (s+e)/2;

        mergeSort(arr, s,mid);
        mergeSort(arr,mid+1,e);
        merge(s,mid,e,arr);
    }
    public static void main(String[] args) {
        int[] arr = {4, 8, 3, 1, 5, 7, 2,6};


        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(arr,0,arr.length-1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
