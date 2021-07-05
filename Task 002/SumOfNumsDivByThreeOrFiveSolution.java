// Two solutions are provided here

class SumOfNumsDivByThreeOrFiveSolution
{ 
  // Time complexity = O(n)
  static int findSumOfNumsDivByThreeOrFive (int num) 
  {
    // Checks if num is negative
    if (num < 0)
      return -1;

    int sumOfNumsDivBy3Or5 = 0;

    // Checks to see if numbers from 1 to num are divisible by 3 or 5; if so, then add it to the total sum found so far
    for (int i = 1; i < num; i++)
    {
      if (i % 3 == 0 || i % 5 == 0)
        sumOfNumsDivBy3Or5 += i;
    }

    return sumOfNumsDivBy3Or5;
  }


  /**
  * Time complexity = O(1)
  *
  * Example: if num = 10, then the numbers that are divisible by 3 or 5 are 3, 5, 6 and 9. The sum of these numbers is 23.
  ** It is found that 3 + 5 + 6 + 9 can be written as 3 (1 + 2 + 3) + 5 (1) 
  ** This is 3 * (n * (n-1))/2 + 5 (m * (m-1))/2, where n is num/3 and m is num/5
  */
  static int findSumOfNumsDivByThreeOrFiveOptimal (int num) 
  {
    // Checks if the given num is negative
    if (num < 0)
      return -1;
      
    return addNConsecutiveNums(num, 3) + addNConsecutiveNums(num, 5) - addNConsecutiveNums(num, 15);
  }

  static int addNConsecutiveNums (int lastNum, int number)
  {
    // Finds the maximum number, which when multiplied by "number", fals within the given range of 1 to lastNum 
    int lastPossibleNum = (lastNum-1) / number;

    // Uses the formula ( n * (n-1) )/2 to find the sum of all numbers from 1 to n, and multiplies this sum by the given number to find the sum of all multiples of the given number until n
    return number * ( ( lastPossibleNum * (lastPossibleNum + 1) ) / 2 );
  }
}
