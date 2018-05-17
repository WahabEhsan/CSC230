package question2;

import java.util.Arrays;

/**
 * Algorithm for a selection sort.
 * @author WahabEhsan
 */
public class Question2 {

    /**
     * Test the algorithm for selection sort
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {4, 3, 10, 8, 2, 9};
        System.out.println(Arrays.toString(data));
        selectionSort(data);
        System.out.println(Arrays.toString(data));

    }

    /**
     * Algorithm for selection sort which uses swap method.
     * @param A The array to be sorted
     * @return the sorted array
     */
    public static int[] selectionSort(int[] A) {
        int min;
        for (int j = 0; j < A.length; j++) {
            min = j;
            for (int i = j; i < A.length; i++) {
                if (A[min] > A[i]) {
                    min = i;
                }
            }
            swap(A,j,min);
        }
        return A;
    }

    /**
     * This method swaps two values in an array
     *
     * @param A the array that is passed in
     * @param first the first index that is going to swap
     * @param second second index to be swapped
     */
    public static void swap(int[] A, int first, int second){
        int temp;
        temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }
    
}
