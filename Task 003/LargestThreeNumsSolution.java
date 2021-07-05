// Two solutions are provided here

import java.util.*;

class LargestThreeNumsSolution
{
  /** Time Complexity = O(n)
  *
  * Three variables are used to hold the 3 largest numbers of the array
  * In each iteration, the array element is checked to see whether it is greater than any one of these variables. If so, the variables are updated
  */
  static void findThreeLargestNumsOptimal(int[] numArray) 
  {
    // Check if the input array size is less than 3
    if (numArray.length < 3)
    {
      System.out.println("Invalid Input");
      return;
    }

    int largestNum = Integer.MIN_VALUE, secondLargestNum = Integer.MIN_VALUE, thirdLargestNum = Integer.MIN_VALUE;

    for (int i = 0; i < numArray.length; i++)
    {
      // Checks if the element is larger than largestNum
      if (numArray[i] > largestNum)
      {
        thirdLargestNum = secondLargestNum;
        secondLargestNum = largestNum;
        largestNum = numArray[i];
      }

      // Checks if the element is larger than secondLargestNum
      else if (numArray[i] > secondLargestNum)
      {
        thirdLargestNum = secondLargestNum;
        secondLargestNum = numArray[i];
      }

      // Checks if the element is larger than thirdLargestNum
      else if (numArray[i] > thirdLargestNum)
        thirdLargestNum = numArray[i];
    }

    // Prints the 3 largest numbers
    System.out.println(largestNum + " " + secondLargestNum + " " + thirdLargestNum);
  }


  
  // Time Complexity = O(n Log n)
  static void findThreeLargestNums(int[] numArray) 
  {
    // Check if the input array size is less than 3
    if (numArray.length < 3)
    {
      System.out.println("Invalid Input");
      return;
    }

    // Sort the array and print the last 3 elements
    Arrays.sort(numArray);

    System.out.println( numArray[numArray.length - 1] + " " + numArray[numArray.length - 2] + " " + numArray[numArray.length - 3] );
  }
}
