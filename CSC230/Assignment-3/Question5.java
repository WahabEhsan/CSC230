
package question5;

/**
 * This class converts a  decimal to a binary format.
 * @author WahabEhsan
 */
public class Question5 {

    /**
     * Runs the binary method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(binary(156));
    }
    
    /**
     * This method uses recursion to find the binary format of a decimal
     * @param decimal the decimal provided
     * @return the string value of the binary format of decimal.
     */
    public static String binary(int decimal){
        if(decimal == 0){
            return ""; //returns empty string when done
        }
        int quotient = decimal / 2;
        int remainder = decimal % 2;
        String strRemainder = "";
        if(remainder == 1){//sets the 1 or 0 to string of "1" or "0".
            strRemainder = "1";
        } else {
            strRemainder = "0";
        }
        return binary(quotient)+ strRemainder;//keeps adding the remainder and the rest of the binary number
    }
    
}
