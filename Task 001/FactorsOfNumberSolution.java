/** 
  * time complexity = O(n^1/2)
  *
  * By iterating up the square root value of num, we will be able to find all the factors of num
  * Example: say num = 24
  ** 1 x 24 = 24
  ** 2 x 12 = 24
  ** 3 x 8 = 24
  ** 4 x 6 = 24
  * we can see that by iterating upto to 4 (sqrt(24) equates to 4), we will be able to find all the factors of 24 
  */

class FactorsOfNumberSolution
{
  static void factorsSqrtN (int num) 
  {
    // Checks if num is negative
    if (num < 0)
    {
      System.out.println("Invalid input");
      return;
    }

  // Checks if num is zero 
    else if (num == 0)
    {
      System.out.println(0);
      return;
    }

  // Checks and prints all the numbers that can divide num
    for (int i = 1; i <= Math.sqrt(num); i++)
    {
      if (num % i == 0)
      {
        if (num / i != i)
          System.out.print(i + " " + num/i + " ");

        else
          System.out.print(i + " ");
      }
    }

    System.out.println();
  }
}
