/** 
* Problem Statement:
* Given a non-empty string of lowercase letters and a non-negative integer representing a key denoted by k, 
* write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet.
* Note that the letters should wrap around the alphabet, i.e., the letter āzā when shifted by one should return the letter āaā. 
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("\nTest 1");
    ShiftEveryLetterByKSolution.shiftEveryLetterByKN("hello world", 4);
    ShiftEveryLetterByKSolution.shiftEveryLetterByKUsingMap("hello world", 4);

    System.out.println("\nTest 2");
    ShiftEveryLetterByKSolution.shiftEveryLetterByKN("hello, world!", 6);
    ShiftEveryLetterByKSolution.shiftEveryLetterByKUsingMap("hello, world!", 6);

    System.out.println("\nTest 3: Negative value of k testcase");
    ShiftEveryLetterByKSolution.shiftEveryLetterByKN("hello world", -4);
    ShiftEveryLetterByKSolution.shiftEveryLetterByKUsingMap("hello world", -4);

    System.out.println("\nTest 4: Zero value of k testcase");
    ShiftEveryLetterByKSolution.shiftEveryLetterByKN("hello world", 0);
    ShiftEveryLetterByKSolution.shiftEveryLetterByKUsingMap("hello world", 0);

    System.out.println("\nTest 5: Random testcase");
    
    Random random = new Random();

    int k = random.nextInt(28);
    int strLen = random.nextInt(20);

    String inputStr = "";

    for (int i = 0; i < strLen; i++)
      inputStr += (char) (random.nextInt(126 - 94) + 94);

    System.out.println("Printing the input: \nString = " + inputStr + " \nk = " + k + "\n");

    ShiftEveryLetterByKSolution.shiftEveryLetterByKN(inputStr, k);
    ShiftEveryLetterByKSolution.shiftEveryLetterByKUsingMap(inputStr, k);  
  }
}
