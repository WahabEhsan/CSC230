package question6;

import java.util.Scanner;

/**
 * This program fills an array with random numbers after providing it with
 * number of rows and columns and then tells true or false if has consecutive
 * numbers
 *
 * @author WahabEhsan
 */
public class Question6 {

    /**
     * This is the main method where rows and columns number is asked and answer
     * is printed.
     *
     * @param args not used
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Rows : ");
        int m = input.nextInt();
        System.out.print("Columns : ");
        int n = input.nextInt();
        int[][] array = fillRandom(m, n);
        System.out.print(consecutive(array) + "\n" + print(array));
    }

    /**
     * This method prints the given array
     *
     * @param grid The 2D array given
     * @return The string value of the array
     */
    public static String print(int[][] grid) {
        String output = "";
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                output += grid[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }

    /**
     * This number is to be used to get the quarter of the array for the random
     * numbers.
     */
    public static final int QUARTER = 4;

    /**
     * This method returns an array filled with random numbers.
     *
     * @param m The maximum rows in the array
     * @param n The maximum columns in the array
     * @return the array filed with random numbers
     */
    public static int[][] fillRandom(int m, int n) {
        int[][] array = new int[m][n];
        double quarter = (m * n) / QUARTER;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * quarter);
            }
        }

        return array;
    }

    /**
     * This method checks if the array with random numbers has any four
     * consecutive numbers, diagonally, horizontally or vertically.
     *
     * @param array The array with the random numbers
     * @return The boolean value of true or false if number consecutive or not.
     */
    public static boolean consecutive(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    if (array[i][j] == array[i + 1][j] //checks right
                            && array[i + 1][j] == array[i + 2][j]
                            && array[i + 2][j] == array[i + 3][j]) {
                        return true;
                    } else if (array[i][j] == array[i][j + 1]//checks down
                            && array[i][j + 1] == array[i][j + 2]
                            && array[i][j + 2] == array[i][j + 3]) {
                        return true;
                    } else if (array[i][j] == array[i + 1][j + 1]//checks diagonal
                            && array[i + 1][j + 1] == array[i + 2][j + 2]
                            && array[i + 2][j + 2] == array[i + 3][j + 3]) {
                        return true;
                    } else if (array[i][j] == array[i - 1][j - 1]//checks reverse diagonal
                            && array[i - 1][j - 1] == array[i - 2][j - 2]
                            && array[i - 2][j - 2] == array[i - 3][j - 3]) {
                        return true;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    //for the consecutive checker going out of bound

                }
            }
        }
        return false;
    }

}
