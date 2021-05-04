// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : Test Yantra Software Solutions (India) Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : April 22 (Thursday), 2021




/* 
    Program: Given an array find the second largest element of in it
    Input: [0, 0, 1, 2, 0, -3, 0, 0, 5]
    Output: 2
*/
import java.util.*;

class CP_003_SecondLargest
{
    public static int findSecondLargest1(int[] arr)
    {
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        
        for (int i = arr.length - 2; i >= 0; i--)
        {
            if (arr[i] != largest)
                return arr[i];
        }

        return Integer.MAX_VALUE;
    }

    public static int findLargest(int[] arr)
    {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    public static int findSecondLargest2(int[] arr)
    {
        int max = findLargest(arr);
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > secondMax && max != arr[i])
                secondMax = arr[i];
        }

        return (secondMax == max) ? Integer.MAX_VALUE : secondMax;
    }

    public static int findSecondLargest3(int[] arr)
    {
        int max, secondMax;
        max = secondMax = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }

        return (secondMax == max) ? Integer.MAX_VALUE : secondMax;
    }

    public static void main(String args[])
    {
        int[] arr = {0, 0, 1, 2, 0, -3, 0, 0, 5};
        // int[] arr = {2, 2, 2, 2};

        int secondLargest1 = findSecondLargest1(arr);
        System.out.println("Second Largest: " + ((secondLargest1 == Integer.MAX_VALUE) ? "Does not exist" : secondLargest1));

        int secondLargest2 = findSecondLargest2(arr);
        System.out.println("Second Largest: " + ((secondLargest2 == Integer.MAX_VALUE) ? "Does not exist" : secondLargest2));

        int secondLargest3 = findSecondLargest3(arr);
        System.out.println("Second Largest: " + ((secondLargest3 == Integer.MAX_VALUE) ? "Does not exist" : secondLargest3));
    }
}