package question6;

/**
 * This program reverses String using StringBuffer.
 *
 * @author WahabEhsan
 */
public class Question6 {

    /**
     * This Method runs the reverse method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(reverse("Wahab"));

    }

    /**
     * This method reverses the string using StringBuffer, which is an efficient
     * way and does it recursively.
     *
     * @param strB The stringBuffer that is passed in
     * @param str the string that is passed in the parameter to be reversed
     * recursively.
     * @param indx the index of the string to be reversed.
     * @return the reverse of the string
     */
    private static String reverseB(StringBuffer strB, String str, int indx) {
        if (indx < 0) {
            return "";
        }
        strB.append(str.charAt(indx));
        reverseB(strB, str, indx - 1);
        return strB.toString();
    }

    /**
     * This method reverse the string by calling reverseB.
     *
     * @param str the string that is passed in the parameter to be reversed
     * recursively
     * @return the reverse of the string when calling reverseB().
     */
    public static String reverse(String str) {
        return reverseB(new StringBuffer(), str, str.length() - 1);
    }

}
