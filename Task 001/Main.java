/** 
* Problem Statement:
* Given a number N, write a function to return a list of the factors of N, in no particular order. 
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("\nTest 1: Natural number testcase");
    FactorsOfNumberSolution.factorsSqrtN(24);

    System.out.println("\nTest 2: Natural number testcase");
    FactorsOfNumberSolution.factorsSqrtN(100);

    System.out.println("\nTest 3: Zero number testcase");
    FactorsOfNumberSolution.factorsSqrtN(0);

    System.out.println("\nTest 4: Fraction number testcase");
    FactorsOfNumberSolution.factorsSqrtN(201/2);

    System.out.println("\nTest 5: Negative number testcase");
    FactorsOFNumberSolution.factorsSqrtN(-100);

    System.out.println("\nTest 6: Random testcase");

    Random random = new Random();
    int num = random.nextInt(1000 + 1000) - 1000;
    System.out.println("Printing the random number: " + num);
    
    System.out.println();

    FactorsOfNumberSolution.factorsSqrtN(num);
  }
}
