package bigrationaltest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This is a test class to test BigRational class
 */
public class BigRationalTest {

    public static void main(String[] args) {
        BigRational br1 = new BigRational(BigInteger.ONE, BigInteger.TEN);
        System.out.println(br1.toString());
        
        BigRational br2 = new BigRational("1/0");
        System.out.println(br2.toString());
        
        BigRational br3 = new BigRational("-1/0");
        System.out.println(br3.toString());
        
        BigRational result = (new BigRational("2/10")).multiply(new BigRational("2/5"));
        System.out.println(result.toString());
        
        BigRational br4 = new BigRational("0/0");
        System.out.println(br4.toString());
     
        ArrayList<BigRational> arraylist = new ArrayList<>();
        arraylist.add(new BigRational("1/3"));
        arraylist.add(new BigRational("1/5"));
        arraylist.add(new BigRational("1/8"));
        arraylist.add(new BigRational("2/8"));
        arraylist.add(new BigRational("3/8"));
        Collections.sort(arraylist);
        System.out.println(arraylist);
        
    }

}
