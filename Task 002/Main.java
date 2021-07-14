/** 
* Problem Statement:
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000. 
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.System.out.println("\nTest 1: Natural number testcase");
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFive(10) );
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFiveOptimal(10) );

    System.out.println("\nTest 2: Natural number testcase");
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFive(1000) );
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFiveOptimal(1000) );

    System.out.println("\nTest 3: Zero number testcase");
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFive(0) );
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFiveOptimal(0) );

    System.out.println("\nTest 4: Negative number testcase");
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFive(-10) );
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFiveOptimal(-10) );

    System.out.println("\nTest 5: Fraction testcase");
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFive(21/2) );
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFiveOptimal(21/2) ); 

    
    System.out.println("\nTest 6: Random testcase");

    Random random = new Random();
    int num = random.nextInt(10000 + 10000) - 10000;
    System.out.println("Printing the random number: " + num);
    
    System.out.println();

    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFive(num) );
    System.out.println( SumOfNumsDivByThreeOrFiveSolution.findSumOfNumsDivByThreeOrFiveOptimal(num) ); 
  }
}
