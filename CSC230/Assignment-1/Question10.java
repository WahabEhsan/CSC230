package question10;


/**
 *This program uses Monte Carlo methods to show how to approximate pi.
 * @author WahabEhsan
 */
public class Question10 {

    /**
     * This method is used to print the answer of pi.
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Approximation of PI : " + formula());
    }

    /**
     * This constant is for the max number of points. 
     */
    public static final int MAX = 1000;

    /**
     * This method is used to fill random numbers in the array for coordinates
     * @param x X coordinates
     * @param y Y coordinates
     * @return array filled with random numbers
     */
    public static double[][] fillRandom(int x, int y) {
        double[][] array = new double[x][y];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                double random = (Math.random());
                array[i][j] = random;
            }
        }

        return array;
    }

    /**
     * This method calls two fillRandom for X and Y coordinates and sees if
     * points inside the circle.
     * @return the amount of points inside the circle.
     */
    public static int circle() {
        int counter = 0;
        double[][] x = fillRandom(MAX, MAX);
        double[][] y = fillRandom(MAX, MAX);
        double circleFormula;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                circleFormula = (x[i][j] * x[i][j]) + (y[i][j] * y[i][j]);
                if (circleFormula <= 1) {
                    counter++;
                }
            }
        }
        return counter;

    }

    /**
     * This is the formula Monte Carlo methods gave us to find pi.
     * @return The Approximate value of pi.
     */
    public static double formula() {
        double cirlcePoints = circle();
        double piValue = 4 * (cirlcePoints/(MAX * MAX));
        return piValue;
    }
}
