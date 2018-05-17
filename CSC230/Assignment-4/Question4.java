package question4;

import java.util.Arrays;

/**
 * Merge sort algorithm to sort an integer array
 *
 * @author WahabEhsan
 */
public class Question4 {

    /**
     * Main method runs the mergeSort method and tests it.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {4, 3, 10, 8, 1, 9};
        System.out.println(Arrays.toString(data));
        mergeSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    /**
     * This method merges the two subarays so it can be sorted
     *
     * @param A the array to be merged back
     * @param l left index of the array
     * @param m middle index of the array
     * @param r right index of the array
     */
    public static void merge(int A[], int l, int m, int r) {
        int size1 = m - l + 1;//sizes of two subarrays to be merged
        int size2 = r - m;
        int L[] = new int[size1];//temp arrays
        int R[] = new int[size2];
        for (int i = 0; i < size1; ++i) { //copies data to array
            L[i] = A[l + i];
        }
        for (int j = 0; j < size2; ++j) {//copies data to array
            R[j] = A[m + 1 + j];
        }
        int i = 0, j = 0;// Initial indexes of first and second subarrays so the can be merged.
        int k = l;
        while (i < size1 && j < size2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
        while (j < size2) {//copies the remaining elements if there is any left
            A[k] = R[j];
            j++;
            k++;
        }
        while (i < size1) {//copies the remaining elements if there is any left 
            A[k] = L[i];
            i++;
            k++;
        }

    }

    /**
     * Main function that calls itself recursivley to break array then merges to
     * sort them.
     *
     * @param A The Array to be sorted
     * @param l left most index of the array
     * @param r right most index of the array
     */
    public static void mergeSort(int A[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2; //mid
            mergeSort(A, m + 1, r);
            mergeSort(A, l, m);// Sort first and second halfs
            merge(A, l, m, r);// Merges the halfs
        }
    }
}
