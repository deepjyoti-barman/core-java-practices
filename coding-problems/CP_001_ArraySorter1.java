// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : Test Yantra Software Solutions (India) Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : April 22 (Thursday), 2021




/* 
    Program: Given an array sort it in the following order
    Input: [0, 0, 1, 2, 0, -3, 0, 0, 5]
    Output: [1, 2, -3, 5, 0, 0, 0, 0, 0]
*/
import java.util.*;

class CP_001_ArraySorter1
{
    // Algorithmic Complexity: O(n^2)
    public static int[] sortArray1(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            // Try to find zero in the array
            if (arr[i] == 0)
            {            
                for (int j = i + 1; j < arr.length; j++)
                {
                    // Then find the next non-zero element and swap with it
                    if (arr[j] != 0)
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        break;
                    }
                }
            }
        }

        return arr;
    }

    // Algorithmic Complexity: O(n log n) 
    public static int[] sortArray2(int[] arr)
    {
        int[] sortedArray = new int[arr.length];
        int indexTracker = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != 0)
                sortedArray[indexTracker++] = arr[i];
        }

        while (indexTracker < sortedArray.length)
            sortedArray[indexTracker++] = 0;

        return sortedArray;
    }

    // Algorithmic Complexity: O(n^2) 
    public static int[] sortArray3(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            // Try to find zero in the array
            if (arr[i] == 0)
            {
                // Then shift all the elements on the RHS from ith position to left by one 
                for (int j = i; j < arr.length - 1; j++)
                    arr[j] = arr[j + 1];

                // Place zero on the last index position
                arr[arr.length - 1] = 0;
            }
        }

        return arr;
    }
    
    public static void main(String[] args)
    {
        int[] arr1 = {0, 0, 1, 2, 0, -3, 0, 0, 5};
        int[] arr2 = {1, 0, 2, 0, 3, 0};

        System.out.println("Output [Array_1 | Algorithm_1]: " + Arrays.toString(sortArray1(arr1)));
        System.out.println("Output [Array_2 | Algorithm_1]: " + Arrays.toString(sortArray1(arr2)) + "\n");

        System.out.println("Output [Array_1 | Algorithm_2]: " + Arrays.toString(sortArray2(arr1)));
        System.out.println("Output [Array_2 | Algorithm_2]: " + Arrays.toString(sortArray2(arr2)) + "\n");

        System.out.println("Output [Array_1 | Algorithm_3]: " + Arrays.toString(sortArray3(arr1)));
        System.out.println("Output [Array_2 | Algorithm_3]: " + Arrays.toString(sortArray3(arr2)));
    }
}