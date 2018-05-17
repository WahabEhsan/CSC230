
package question3;

/**
 * This program tells if string palindrome recursively.
 * 
 * @author WahabEhsan
 */
public class Question3 {

    /**
     * Prints true or false depending if palindrome or not.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(palindrome("YaaaaY"));
    }
    
    /**
     * This method tells if string is palindrome by cutting the string and checking it recursively
     * @param word the String
     * @return The boolean value if recursive or not.
     */
    public static boolean palindrome(String word){
        if("".equals(word) || word.length() == 1){
            return true;
        }
        if(word.charAt(0) != word.charAt(word.length() - 1)){//checks begining and end
            return false; 
        }
        String newWord = word.substring(1, word.length() - 1);//cuts from begining and end
        palindrome(newWord);
     return true;   
    }
    
}
