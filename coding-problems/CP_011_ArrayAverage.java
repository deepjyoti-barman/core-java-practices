// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 17 (Monday), 2021




/* 
    Program: Given an array find the average of all its elements
*/
import java.util.Arrays;
import java.util.OptionalDouble;

class CP_011_ArrayAverage
{
    // Algorithm 1: Using Java
    public static double avg1(int[] arr)
    {
        double total = 0;

        for (int i : arr)
            total = total + i;
        
        return total / arr.length;
    }

    // Algorithm 2: Using Java Streams (Java 8 and above)
    public static double avg2(int[] arr)
    {
        OptionalDouble avg = Arrays.stream(arr).average();
        return avg.getAsDouble();
    }

    // Algorithm 3: Using Google Guava Libraries
    // public static double avg3(int[] arr)
    // {
    //     return DoubleMath.mean(arr);
    // }

    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 6, 1, 3, 8};

        System.out.println("Average: " + avg1(numbers));
        System.out.println("Average: " + avg2(numbers));   
    }
}