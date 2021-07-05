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
    System.out.println();

    System.out.println("Test 1: Natural number testcase");
    System.out.println( Solution.sumOfNumsDivByThreeOrFive(10) );
    System.out.println( Solution.sumOfNumsDivByThreeOrFiveOptimal(10) );

    System.out.println();

    System.out.println("Test 2: Natural number testcase");
    System.out.println( Solution.sumOfNumsDivByThreeOrFive(1000) );
    System.out.println( Solution.sumOfNumsDivByThreeOrFiveOptimal(1000) );

    System.out.println();

    System.out.println("Test 3: Zero number testcase");
    System.out.println( Solution.sumOfNumsDivByThreeOrFive(0) );
    System.out.println( Solution.sumOfNumsDivByThreeOrFiveOptimal(0) );

    System.out.println();

    System.out.println("Test 4: Negative number testcase");
    System.out.println( Solution.sumOfNumsDivByThreeOrFive(-10) );
    System.out.println( Solution.sumOfNumsDivByThreeOrFiveOptimal(-10) );

    System.out.println();

    System.out.println("Test 5: Fraction testcase");
    System.out.println( Solution.sumOfNumsDivByThreeOrFive(21/2) );
    System.out.println( Solution.sumOfNumsDivByThreeOrFiveOptimal(21/2) ); 

    System.out.println();

    System.out.println("Test 6: Random testcase");

    Random random = new Random();
    int num = random.nextInt(10000 + 10000) - 10000;
    System.out.println("Printing the random number: " + num);
    
    System.out.println();

    System.out.println( Solution.sumOfNumsDivByThreeOrFive(num) );
    System.out.println( Solution.sumOfNumsDivByThreeOrFive(num) ); 
  }
}
