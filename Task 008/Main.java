/**
* Problem Statement
* Write a function that takes in a non-empty array of integers that are sorted in ascending order 
* and returns a new array of the same length with the squares of the original integers also sorted in ascending order.
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println();

    System.out.println("Test 1: Only positive integers testcase");
    int numArray1[] = {1, 2, 5, 7};

    SqOfArraySolution.findSqOfArray( numArray1 );
    SqOfArraySolution.findSqOfArrayWithPtrs( numArray1 );

    System.out.println();

    System.out.println("Test 2: Positive & negative integers testcase");
    int numArray2[] = {-8, -6, 1, 2, 5, 7};

    SqOfArraySolution.findSqOfArray( numArray2 );
    SqOfArraySolution.findSqOfArrayWithPtrs( numArray2 );

    System.out.println();

    System.out.println("Test 3: Only negative integers testcase");
    int numArray3[] = {-8, -7, -6, -3, -1};

    SqOfArraySolution.findSqOfArray( numArray3 );
    SqOfArraySolution.findSqOfArrayWithPtrs( numArray3 );

    System.out.println();


    System.out.println("Test 4: Random testcase");

    Random random =  new Random();

    int arrayLen = random.nextInt(10 - 1) + 1;
    int numArray4[] = new int[ arrayLen ];

    for (int i = 0; i < arrayLen; i++)
      numArray4[i] = random.nextInt(10 + 10) - 10;

    Arrays.sort(numArray4);

    System.out.print("Printing the array: ");

    for (int i = 0; i < arrayLen; i++)
      System.out.print(numArray4[i] + " ");  

    System.out.println();

    System.out.println();
    SqOfArraySolution.findSqOfArray( numArray4 );
    SqOfArraySolution.findSqOfArrayWithPtrs( numArray4 );
  }
}
