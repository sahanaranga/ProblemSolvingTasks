/** 
* Problem Statement:
* You are given a fixed number of available characters which you need to use to make a signboard for a shop.  
* Write a function that determines if it is possible to generate the sign from the available set of characters. 
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    System.out.println();
    System.out.println("Test 1: True Testcase");

    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNM("bob'sdeli", "bhaanobsdzel'yia") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedN("bob'sdeli", "bhaanobsdzel'yia") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNLogN("bob'sdeli", "bhaanobsdzel'yia") );

    System.out.println();
    System.out.println("Test 2: False Testcase");

    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNM("bob'sdeli", "ohaanbdzelyi") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedN("bob'sdeli", "ohaanbdzelyi") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNLogN("bob'sdeli", "ohaanbdzelyi") );

    System.out.println();
    System.out.println("Test 3: Empty Sign Testcase");

    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNM("", "ohaanbdzelyi") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedN("", "ohaanbdzelyi") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNLogN("", "ohaanbdzelyi") );

    System.out.println();
    System.out.println("Test 4: Empty Given String Testcase");

    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNM("bob'sdeli", "") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedN("bob'sdeli", "") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNLogN("bob'sdeli", "") );

    System.out.println();
    System.out.println("Test 5: Both Empty String Testcase");

    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNM("", "") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedN("", "") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNLogN("", "") );

    System.out.println();
    System.out.println("Test 6: Sign String Longer than Given String");

    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNM("bobby'sstunningdeli", "bhobnbgndel'yria") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedN("bobby'sstunningdeli", "bhobnbgndel'yria") );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNLogN("bobby'sstunningdeli", "bhobnbgndel'yria") );


    System.out.println();
    System.out.println("Test 7: Random Testcase");

    Random random = new Random();
    
    int signLength = random.nextInt(10);
    String sign = "";

    for (int i = 0; i < signLength; i++)
      sign += (char) (random.nextInt(123 - 97) + 97);

    int givenCharsLength = random.nextInt(10);
    String givenChars = "";

    for (int i = 0; i < givenCharsLength; i++)
      givenChars += (char) (random.nextInt(123 - 97) + 97);

    System.out.println("Printing the input strings: Sign String = " + sign + "  Given String = " + givenChars);

    System.out.println();

    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNM(sign, givenChars) );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedN(sign, givenChars) );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNLogN(sign, givenChars) );


    System.out.println();
    System.out.println("Test 8: Random Testcase");

    String signStrList[] = {"bob'smarket", "storeofbob", "bob'sworldofgoods", "bob'sshop", "thebobshop"};

    String givenStrList[] = {"ketmar'bbnaoas", "obbsoodsofg'sxyzorldw", "abcdefghijklmno", "bshopofbo", "shoptheworlds"};

    int signStrListIndex = random.nextInt(5); 
    int givenStrListIndex = random.nextInt(5);

    System.out.println("Printing the strings: Sign String = " + signStrList[ signStrListIndex ] + " Given String = " + givenStrList[ givenStrListIndex ]);

    System.out.println();
    
    String signStr = signStrList[ signStrListIndex ];
    String givenStr = givenStrList[ givenStrListIndex ];

    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNM(signStr,givenStr) );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedN(signStr, givenStr) );
    System.out.println( GenerateSignFromStrSolution.canSignBeGeneratedNLogN(signStr, givenStr) );
  }
}
