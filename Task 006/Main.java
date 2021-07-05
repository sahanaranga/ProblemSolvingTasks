/** 
* Problem Statement:
* Given a non-empty string of lowercase letters and a non-negative integer representing a key denoted by k, 
* write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet.
* Note that the letters should wrap around the alphabet, i.e., the letter ‘z’ when shifted by one should return the letter ‘a’. 
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println();

    System.out.println("Test 1");
    ShiftEveryLetterByKSolution.shiftEveryLetterByKN("hello world", 4);
    ShiftEveryLetterByKSolution.shiftEveryLetterByKUsingMap("hello world", 4);

    System.out.println();

    System.out.println("Test 2");
    ShiftEveryLetterByKSolution.shiftEveryLetterByKN("hello, world!", 6);
    ShiftEveryLetterByKSolution.shiftEveryLetterByKUsingMap("hello, world!", 6);

    System.out.println();

    System.out.println("Test 3: Negative value of k testcase");
    ShiftEveryLetterByKSolution.shiftEveryLetterByKN("hello world", -4);
    ShiftEveryLetterByKSolution.shiftEveryLetterByKUsingMap("hello world", -4);

    System.out.println();

    System.out.println("Test 4: Zero value of k testcase");
    ShiftEveryLetterByKSolution.shiftEveryLetterByKN("hello world", 0);
    ShiftEveryLetterByKSolution.shiftEveryLetterByKUsingMap("hello world", 0);

    System.out.println();

    System.out.println("Test 5: Random testcase");
    
    Random random = new Random();

    int k = random.nextInt(28);
    int strLen = random.nextInt(20);

    String inputStr = "";

    for (int i = 0; i < strLen; i++)
      inputStr += (char) (random.nextInt(126 - 94) + 94);

    System.out.println("Printing the input: \nString = " + inputStr + " \nk = " + k);

    System.out.println();
    
    ShiftEveryLetterByKSolution.shiftEveryLetterByKN(inputStr, k);
    ShiftEveryLetterByKSolution.shiftEveryLetterByKUsingMap(inputStr, k);  
  }
}
