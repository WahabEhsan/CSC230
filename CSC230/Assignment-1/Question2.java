package question2;


import java.util.Scanner;

/**
 * This program is a Quadratic equation solver.
 *
 * @author WahabEhsan
 */
public class Question2 {

    /**
     * This method passes in parameters to the quadraticEquation method and
     * prints the answer.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A, B, C? ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(quadraticEquation(a, b, c));
    }

    /**
     * This method computes the quadratic equation by taking three parameters.
     *
     * @param a The a in the quadratic equation
     * @param b The b in the quadratic equation
     * @param c The c in the quadratic equation
     * @return The string value of if the roots exist or not and the root(s).
     */
    public static String quadraticEquation(int a, int b, int c) {
        double sqrt = (b * b) - (4 * a * c);
        if (a == 0) {
            return "\"a\" cannot be 0";
        } else if (sqrt < 0) {
            return "No real roots";
        } else if (sqrt > 0) {
            double r1 = (-b + Math.sqrt(sqrt)) / (2 * a);//The addition 
            double r2 = (-b - Math.sqrt(sqrt)) / (2 * a);//The subtraction
            return "Roots : " + r1 + " and " + r2;
        } else {
            double r = (-b) / (2 * a); //Since sqrt will be 0 no need to put it in
            return "Root : " + r;
        }
    }
}
