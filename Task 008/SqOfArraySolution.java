// Two solutions are provided here

import java.util.*;

class SqOfArraySolution
{
  // Time complexity = O(n log n)
  static void findSqOfArray (int[] numArray)
  {
    int[] resultArray = new int[ numArray.length ];

    // Find the squares of each element in the array
    for (int i = 0; i < resultArray.length; i++)
      resultArray[i] = numArray[i] * numArray[i];

    // Sort the array
    Arrays.sort(resultArray);

    // Print the array
    for (int i = 0; i < resultArray.length; i++)
      System.out.print(resultArray[i] + " ");

    System.out.println();    
  }


  /** 
  * Time complexity = O(n)
  *
  * Two pointers, leftPtr and rightPtr, are used to denote the left and right ends of the array 
  * In each iteration, check whether numArray [leftPtr] > numArray[rightPtr]
  ** as the array is sorted, the negative integers, if any, will be present on the left side of the array
  ** when comparing the left element with the right element, the absolute value of the left element is considered
  ** this is done as the squares of negative integers will be positive
  * The larger integer is then added to the end of the result array.
  ** if this integer is the left element, the leftPtr is incremented to consider the next element
  ** likewise, the rightPtr will be decremented if this integer is the right element
  */
  static void findSqOfArrayWithPtrs (int[] numArray)
  {
    int leftPtr = 0, rightPtr = numArray.length - 1;
    
    int resultArray[] = new int[ numArray.length ];

    for (int i = numArray.length - 1; i >= 0; i--)
    {
      // Checks if the left element is greater than the right element
      if ( Math.abs(numArray[ leftPtr ]) > numArray[ rightPtr ] )
      {
        resultArray[i] = numArray[ leftPtr ] * numArray[ leftPtr ];
        leftPtr++;
        
      }

      // If the right element is greater
      else
      {
        resultArray[i] = numArray[ rightPtr ] * numArray[ rightPtr ];
        rightPtr--;
      }
    }

    // Prints the array
    for (int i = 0; i < resultArray.length; i++)
      System.out.print(resultArray[i] + " ");

    System.out.println();
  }
}
