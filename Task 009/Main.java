/**
*
* Write a function that takes in two non-empty arrays of integers, finds the pair of numbers (one from each array) whose absolute difference is closest to zero, 
* and returns an array containing these two numbers, with the number from the first array in the first position.
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println();

    System.out.println("Test 1");
    int numArrayA1[] = {-1, 5, 15, 23, 29, 5};
    int numArrayB1[] = {34, 17, 28, 36, 9};

    PairWithMinDiffSolution.findPairWithMinDiff( numArrayA1, numArrayB1 );
    PairWithMinDiffSolution.findPairWithMinDiffSort( numArrayA1, numArrayB1 );

    System.out.println();

    System.out.println("Test 2: ");
    int numArrayA2[] = {1, 60, -10, 70, -90, 84};
    int numArrayB2[] = {86, 3, -15, 53, -80, 8};
    
    PairWithMinDiffSolution.findPairWithMinDiff( numArrayA2, numArrayB2 );
    PairWithMinDiffSolution.findPairWithMinDiffSort( numArrayA2, numArrayB2 );

    System.out.println();

    /** 
    *It is found in this testcase that when multiple pairs have the same absolute minimum difference, 
    * the two algorithms provide different answers as they search for the pairs in different ways. 
    * If method "findPairWithMinDiff" uses a sorting algorithm, then the answers will be the same for both algorithms
    */
    System.out.println("Test 3: Multiple Pairs testcase");
    int numArrayA3[] = {4, -7, -2};
    int numArrayB3[] = {-1, 7, 9, 3};
    
    PairWithMinDiffSolution.findPairWithMinDiff( numArrayA3, numArrayB3 );
    PairWithMinDiffSolution.findPairWithMinDiffSort( numArrayA3, numArrayB3 );

    System.out.println();

    
    System.out.println("Test 3: Random testcase");

    Random random = new Random();

    int arrLenA = random.nextInt(5 - 1) + 1;
    int numArrayA4[] = new int[arrLenA];

    System.out.println("Printing the arrays: ");

    for (int i = 0; i < arrLenA; i++)
    {
      numArrayA4[i] = random.nextInt(10 + 10) - 10;
      System.out.print(numArrayA4[i] + " ");
    }

    System.out.println();

    int arrLenB = random.nextInt(5 - 1) + 1;
    int numArrayB4[] = new int[arrLenB];

    for (int i = 0; i < arrLenB; i++)
    {
      numArrayB4[i] = random.nextInt(10 + 10) - 10;
      System.out.print(numArrayB4[i] + " ");
    } 

    System.out.println();

    System.out.println();
    PairWithMinDiffSolution.findPairWithMinDiff( numArrayA4, numArrayB4 );
    PairWithMinDiffSolution.findPairWithMinDiffSort( numArrayA4, numArrayB4 );
  }
}
