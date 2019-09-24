package fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/*
 * I have implemented Fibonacci series using both Iterative and Recursive approach.
 *  function fibIteration(int n) takes in 'n' as int and returns a list of the first n numbers in the Fibonacci series
 *  function fibRecursion(int n) takes in 'n' as int and return only the fibonacci number of n, but it is called n times from the main method
 *  I have noticed that the run time for the iterative method is much faster than the recursive approach
 *  Also the recursive approach takes additional space
 *  The iterative approach only return a list with first n numbers in the series for testing purposes
 *  
 *   I have used BigInteger instead of long because for n > 94 the results go into negative numbers because the results exceeds the bounds specified by long
 *   A negative value of n and a value greater than bounds of int would throw an IllegalArgumentException()
 */
public class Fibonacci {

    /*Iterative approach to print the first n numbers in the Fibonnaci sequence*/
    public static List<BigInteger> fibIteration(int n) {

        /*if n is less than 0 or n greater than Integer.MAX_VALUE we return IllegalArgumentException */
        if (n < 0 || n > Integer.MAX_VALUE) {
            throw new IllegalArgumentException();
        }

        /* A list to store and return the results (optional) : only used for testing purposes */
        List<BigInteger> result = new ArrayList<BigInteger>();

        /* We use BigInteger because the sequence values can exceed bounds specified by long or int - (happens for n > 93) */
 /* Declare and assign constants*/
        BigInteger prevNum = BigInteger.ZERO;
        BigInteger nextNum = BigInteger.ONE;
        BigInteger sum;
        int i = 0;

        /* in the while loop we print out the list of n numbers in the Fibonacci sequence */
        while (i < n) {
            System.out.print(prevNum + " ");
            result.add(prevNum); // add the prevNum to the list
            sum = prevNum.add(nextNum); // same as prevNum + nextNum
            prevNum = nextNum;
            nextNum = sum;
            i++; //increment i
        }
        System.out.println();
        return result; // return the list of n numbers in the Fibonacci sequence
    }

    /*recursive approach to print the first n numbers in the Fibonnaci sequence: This function is called n times*/
    public static BigInteger fibRecursion(int n) {
        /*if n is less than 0 or n greater than Integer.MAX_VALUE we return IllegalArgumentException */

        if (n < 0 || n > Integer.MAX_VALUE) {
            throw new IllegalArgumentException();
        }
        /* values for base case */

        if (n == 0) {
            return BigInteger.ZERO;
        }
        /* Base case includes 2 because it saves one iteration since value for n = 1 & 2 is the same (1) */
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }

        /* make recursive calls to itself fibRecursion(n-2) + fibRecursion(n-1) */
        return fibRecursion(n - 2).add(fibRecursion(n - 1));
    }

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        /* Run until user enters correct value for n (1 to Integer.MAX_VALUE) */
        while (true) {
            System.out.println("Please enter an integer");
            String s = br.readLine(); // read user input form command line
            int n;
            /* try converting string to int : if fails throw an exception */
            try {
                n = Integer.parseInt(s); // convert String to int
                /* value of n should be > 0  because there are no 0 elements in a sequence */
                if (n > 0) {
                    /* Iterative approach */
                    System.out.println("Fibonacci Series of " + n + " numbers (Using Iteration): ");
                    Fibonacci.fibIteration(n);

                    System.out.println("====================================================================================");
                    /* Recursive approach */
                    System.out.println("\nThe recursive approach is slow and takes time to run for larger values of n ");
                    System.out.println("Fibonacci Series of " + n + " numbers (Using Recursion): ");
                    /* Do the fibRecursion() n times to get values of fib(n) */
                    for (int i = 0; i < n; i++) {
                        System.out.print(Fibonacci.fibRecursion(i) + " ");
                    }
                    break;
                } else {
                    System.err.println("Integer entered cannot be less than 0"); // Print error message for negative numbers
                }
            } catch (Exception e) {
                System.err.println("Please enter a valid integer : " + e); // print error message for bad values
            }
        }
    }

}