/**
* Problem Statement:
* Given an array of integers, determine if the array has duplicate elements. 
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("\nTest 1: Duplicates Present Testcase");
    int numArray1[] = {5, 3, -1, 4, 5, 7, 9, -1};

    System.out.println( DuplicateElementsSolution.containsDuplicatesNSq( numArray1 ) );
    System.out.println( DuplicateElementsSolution.containsDuplicatesN( numArray1 ) );
    System.out.println( DuplicateElementsSolution.containsDuplicatesNLogN( numArray1 ) );

    System.out.println("\nTest 2: No Duplicates Testcase");
    int numArray2[] = {5, 3, -1, 4, 7, 9};

    System.out.println( DuplicateElementsSolution.containsDuplicatesNSq( numArray2 ) );
    System.out.println( DuplicateElementsSolution.containsDuplicatesN( numArray2 ) );
    System.out.println( DuplicateElementsSolution.containsDuplicatesNLogN( numArray2 ) );

    System.out.println("\nTest 3: Single Element Testcase");
    int numArray3[] = {5};

    System.out.println( DuplicateElementsSolution.containsDuplicatesNSq( numArray3 ) );
    System.out.println( DuplicateElementsSolution.containsDuplicatesN( numArray3 ) );
    System.out.println( DuplicateElementsSolution.containsDuplicatesNLogN( numArray3 ) );

    System.out.println("\nTest 4: No Elements Testcase");
    int numArray4[] = {};

    System.out.println( DuplicateElementsSolution.containsDuplicatesNSq( numArray4 ) );
    System.out.println( DuplicateElementsSolution.containsDuplicatesN( numArray4 ) );
    System.out.println( DuplicateElementsSolution.containsDuplicatesNLogN( numArray4 ) );



    System.out.println("\nTest 5: Random Testcase");
    
    Random random = new Random();

    int arrayLength = random.nextInt(10);
    int numArray5[] = new int[arrayLength];

    System.out.print("Printing the randomized array: ");

    for (int i = 0; i < arrayLength; i++)
    {
      numArray5[i] = random.nextInt(8 + 8) - 8;
      System.out.print(numArray5[i] + " ");
    }  

    System.out.println("\n");
    
    System.out.println( DuplicateElementsSolution.containsDuplicatesNSq( numArray5 ) );
    System.out.println( DuplicateElementsSolution.containsDuplicatesN( numArray5 ) );
    System.out.println( DuplicateElementsSolution.containsDuplicatesNLogN( numArray5 ) );
  }
}
