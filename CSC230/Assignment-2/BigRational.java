package bigrationaltest;

import java.math.BigInteger;

/**
 * This class represents rational numbers. A rational number stores a numerator
 * and denominator, and we will use BigIntegers to represent the numerator and
 * denominator. Thus our class will be aptly named BigRational
 *
 * Following concepts haven used. public static final constants use of an
 * existing class, namely BigInteger (composition) multiple constructors
 * throwing exceptions implementing a set of accessors implementing equals and
 * toString
 */
public class BigRational implements Comparable<BigRational> {

    public static final BigRational ZERO = new BigRational();
    public static final BigRational ONE = new BigRational("1");

    private BigInteger num; // only this can be nagative
    private BigInteger den; // never negative

    public BigRational() {
        this(BigInteger.ZERO);
    }

    public BigRational(BigInteger n) {
        this(n, BigInteger.ONE);
    }

    public BigRational(BigInteger num, BigInteger den) {
        this.num = num;
        this.den = den;
        check00();
        fixSigns();
        reduce();
    }

    public BigRational(String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("empty string");
        }

        int slashIndex = str.indexOf('/');
        if (slashIndex == -1) {
            num = new BigInteger(str.trim());
            den = BigInteger.ONE; // den = 1
        } else {
            num = new BigInteger(str.substring(0, slashIndex).trim());
            den = new BigInteger(str.substring(slashIndex + 1).trim());
            try{
                check00();
                fixSigns();
                reduce();
            } catch (ArithmeticException ex){
            
            }
        }
    }

    private void check00() throws ArithmeticException {

        if (num.equals(BigInteger.ZERO) && den.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("division by zero");

        }
    }

    private void fixSigns() {
        if (den.compareTo(BigInteger.ZERO) < 0) {
            num = num.negate();
            den = den.negate();
        }
    }

    private void reduce() {
        BigInteger gcd = num.gcd(den);
        num = num.divide(gcd);
        den = den.divide(gcd);

    }

    /**
     * Get the absolute value
     *
     * @return
     */
    public BigRational abs() {
        return new BigRational(num.abs(), den);
    }

    /**
     * Negate the number
     *
     * @return
     */
    public BigRational negate() {
        return new BigRational(num.negate(), den);
    }

    /**
     * Add two numbers
     *
     * @param other
     * @return
     */
    public BigRational add(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.den).add(other.num.multiply(this.den));
        BigInteger newDenominator = this.den.multiply(this.num);
        return new BigRational(newNumerator, newDenominator);
    }

    /**
     * Subtract two numbers
     *
     * @param other
     * @return
     */
    public BigRational subtract(BigRational other) {
        return add(other.negate());
    }

    /**
     * Flips the num and den for reciprocal.
     *
     * @return the reciprocal of the fraction
     */
    public BigRational reciprocal() {
        return new BigRational(den, num);
    }

    /**
     * Finds the power of numbers
     *
     * @param exp the exponent
     * @return the fraction after rasing to the power provided
     */
    public BigRational pow(int exp) {
        if (exp < 0) {
            throw new ArithmeticException("Negative exponent");
        }
        BigInteger newNumerator = this.num.pow(exp);
        BigInteger newDenominator = this.den.pow(exp);
        return new BigRational(newNumerator, newDenominator);
    }

    /**
     * Makes the value toBigInteger
     *
     * @return the value of Big integer
     */
    public BigInteger toBigInteger() {
        if (!den.equals(BigInteger.ONE)) {
            throw new ArithmeticException("Denominator not 1");
        }
        return num;
    }

    /**
     * Converts the BigInt to integer value
     *
     * @return the integer value
     */
    public int toInteger() {
        if (!den.equals(BigInteger.ONE)) {
            throw new ArithmeticException("Denominator not 1");
        }
        return num.intValue();
    }

    /**
     * Multiply two numbers
     *
     * @param other
     * @return
     */
    public BigRational multiply(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.num);
        BigInteger newDenominator = this.den.multiply(other.den);
        return new BigRational(newNumerator, newDenominator);
    }

    /**
     * Divide two numbers
     *
     * @param other
     * @return
     */
    public BigRational divide(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.den);
        BigInteger newDenominator = this.den.multiply(other.num);
        return new BigRational(newNumerator, newDenominator);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof BigRational) {
            BigRational rhs = ((BigRational) other);
            return num.equals(rhs.num) && den.equals(((BigRational) other).den);
        }
        return false;
    }

    @Override
    public String toString() {
        if (den.equals(BigInteger.ZERO)) {
            if (num.compareTo(BigInteger.ZERO) < 0) {
                return "-Infinity";
            } else if (num.compareTo(BigInteger.ZERO) > 0) {
                return "Infinity";
            } else {
                return "Indeterminate";
            }
        }

        if (den.equals(BigInteger.ONE)) {
            return num.toString();
        } else {
            return num + " / " + den;
        }
    }

    @Override
    public int compareTo(BigRational o) {
        int num1 = (this.den.intValue())/(this.num.intValue()); //takes integer value of num and den 
        int num2 = (o.den.intValue())/(o.num.intValue());
        return num1 - num2;
    }

}
