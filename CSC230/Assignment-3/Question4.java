package question4;

/**
 * This program reverses positive integers.
 *
 * @author WahabEhsan
 */
public class Question4 {

    /**
     * This Method runs the reverse method and prints the result
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(reverse(12045, 0));
    }

    /**
     * This method is a recursive method to return the reverse integer
     *
     * @param num the number that is given to be reversed
     * @param rev the value of the integer reversed.
     * @return returns the recursive method multiplying the so far reversed
     * number by ten and at the end returns the reversed value.
     */
    public static int reverse(int num, int rev) {
        if (num == 0) {
            return rev / 10;//divids by 10 so the reverse dont have another zero at the end.
        }
        int rest = num / 10;
        int last = num % 10;
        rev = rev + last;//adds the last number from digit to the multiplied reverse.

        return reverse(rest, 10 * rev);//recusivly returns the rest and multiplies reverse by 10 so last can be added.
    }
}
