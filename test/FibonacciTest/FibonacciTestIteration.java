package FibonacciTest;

import static org.junit.Assert.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import fibonacci.Fibonacci;

/**
 * Tests to check for Iterative function *
 */
public class FibonacciTestIteration {

    /**
     * * Tests that Fibonacci throws an IllegalArgumentException * for a
     * negative number or a number greater than Integer range
     */
    @Test(expected = IllegalArgumentException.class)
    public void expectedIllegalArgumentExceptionIteration() {
        Fibonacci.fibIteration(-1); // throw IllegalArgumentException exception
        Fibonacci.fibIteration(Integer.MAX_VALUE); // throw IllegalArgumentException exception
    }

    /**
     * * Tests the value for n = 0 which should return an empty list
     */
    @Test
    public void testZeroIteration() {
        List<BigInteger> list = new ArrayList<BigInteger>();
        assertEquals(list, Fibonacci.fibIteration(0));
    }

    /**
     * * Tests the value for n = 5 which should return a list => 0 1 1 2 3
     */
    @Test
    public void testCorrectCaseIteration() {
        List<BigInteger> list = new ArrayList<BigInteger>();
        list.add(new BigInteger("0"));
        list.add(new BigInteger("1"));
        list.add(new BigInteger("1"));
        list.add(new BigInteger("2"));
        list.add(new BigInteger("3"));
        assertEquals(list, Fibonacci.fibIteration(5));
    }

}