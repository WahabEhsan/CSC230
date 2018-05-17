package question4;

/**
 * This program multiplies two matrices and then prints the 2d arrays.
 *
 * @author WahabEhsan
 */
public class Question4 {

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {1, 2, 3}, {1, 2, 3}};
        int[][] B = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        System.out.print(print(multiply(A, B)));
    }

    /**
     * Multiplies the 2d arrays and checks if able to.
     * @param A first 2d array
     * @param B second 2d array
     * @return multiplied array
     */
    public static int[][] multiply(int[][] A, int[][] B) {
        if(!checking(A, B)){
            return null;
        }
        int[][] finalArray = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    finalArray[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return finalArray;
    }
    /**
     * Checks if A and B equal
     * @param A first 2d array
     * @param B second 2d array
     * @return true if equal
     */
    public static boolean checking(int[][] A, int[][] B) {
       if(A.length != B.length || A.length == 0 || B.length == 0){
            return false; //returns false if arrays are not equal to each other.
        } 
       for(int i = 0; i < A.length; i++){
           if(A[i].length != B[i].length){
               return false;
           }
       }
       return true;
    }
    /**
     * Prints the 2d array
     * @param grid the array to be printed
     * @return String of printed array
     */
    public static String print(int[][] grid) {
        if(grid == null){
            return "Array not able to multiply";
        }
        String output = "";
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                output += grid[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }
}
