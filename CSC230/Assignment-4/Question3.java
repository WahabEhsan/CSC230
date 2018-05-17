
package question3;

import java.util.Arrays;

/**
 * This program uses insertion Sort to sort an array of integers
 * @author WahabEhsan
 */
public class Question3 {

    /**
     * test the insertion sort algorithm
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {4, 3, 10, 8, 1, 9};
        System.out.println(Arrays.toString(data));
        insertionSort(data);
        System.out.println(Arrays.toString(data));
    }

    /**
     * This is the insertion sort algorithm. 
     * @param A the array to be sorted
     * @return Sorted array
     */
    public static int[] insertionSort(int[] A) {
        int key;
        int i;
        int temp;
        for (int j = 1; j < A.length; j++) {
            key = A[j];
            i = j - 1;
            while (i >= 0 && A[i] >= key) {
                temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;
                i--;
            }
        }
        return A;
    }
}
