import java.util.*;

class PairWithMinDiffSolution
{
  /**
  * Time complexity = O(n^2)
  *
  * Using a nested for-loop, the absolute difference between each element in the first array and the elements of the second array are computed. 
  * If the difference is smaller than the value held in the variable minDiff, then the indices of the two array elements are stored in variables numInd1 and numInd2, and their difference is stored in minDiff.
  */
  static void findPairWithMinDiff (int[] numArray1, int[] numArray2)
  {
    int numInd1 = 0, numInd2 = 0, minDiff = Integer.MAX_VALUE;
    
    for (int i = 0; i < numArray1.length; i++)
    {
      for (int j = 0; j < numArray2.length; j++)
      {
        // If the absolute difference of the elements is less than minDiff
        if ( Math.abs(numArray1[i] - numArray2[j]) < minDiff )
        {
          // Store the indices and the new absolute minimum difference
          numInd1 = i;
          numInd2 = j;
          minDiff = Math.abs(numArray1[i] - numArray2[j]);
        }
      }
    }

    // Print the pair of numbers
    System.out.println( numArray1[ numInd1 ] + " " + numArray2[ numInd2 ] );
  }


  /**
  * Time complexity = O(n log n)
  * An object, ArrayNode, is used to hold the array element and the array to which it belongs to
  * The ArrayNodes from both arrays are added to an ArrayList, which is then sorted
  * In a for-loop, if an element and its adjacent element belong to different arrays, their absolute difference is computed and checked to see if its minimum
  * If it is minimum, the indices of the two elements in the ArrayList are stored in variables, and the minDiff variable holds the new absolute difference
  */
  static void findPairWithMinDiffSort (int[] numArray1, int[] numArray2)
  {
    ArrayList <ArrayNode> mergedArray = new ArrayList <ArrayNode>();

    // Adding the elements of numArray1 into the mergedArray
    for (int i = 0; i < numArray1.length; i++)
    {
      ArrayNode node = new ArrayNode( numArray1[i], 1 );
      mergedArray.add(node);
    }

    // Adding the elements of numArray2 into the mergedArray
    for (int i = 0; i < numArray2.length; i++)
    {
      ArrayNode node = new ArrayNode( numArray2[i], 2 );
      mergedArray.add(node);
    }

    // Sorting the array
    Collections.sort(mergedArray);

    int numInd1 = 0, numInd2 = 0, minDiff = Integer.MAX_VALUE;

    // Find the minimum absolute difference
    for (int i = 0; i < mergedArray.size() - 1; i++)
    {
      // If the current element and its adjacent element don't belong to the same array
      if ( mergedArray.get(i).arrayId != mergedArray.get(i + 1).arrayId )
      {
        // If the absolute difference of the elements is less than minDiff
        if ( Math.abs(mergedArray.get(i).num - mergedArray.get(i + 1).num) < minDiff )
        {
          // To ensure that the element from numArray1 gets printed first
          if (mergedArray.get(i).arrayId == 1)
          {
            numInd1 = i;
            numInd2 = i + 1;
          }

          else
          {
            numInd1 = i + 1;
            numInd2 = i;
          }
          
          // Storing the new minimum absolute difference
          minDiff = Math.abs(mergedArray.get(i).num - mergedArray.get(i + 1).num);
        }
      }
    }

    // Print the pair of numbers
    System.out.println( mergedArray.get(numInd1).num + " " + mergedArray.get(numInd2).num ) ;
  }
}

// Used to hold the array element and an id value to identify which array the element bellongs to
class ArrayNode implements Comparable <ArrayNode>
{
  int num; // The array element
  int arrayId; // To denote which array the element belongs to

  ArrayNode (int num, int arrayId)
  {
    this.num = num;
    this.arrayId = arrayId;
  }

  public int compareTo (ArrayNode otherNode)
  {
      return Integer.valueOf(this.num).compareTo( Integer.valueOf(otherNode.num) );
  }
}
