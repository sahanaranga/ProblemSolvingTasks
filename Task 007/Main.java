/** Problem Statement
*
* Write a function that takes in a string of lowercase English-alphabet letters and returns the index of the string's first non-repeating character.
* The first non-repeating character is the first character in a string that occurs only once. 
* If the input doesn't have any non-repeating characters, your function should return -1. 
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("\nTest 1: Positive testcase");
    System.out.println( FirstUniqueCharSolution.findFirstUniqueCharMap("sahanas") );
    System.out.println( FirstUniqueCharSolution.findFirstUniqueCharArray("sahanas") );
    System.out.println( FirstUniqueCharSolution.findFirstUniqueChar("sahanas") );

    System.out.println("\nTest 2: Negative testcase");
    System.out.println( FirstUniqueCharSolution.findFirstUniqueCharMap("amma") );
    System.out.println( FirstUniqueCharSolution.findFirstUniqueCharArray("amma") );
    System.out.println( FirstUniqueCharSolution.findFirstUniqueChar("amma") );

    System.out.println("\nTest 3: Empty String testcase");
    System.out.println( FirstUniqueCharSolution.findFirstUniqueCharMap("") );
    System.out.println( FirstUniqueCharSolution.findFirstUniqueCharArray("") );
    System.out.println( FirstUniqueCharSolution.findFirstUniqueChar("") );

    System.out.println("\nTest 4: String of Length 1 testcase");
    System.out.println( FirstUniqueCharSolution.findFirstUniqueCharMap("a") );
    System.out.println( FirstUniqueCharSolution.findFirstUniqueCharArray("a") );
    System.out.println( FirstUniqueCharSolution.findFirstUniqueChar("a") );

    System.out.println("\nTest 5: Random testcase");
    
    Random random = new Random();

    int strLength = random.nextInt(10 - 1) + 1;
    String inputStr = "";

    for (int i = 0; i < strLength; i++)
      inputStr += (char) (random.nextInt(106 - 97) + 97);

    System.out.println("Printing the input string: " + inputStr + "\n");

    System.out.println( FirstUniqueCharSolution.findFirstUniqueCharMap(inputStr) );
    System.out.println( FirstUniqueCharSolution.findFirstUniqueCharArray(inputStr) );
    System.out.println( FirstUniqueCharSolution.findFirstUniqueChar(inputStr) );
  }
}
