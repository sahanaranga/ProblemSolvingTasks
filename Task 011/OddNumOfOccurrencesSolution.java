// Three solutions are provided here

import java.util.*;

class OddNumOfOccurrencesSolution
{
  /**
  * Time complexity = O(n^2)
  * Space complexity = O(1)
  *
  * Using a nested for-loop, count the number of times each element occurs in the array and check whether this count is odd or even
  */
  static void findOddOccurrence (int[] numArray)
  {
    for (int i = 0; i < numArray.length; i++)
    {
      // Reinitializing count to zero
      int count = 0;

      for (int j = 0; j < numArray.length; j++)
      {
        // if element at index 'i' is same as element in index 'j'
        if (numArray[i] == numArray[j])
          count++;
      }

      // if count is odd
      if (count % 2 == 1)
      {
        System.out.println(numArray[i]);
        return;
      }
    }

    // If none of the elements have an odd count value
    System.out.println("Element No Found");
  }

  /**
  * Time complexity = O(n)
  * Space complexity = O(n)
  *
  * Count the number of times each element occurs in the array and store this count in a hash map
  * Iterate through the hash map and find the element whose count value is odd
  */
  static void findOddOccurrenceMap (int[] numArray)
  {
    HashMap <Integer, Integer> occurrenceCount = new HashMap <Integer, Integer>();

    // Count the number of times each element occurs in the array 
    for (int i = 0; i < numArray.length; i++)
    {
      occurrenceCount.put( numArray[i], occurrenceCount.getOrDefault(numArray[i], 0) + 1 );
    }

    for (int num : occurrenceCount.keySet())
    {
      // Check if the count value for the key "num" in the map is odd
      if ( occurrenceCount.get(num) % 2 == 1 )
      {
        System.out.println(num);
        return;
      }
    }

    // If none of the elements have an odd count value
    System.out.println("Element No Found");
  }

  /**
  * Time complexity = O(n)
  * Space complexity = O(1)
  *
  * The bitwise operator XOR is used here
  * When 2 identical numbers are XOR'ed, the result will be zero
  ** As all the elements, except one, occur an even number of times, the XOR of all these elements will be zero
  * When zero is XOR'ed with another number, say n, the result will be n itself
  ** Hence, when zero is XOR'ed with all the odd occurrences of a number n, the result will be n
  * If the final result is zero, then none of the elements occur an odd number of times
  */
  static void findOddOccurrenceXOR (int[] numArray)
  {
    int result = 0;
    
    // XOR all the array elements 
    for (int i = 0; i < numArray.length; i++)
      result ^= numArray[i];
    
    // Result should be the element that occurs an odd number of times, and hence should be non-zero
    if (result != 0)
      System.out.println(result);

    // If the result is zero
    else
      System.out.println("Element No Found");
  }
}
