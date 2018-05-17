package question5;

/**
 * This is using the Sieve of Eratosthenes method to find all prime numbers.
 * @author WahabEhsan
 */
public class Question5 {

    public static void main(String args[]) {
        System.out.print(printArray(sieve(1000)));
    }

    /**
     * Uses boolean (instead of 1 and 0) to find all prime numbers
     * @param n the max value of numbers
     * @return all prime numbers before n
     */
    public static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n]; //creates boolean array with n length
        for (int i = 2; i < n / 2; i++) { //runs array half way of array
            if (prime[i] == false) { //if the element is false run a for loop
                for (int j = i; j < n; j++) { //runs through with i as starting
                    if ((j % i) == 0 && j != i) {//if i is a multiple of j then sets the element to true
                        prime[j] = true;
                    }
                }
            }

        }
        return prime; //returns all the false 
    }

    /**
     * Reads the array and adds up the array into a string
     *
     * @param data the array that is passed in
     * @return the line of array content
     */
    public static String printArray(boolean[] data) {
        String line = "";
        for (int i = 2; i < data.length; i++) {
            if (data[i] == false) {
                line += i + " ";
            }
        }
        return line;
    }
}
