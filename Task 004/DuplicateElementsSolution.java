// Three solutions are provided here

import java.util.*;

class DuplicateElementsSolution
{
  // Time Complexity = O(n^2)
  static boolean containsDuplicatesNSq (int[] numArray)
  {
    // The array element is compared with the other array elements. If the 2 elements are the same, return true
    for (int i = 0; i < numArray.length; i++)
    {
      for (int j = i + 1; j < numArray.length; j++)
      {
        if (numArray[i] == numArray[j])
          return true;
      }
    }

    return false;
  }



  // Time Complexity = O(n)
  static boolean containsDuplicatesN (int[] numArray)
  {
    // A hash set will only contain distinct elements, so it can be used to check for duplicate elements
    HashSet <Integer> setOfArrayElements = new HashSet <Integer>();

    for (int i = 0; i < numArray.length; i++)
    {
      // If the hash set already contains the element, the add method will return false
      if (setOfArrayElements.add( numArray[i] ) == false)
        return true;
    }

    return false;
  }



  // Time Complexity = O(n log n)
  static boolean containsDuplicatesNLogN (int[] numArray)
  {
    Arrays.sort(numArray);

    for (int i = 0; i < numArray.length-1; i++)
    {
      // If the array element and its adjacent element are the same, return true
      if (numArray[i] == numArray[i + 1])
        return true;
    }

    return false;
  }
}
