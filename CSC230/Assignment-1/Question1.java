package question1;


import java.util.Scanner;

/**
 * This programs separates each digits given by a tab.
 *
 * @author WahabEhsan
 */
public class Question1 {

    /**
     * This is the main method that has a scanner and passes in integer to
     * Separator method to get answer that is printed.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digits = input.nextInt();  
        System.out.print(Separator(digits));
    }

    /**
     *Max size of the digit.
     */
    public static final int maxSizeOfDigit = 99999;
    /**
     * This constant tells the number of digits that are going to be separated.
     */
    public static final int numberOfDigits = 5;
    /**
     * This Constant is used when decrementing the the divider so it corresponds
     * the number.
     */
    public static final int decrement = 10;
    /**
     * This constant is the starting value of the divisor so the digits can be
     * separated and is decremented by the constant decrement.
     */
    public static int divider = 100000;

    /**
     * This method separates, the digits given, by a tab and are in the same
     * order as given.
     *
     * @param digits The numbers given to be separated
     * @return The String value of the answer as they are all combined integers.
     */
    public static String Separator(int digits) {
        if (digits < maxSizeOfDigit) {
            String answer = "";
            int temp;
            for (int i = 0; i < numberOfDigits; i++) {
                divider = divider / decrement;//decrements the divider according to the number of digits
                temp = digits / divider;
                answer += temp + "\t";
                digits = digits - temp * divider;//subtracts the first number in the digit after setting it to answer variable
            }
            return answer;
        } else {
            return "Not valid digit";
        }
    }
}
