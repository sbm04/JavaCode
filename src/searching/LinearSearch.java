package searching;

public class LinearSearch {
    public static int linearSearch(int []array, int target){
        for(int i=0;i< array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 0, 1, 9};
        int target = 1;

        System.out.println("Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int result = linearSearch(array, target);

        if (result == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index " + result + ".");
        }

    }
}
