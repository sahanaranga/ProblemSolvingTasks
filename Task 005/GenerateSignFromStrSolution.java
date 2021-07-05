// Three solutions are provided
import java.util.*;

class GenerateSignFromStrSolution
{
  /**
   * Time complexity = O(n*m)
   *
   * Take a character from the sign string and check whether it exists in the given string. If it exists, mark the character in the sign string as "found" 
   * (done using null character) and the corresponding character in the given string as having "been used" (done using null character)
   */
  static boolean canSignBeGeneratedNM (String sign, String givenStr)
  { 
    if ( sign.length() > givenStr.length() )
      return false;

    char signChars[] = sign.toCharArray();
    char givenStrChars[] = givenStr.toCharArray();

    for (int i = 0; i < signChars.length; i++)
    {
      for (int j = 0; j < givenStrChars.length; j++)
      {
        // Checks if the character from the sign string is the same as the character from the given string
        if ( signChars[i] == givenStrChars[j] )
        {
          signChars[i] = '\0';
          givenStrChars[j] = '\0';
          break;
        }
      }
    }

    // If all the characters in the sign string are null, then all of these characters are present in the given string
    for (int i = 0; i < signChars.length; i++)
    {
      if (signChars[i] != '\0')
        return false;
    }

    return true;
  }



  /**
   * Time Complexity = O(n)
   *
   * Obtain the frequency of occurance of each character in the sign string. If the given string contains one of the characters required, 
   * decrement the count to denote that a character from the given string has been used to create the sign string. 
   */
  static boolean canSignBeGeneratedN (String sign, String givenStr)
  {
    if ( sign.length() > givenStr.length() )
      return false;

    HashMap <Character, Integer> charsFreqCount = new HashMap <Character, Integer>();

    // Find the number of times each character occurs in the sign string
    for (int i = 0; i < sign.length(); i++)
    {
      char c = sign.charAt(i);
      charsFreqCount.put( c, charsFreqCount.getOrDefault(c, 0) + 1 );
    } 

    for (int i = 0; i < givenStr.length(); i++)
    {
      char c = givenStr.charAt(i);

      if ( charsFreqCount.containsKey(c) )
        charsFreqCount.put(c, charsFreqCount.get(c) - 1);
    }

    // If the given string contains more than the required number of a character, the count in the map will be negative
    for (char key : charsFreqCount.keySet())
    {
      if (charsFreqCount.get(key) > 0)
        return false;
    }

    return true;
  }


  
  /**
   * Time Complexity = O(n log n)
   *
   * Sort both the sign string and the given string. Use two "pointers" (say variables i and j) to denote the position of the character we are currently inspecting. If the 
   * current character of the sign string has been found in the given string, increment both the pointers, else keep incrementing j until we find the current character or 
   * until we reach the end of the given string.
            If i is equal to the length of the sign string, it means that all the characters have been found in the given string.
   */
  static boolean canSignBeGeneratedNLogN (String sign, String givenStr)
  {
    if (sign.length() > givenStr.length())
      return false;

    char signChars[] = sign.toCharArray();
    char givenStrChars[] = givenStr.toCharArray();

    Arrays.sort(signChars);
    Arrays.sort(givenStrChars);

    int i = 0, j = 0;

    while (i < signChars.length && j < givenStrChars.length)
    {
      if ( signChars[i] == givenStrChars[j] )
      {
        i++;
        j++;
      }

      else
        j++;
    }

    if (i == signChars.length)
      return true;

    return false;
  } 
}
