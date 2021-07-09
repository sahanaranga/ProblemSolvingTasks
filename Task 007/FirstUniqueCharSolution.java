// Three solutions have been provided

import java.util.*;

class FirstUniqueCharSolution
{
  /**
  * Time complexity = O(n)

  * Count the number of times each character occurs in the input string; store this count in a hash map
  * In another for-loop, check the number of times that particular char has occured; if 1, then return its index
  * if no such char has been found, return -1
  */
  static int findFirstUniqueCharMap (String inputStr)
  {
    HashMap <Character, Integer> charsFreq = new HashMap <Character, Integer> ();

    for (int i  = 0; i < inputStr.length(); i++)
      charsFreq.put( inputStr.charAt(i), charsFreq.getOrDefault(inputStr.charAt(i), 0) + 1 );

    for (int i = 0; i < inputStr.length(); i++)
    {
      if (charsFreq.get( inputStr.charAt(i) ) == 1)
        return i;
    }

    return -1;  
  }


  /**
  * Time complexity = O(n);

  * For this solution, the following values are used:
  -> -2 denotes that the character hasn't been found in the input string yet
  -> -1 denotes that the character occurs multiple times in the input string
  -> any value >= 0 denotes that so far the character has been seen only once; the value refers to the index of the character's first occurance.
  * Using a for-loop, we determine whether each character has occurred once or multiple times, using an array and the above values
  ** uniquePosArray contains an entry for each lowercase letter in the English alphabet sequence:
  *** for example, if uniquePosArray[0] = -2, it means that the letter 'a' does not appear in the string
  *** if uniquePosArray[25] = -1, it means that the letter 'z' occurs more than once in the string
  *** if uniquePosArray[1] i, where i >= 0, it means that 'b' occurs only once in the string and i denotes the index/position of 'b' in the string
  * we then loop through the array to determine the smallest positive int value; this is our result (position of the first non-repeating character)
  * if such a value doesnt exist, return -1
  */
  static int findFirstUniqueCharArray (String inputStr)
  {
    //26, as there are only 26 lowercase letters
    int uniquePosArray[] = new int[26]; 

    for (int i=0; i < 26; i++)
      uniquePosArray[i] = -2;

    for (int i = 0; i < inputStr.length(); i++)
    {
      int letterPos =  (int) inputStr.charAt(i) - 'a';

      if (uniquePosArray[ letterPos ] == -2) // hasn't occurred yet
        uniquePosArray[ letterPos ] = i;

      else if (findUniquePosArray[ letterPos ] >= 0)  // has already occurred once, 
        uniquePosArray[ letterPos ] = -1;
    } 

    int index = Integer.MAX_VALUE;

    for (int i = 0; i < 26; i++)
    {
      if (uniquePosArray[i] >= 0)
        index = Math.min(index, uniquePosArray[i]);
    } 

    if (index == Integer.MAX_VALUE)
      return -1;

    return index;  
  }

  
  /** 
  * Time complexity = O(n^2)
  *
  * In a loop, each character is compared with the other elements in the character array to see if they are the same
  * If they are same, those elements are changed to null to denote that the character is not unique
  ** example: kayak
  ** without keeping the second 'k' as null, the program will assume that it is a unique character as there are no other 'k' after it
  * a boolean variable is also used to denote whether the character is unique or not
  * if it is unique, the index of the character will be returned
  */
  static int findFirstUniqueChar (String inputStr)
  {
    if (inputStr.length() == 1)
      return 0;

    char inputChars[] = inputStr.toCharArray();

    for (int i = 0; i < inputStr.length() - 1; i++)
    {
      // If null, it means that a character was found to be repeating and doesn't need to be checked
      if ( inputChars[i] != '\0')
      {
        // Resetting the flag for each new character to be checked
        boolean isUnique = true;

        for (int j = i + 1; j < inputStr.length(); j++)
        {
          // If the character is found to be repeated
          if ( inputChars[i]  == inputChars[j] )
          {
            inputChars[j] = '\0';
            isUnique = false; 
          }
        }

        // The character is the first distinct character; its index is returned
        if (isUnique)
          return i;
      }
    }

    return -1;
  }
}
