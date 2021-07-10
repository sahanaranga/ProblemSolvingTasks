/**
* Problem Statement:
*
* Write a function which takes an array and prints the majority element (if it exists), otherwise prints "No Majority Element". 
* A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println();

    System.out.println("Test 1: Majority element found testcase");

    int numArray1[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
    MajorityElementSolution.findMajElement( numArray1 );
    MajorityElementSolution.findMajElementMap( numArray1 );
    MajorityElementSolution.findMajElementSort( numArray1 );
    MajorityElementSolution.findMajElementBMAlgo( numArray1 );

    System.out.println();

    System.out.println("Test 2: Majority element not found testcase");

    int numArray2[] = {3, 3, 4, 2, 4, 4, 2, 4};
    MajorityElementSolution.findMajElement( numArray2 );
    MajorityElementSolution.findMajElementMap( numArray2 );
    MajorityElementSolution.findMajElementSort( numArray2 );
    MajorityElementSolution.findMajElementBMAlgo( numArray2 );

    System.out.println();

    System.out.println("Test 3: Empty array testcase");

    int numArray3[] = new int[0];
    MajorityElementSolution.findMajElement( numArray3 );
    MajorityElementSolution.findMajElementMap( numArray3 );
    MajorityElementSolution.findMajElementSort( numArray3 );
    MajorityElementSolution.findMajElementBMAlgo( numArray3 );

    System.out.println();

    System.out.println("Test 4: Single element testcase");

    int numArray4[] = {1};
    MajorityElementSolution.findMajElement( numArray4 );
    MajorityElementSolution.findMajElementMap( numArray4 );
    MajorityElementSolution.findMajElementSort( numArray4 );
    MajorityElementSolution.findMajElementBMAlgo( numArray4 );

    System.out.println();

    System.out.println("Test 5: Random Tescase");

    Random random = new Random();

    int arrLen = random.nextInt(10 - 2) + 2;
    int numArray5[] = new int[arrLen];

    System.out.print("Printing the array: ");

    for (int i = 0; i < arrLen; i++)
    {
      numArray5[i] = random.nextInt(5);
      System.out.print(numArray5[i] + " ");
    }

    System.out.println("\n");

    MajorityElementSolution.findMajElement( numArray5 );
    MajorityElementSolution.findMajElementMap( numArray5 );
    MajorityElementSolution.findMajElementSort( numArray5 );
    MajorityElementSolution.findMajElementBMAlgo( numArray5 );
  }
}
