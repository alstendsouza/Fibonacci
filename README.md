# Fibonacci

 The Source file is in /src/fibonacci folder.
 The TestCases are in the /test/FibonacciTest folder
 
 * I have implemented Fibonacci series using both Iterative and Recursive approach.
 *  function fibIteration(int n) takes in 'n' as int and returns a list of the first n numbers in the Fibonacci series
 *  function fibRecursion(int n) takes in 'n' as int and return only the fibonacci number of n, but it is called n times from the main method
 *  I have noticed that the run time for the iterative method is much faster than the recursive approach
 *  Also the recursive approach takes additional space
 *  The iterative approach only return a list with first n numbers in the series for testing purposes
 *   I have used BigInteger instead of long because for n > 94 the results go into negative numbers because the results exceeds the bounds specified by long
 *   A negative value of n and a value greater than bounds of int would throw an IllegalArgumentException()

 

