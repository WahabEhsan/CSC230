package question9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program gets unlimited inputs and stores them in an array.
 *
 * @author WahabEhsan
 */
public class Question9 {

    /**
     * This method runs the getString method and prints the array that is given.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.print(Arrays.toString(getStrings()));
    }

    /**
     * This method asks for input until null input given and calls resize method
     * as the loop for input goes to store the string in n array.
     *
     * @return The string array after the user hits enter.
     */
    static String[] getStrings() {
        Scanner input = new Scanner(System.in);
        String[] words = new String[0];
        String line;
        do {
            line = input.nextLine();
            if (line.length() == 0) {
                break;
            }
            words = resize(words, words.length + 1);
            words[words.length - 1] = line;
        } while (line.length() != 0);

        return words;
    }

    /**
     * This method resizes the old array by adding one more slot at the end.
     *
     * @param array The array with string value that has to be resized
     * @param newSize the size of the array for the new array.
     * @return the string array with an empty slot for adding more string to it.
     */
    static String[] resize(String[] array, int newSize) {
        String[] newArray = new String[newSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
