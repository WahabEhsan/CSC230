package question5;

import java.util.Arrays;

/**
 * Quick sort algorithm to sort an integer array
 *
 * @author WahabEhsan
 */
public class Question5 {

    /**
     * Calls the quick sort method and prints the array.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {4, 3, 10, 8, 1, 9};
        System.out.println(Arrays.toString(data));
        quickSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    /**
     * Uses quick sort to sort the array.
     *
     * @param A the array to be sorted
     * @param p the most left index
     * @param r the most right index
     * @return the sorted array
     */
    public static int[] quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
        return A;
    }

    /**
     * Swaps two indexes in array
     *
     * @param A the array content
     * @param first the first index to be swapped
     * @param second the second index to be swapped with first
     */
    public static void swap(int[] A, int first, int second) {
        int temp;
        temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

    /**
     * Parts the array into two for sorting
     *
     * @param A The array passed in
     * @param p the left most index
     * @param r the right most index or the pivot
     * @return the value to be parted at
     */
    public static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1; // index of smaller element
        for (int j = p; j < r; j++) {
            // If current element is <= equal to pivot
            if (A[j] <= x) {
                i = i + 1;
                // swap A[i] and A[j]
                swap(A, i, j);
            }
        }
        // swap A[i+1] and A[r]
        swap(A, i + 1, r);
        return i + 1;
    }
}
