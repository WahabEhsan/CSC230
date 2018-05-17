
package question2;

/**
 * This class uses recursion to find length of a string.
 * @author WahabEhsan
 */
public class Question2 {

    /**
     * Prints the length of string.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(length("QuestionOneIsDone"));
    }
    
    /**
     * This Method recursively finds length of a String
     * @param word the string given
     * @return the value zero if word is empty string or returns the recursive
     * method length with new parameter plus one.
     */
    public static int length(String word){
        if("".equals(word)){//checks if the word is empty
            return 0;
        }
        String newWord = word.substring(1);//cuts the first letter of the word and sets it to different variable
        return 1 + length(newWord); //returns the recursice of the newWord plus one for length
    }
}
