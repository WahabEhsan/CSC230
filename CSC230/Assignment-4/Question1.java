package question1;

import java.util.Arrays;

/**
 * Algorithm for a bubble sort.
 * @author WahabEhsan
 */
public class Question1 {

    /**
     * Test the algorithm for selection sort
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {7, 3, 4, 8, 9, 19};
        System.out.println(Arrays.toString(data));
        bubbleSort(data);
        System.out.println(Arrays.toString(data));

    }

    /**
     * Bubble sort algorithm enhanced with a boolean so it wont repeatedly loops through sorted array 
     * @param A array to be sorted
     * @return the sorted array
     */
    public static int[] bubbleSort(int[] A){
        boolean done = true;
        for(int i = 0;i < A.length;i++){
            for(int j = 0;j < A.length-i-1;j++){
                if(A[j] > A[j+1]){
                 swap(A, j, j+1);
                 done = false;//false if need had to sort
                }
            }
            if(done){
                break; //break if the loop sorted none
            }
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
