import java.util.*;

class ShiftEveryLetterByKSolution
{
  /**
  * Time Complexity = O(n)
  *
  * Take each character and check if its a letter or not. If it isn't a letter, add it to the result character array.
  * If the character is a letter, then perform the shift operation:
  ** convert the letter into an integer
  ** subtract 'a' from get the position of the letter in the English alphabet sequence
  ** add the shift amount to this value
  ** use modulus operation (% 26) to ensure that the value remains within the range of 0 to 25
  ** add 'a' to the resulting value to get the ASCII value of the new letter.
  ** add the new letter to the result character array
  */
  static void shiftEveryLetterByKN (String inputString, int k)
  {
    if (k < 0)
    {
      System.out.println("Invalid input");
      return;
    }
    
    char charsArray[] = new char[ inputString.length() ];

    for (int i = 0; i < inputString.length(); i++)
    {
      if ( inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z' )
        charsArray[i] = (char) ( ( (int) inputString.charAt(i) - 'a' + k) % 26 + 'a' );

      else 
        charsArray[i] = inputString.charAt(i);  
    }

    System.out.println( String.valueOf(charsArray) );
  }

  /**
  * Time Complexity = O(n)
  *
  * Similar to the above method, execpt a hash map is used to store the new letter to avoid recomputation
  */
  static void shiftEveryLetterByKUsingMap (String inputString, int k)
  {
    if (k < 0)
    {
      System.out.println("Invalid input");
      return;
    }

    HashMap <Character, Character> newLetter = new HashMap <Character, Character>();

    for (int i = 0; i < inputString.length(); i++)
    {
      if ( inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z' && !newLetter.containsKey( inputString.charAt(i) ) )
         newLetter.put( inputString.charAt(i), (char) ( ( (int) inputString.charAt(i) - 'a' + k) % 26 + 'a' ) );
    }

    String resultStr = "";

    for (int i = 0; i < inputString.length(); i++)
    {
      if ( newLetter.containsKey( inputString.charAt(i) ) )
        resultStr += newLetter.get( inputString.charAt(i) );

      else
        resultStr += inputString.charAt(i);  
    }

    System.out.println(resultStr);
  }
}

