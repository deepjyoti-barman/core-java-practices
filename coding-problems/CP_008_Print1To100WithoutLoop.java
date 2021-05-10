// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 07 (Friday), 2021




/* 
    Program: Print 1 to 10 without using any loop
    Input:  10
    Output: 1 2 3 4 5 6 7 8 9 10
*/
import java.util.stream.IntStream;

class CP_008_Print1To100WithoutLoop
{
    // Algorithm 1: Using recursion
    public static void printNum1(int num)
    {
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        
        // System.out.println(num);        // Prints 100 to 1
        printNum1(num - 1);
        System.out.print(num + " ");        // Prints 1 to 100
    }

    public static void printNum1(int startNum, int endNum)
    {
        if (startNum <= endNum)
        {
            System.out.print(startNum + " ");
            startNum++;
            printNum1(startNum, endNum);
        }
    }

    // Algorithm 2: Using streams (Java 8 and above)
    public static void printNum2(int startNum, int endNum)
    {
        // IntStream.rangeClosed(startNum, endNum).forEach(System.out::print);
        IntStream.rangeClosed(startNum, endNum).forEach(e -> System.out.print(e + " "));
    }

    public static void main(String[] args)
    {
        int startNum = 1;
        int endNum   = 10;

        System.out.println("Printing numbers from " + startNum + " to " + endNum + " using recursion:");
        printNum1(endNum);
        System.out.println("\n");

        System.out.println("Printing numbers from " + startNum + " to " + endNum + " using recursion:");
        printNum1(startNum, endNum);
        System.out.println("\n");

        System.out.println("Printing numbers from " + startNum + " to " + endNum + " using streams:");
        printNum2(startNum, endNum);
        System.out.println();
    }
}
