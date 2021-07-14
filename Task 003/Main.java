/** 
* Problem Statement:
* Given an array of at least 3 integers, write a function that returns the 3 largest elements in the array in descending order. 
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    int numArray1[] = {10, 4, 3, 50, 23, 90};
    System.out.println("\nTest 1: Natural Numbers testcase");

    LargestThreeNumsSolution.findThreeLargestNumsOptimal(numArray1);
    LargestThreeNumsSolution.findThreeLargestNums(numArray1);

    int numArray2[] = {4,3,2,1};
    System.out.println("\nTest 2: Natural Numbers in Descending Order Testcase");

    LargestThreeNumsSolution.findThreeLargestNumsOptimal(numArray2);
    LargestThreeNumsSolution.findThreeLargestNums(numArray2);

    int numArray3[] = {10, 4, -3, 50, 23, -90};
    System.out.println("\nTest 3: Negative & Positve Numbers Mixed testcase");

    LargestThreeNumsSolution.findThreeLargestNumsOptimal(numArray3);
    LargestThreeNumsSolution.findThreeLargestNums(numArray3);

    int numArray4[] = {-10, -4, -3, -50, -23, -90};
    System.out.println("\nTest 4: All Negative Numbers testcase");

    LargestThreeNumsSolution.findThreeLargestNumsOptimal(numArray4);
    LargestThreeNumsSolution.findThreeLargestNums(numArray4);

    int numArray5[] = {10, 4};
    System.out.println("\nTest 5: Array Size Less Than 3 testcase");

    LargestThreeNumsSolution.findThreeLargestNumsOptimal(numArray5);
    LargestThreeNumsSolution.findThreeLargestNums(numArray5);

    int numArray6[] = {4, 4, 4};
    System.out.println("\nTest 6: Identical Elements testcase");

    LargestThreeNumsSolution.findThreeLargestNumsOptimal(numArray6);
    LargestThreeNumsSolution.findThreeLargestNums(numArray6);


    System.out.println("\nTest 7: Random testcase");

    Random random = new Random();

    int arrayLength = random.nextInt(10);
    int numArray7[] = new int[arrayLength];

    System.out.print("Printing the randomized array: ");

    for (int i=0; i<arrayLength; i++)
    {
      numArray7[i] = random.nextInt(1000 + 1000) - 1000;
      System.out.print(numArray7[i] + " ");
    }  

    System.out.println("\n");
    LargestThreeNumsSolution.findThreeLargestNumsOptimal(numArray7);
    LargestThreeNumsSolution.findThreeLargestNums(numArray7);
  }
}
