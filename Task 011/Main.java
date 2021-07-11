/** 
* Problem Statement
* 
* Given an array of positive integers. All numbers occur an even number of times except one number which occurs an odd number of times.
*/

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("\nTest 1");

    int numArray1[] = {1, 2, 3, 2, 3, 1, 3};
    OddNumOfOccurrencesSolution.findOddOccurrence( numArray1 );
    OddNumOfOccurrencesSolution.findOddOccurrenceMap( numArray1 );
    OddNumOfOccurrencesSolution.findOddOccurrenceXOR( numArray1 );

    System.out.println("\nTest 2");

    int numArray2[] = {5, 7, 2, 7, 5, 2, 5};
    OddNumOfOccurrencesSolution.findOddOccurrence( numArray2 );
    OddNumOfOccurrencesSolution.findOddOccurrenceMap( numArray2 );
    OddNumOfOccurrencesSolution.findOddOccurrenceXOR( numArray2 );

    System.out.println("\nTest 3");

    int numArray3[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
    OddNumOfOccurrencesSolution.findOddOccurrence( numArray3 );
    OddNumOfOccurrencesSolution.findOddOccurrenceMap( numArray3 );
    OddNumOfOccurrencesSolution.findOddOccurrenceXOR( numArray3 );

    System.out.println("\nTest 4");

    int numArray4[] = {5, 7, 2, 7, 5, 2};
    OddNumOfOccurrencesSolution.findOddOccurrence( numArray4 );
    OddNumOfOccurrencesSolution.findOddOccurrenceMap( numArray4 );
    OddNumOfOccurrencesSolution.findOddOccurrenceXOR( numArray4 );
  }
}
