package question7;

import java.util.Scanner;

/**
 * This program depicts an alligator eating ducks in a organized manner, after
 * inputing number of ducks and the order, it prints the order the ducks will be
 * eaten.
 *
 * @author WahabEhsan
 */
public class Question7 {

    /**
     * This method provides the input for the duck method.
     *
     * @param args not used
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many ducks? ");
        int ducks = input.nextInt();
        System.out.print("In what order? ");
        int order = input.nextInt();
        System.out.print(duck(ducks, order));
    }

    /**
     * This method runs a loop around an array until all ducks are eaten, then
     * returns the answer.
     *
     * @param duckNumber The max number of ducks
     * @param order The order of number the alligator will eat
     * @return String value of the answer as the order of duck to be eaten.
     */
    public static String duck(int duckNumber, int order) {
        if (duckNumber < 0 || order < 0) {//negative input check
            return "Invalid input";
        }
        boolean[] ducks = new boolean[duckNumber + 1];
        boolean loop = true;//for the while loop
        String theOrder = "";
        int totalCounter = 0;//to conclude the loop
        int counter = 0;//to be able to start counting again from begining 
        while (loop) {
            for (int i = 1; i < ducks.length; i++) {
                counter++;
                if (ducks[i] == true) {
                    counter--;
                }
                if (ducks[i] == false && counter == order) {
                    theOrder += i + " ";
                    ducks[i] = true;
                    counter = 0;
                    totalCounter++;
                }
                if (totalCounter == duckNumber) {
                    loop = false;
                }
            }
        }
        return theOrder;
    }
}
