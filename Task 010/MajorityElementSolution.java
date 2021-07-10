// Four solutions have been provided here.

import java.util.*;

class MajorityElementSolution
{
  //Time complexity = O(n^2)
  static void findMajElement (int[] numArray)
  {
    int arrLen = numArray.length;

    for (int i = 0; i < arrLen; i++)
    {
      int count = 1;

      // Find number of times that element at index "i" occurs in the array
      for (int j = i + 1; j < arrLen; j++)
      {
        // If the element at index "i" the same as the current element at "j"
        if (numArray[i] == numArray[j])
          count++;
      }

      // If the number of times the element occurs is greater than half of the array size, print the element
      if (count > arrLen/2 )
      {
        System.out.println( numArray[i] );
        return;
      }
    }

    System.out.println("No Majority Element");
  }

  //Time complexity = O(n)
  static void findMajElementMap (int[] numArray)
  {
    HashMap <Integer, Integer> countFreq = new HashMap <Integer, Integer>();

    int arrLen = numArray.length;

    // Find the number of times each element occurs in the array using a hash map
    for (int i = 0; i < arrLen; i++)
      countFreq.put( numArray[i], countFreq.getOrDefault(numArray[i], 0) + 1 );

    for (int num : countFreq.keySet())
    {
      // If the number of occurrences is greater then half of the array size
      if (countFreq.get(num) > (arrLen / 2))
      {
        System.out.println(num);
        return;
      }
    }

    System.out.println("No Majority Element"); 
  }

  /**
  * Time complexity = O(n log n)
  *
  * Sort the array
  * Find the number of times each element occurs in the array:
  ** in each iteration, if the current element is same as its adjacent element, then increment the count variable
  ** else, check if the count is greater than half the size of the array; if so, then print the current element, else reset the count variable
  */
  static void findMajElementSort (int[] numArray)
  {
    int arrLen = numArray.length, count = 1;
    int array[] = new int[arrLen];

    // A new array is created so that the original input array isn't modified
    for (int i = 0; i < arrLen; i++)
      array[i] = numArray[i];

    Arrays.sort(array);

    for (int i = 0; i < arrLen; i++)
    {
      // if number of occurrences is greater than half the size of the array, print the element
      if (count > arrLen/2)
      {
        System.out.println(array[i]);
        return;
      }

      // if the current element is the same as its adjacent element
      else if ( i < arrLen-1 && array[i] == array[i + 1])
        count++;

      // reset the count variable if the current element is not the same as its adjacent element
      else
        count = 1;
    }

    System.out.println("No Majority Element");
  }

  /**
  * Time complexity = O(n)
  *
  * Uses the Boyer–Moore Majority Vote Algorithm to find the majority element:
  ** In a for-loop, "predict" the majority element
  *** initialize a count varible and majElement varible which holds the predicted majority element
  *** if count is 0, then set the majElement to the current element at index if
  *** else if the current element is the same as the majElement, increment count
  *** else decrement count
  *** upon exiting the loop, the value in the majElement is predicted to be the majority element
  ** In another for-loop, verify whether the prediction is true, by counting the number of times the majElement occurs
  *** if it occurs more than half the size of the array, then its the majority element
  */
  static void findMajElementBMAlgo (int[] numArray)
  {
    int count = 0, majElement = -1;

    for (int i = 0; i < numArray.length; i++)
    {
      if (count == 0)
      {
        majElement = numArray[i];
        count++;
      }

      else if (numArray[i] == majElement)
        count++;

      else
        count--;  
    }

    int occurrences = 0;

    for (int i = 0; i < numArray.length; i++)
    {
      if (numArray[i] == majElement)
        occurrences++;
    }

    if (occurrences > numArray.length / 2)
      System.out.println(majElement);

    else  
      System.out.println("No Majority Element");
  }
}
