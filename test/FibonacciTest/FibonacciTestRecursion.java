package FibonacciTest;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

import fibonacci.Fibonacci;

/**
 * Tests to check for Recursive function *
 */
public class FibonacciTestRecursion {

    /**
     * Tests to see that Fibonacci returns the correct value for the base cases,
     * n=0,n=1 and n=2
     */
    @Test
    public void testBaseCaseRecursion() {
        assertEquals(BigInteger.ZERO, Fibonacci.fibRecursion(0)); //base case 0 should return 0
        assertEquals(BigInteger.ONE, Fibonacci.fibRecursion(1));	//base case 1 should return 1
        assertEquals(BigInteger.ONE, Fibonacci.fibRecursion(2)); //base case 2 should return 1
    }

    /**
     * * Tests that Fibonacci throws an IllegalArgumentException * for a
     * negative number or a number greater than Integer range
     */
    @Test(expected = IllegalArgumentException.class)
    public void expectedIllegalArgumentExceptionRecursion() {
        Fibonacci.fibRecursion(-1); // throw IllegalArgumentException exception
        Fibonacci.fibRecursion(Integer.MAX_VALUE); // throw IllegalArgumentException exception
    }

    /**
     * * Tests that Fibonacci works fine for inductive cases in recursion
     */
    @Test
    public void testInductiveCaseRecursion() {
        /*fibRecursion(2) = fibRecursion(1)+fibRecursion(0) should return 1*/
        assertEquals(BigInteger.ONE, Fibonacci.fibRecursion(0).add(Fibonacci.fibRecursion(1)));
        /*fibRecursion(10) = fibRecursion(8)+fibRecursion(9) should return 55*/
        BigInteger b = new BigInteger("55");
        assertEquals(b, Fibonacci.fibRecursion(8).add(Fibonacci.fibRecursion(9)));
    }

}
