// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 10 (Monday), 2021




/* 
    Program: Write a demonstrate the answer of the following questions:
        1. What is the value of Double MIN_VALUE?
        2. Which one is bigger -> Double MIN_VALUE or 0.0d
        3. Which one is bigger -> Double MIN_VALUE or NEGATIVE_INFINITY?
*/
class TC_014_DoubleMinValueComparison
{
    public static void main(String[] args)
    {
        // MIN_VALUE for Double is a positive number
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);

        // MIN_VALUE for Long or Integer is a negative number
        System.out.println("Long MIN_VALUE: " + Long.MIN_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE + "\n");

        // Comparison 1
        // Math.min() method will return the maximum of two parameters passed as an argument to that method
        System.out.println("(Max of) Double MIN_VALUE vs 0.0d: " + Math.max(Double.MIN_VALUE, 0.0d));       // Double.MIN_VALUE
        System.out.println("(Max of) Float MIN_VALUE vs 0.0f: " + Math.max(Float.MIN_VALUE, 0.0f));         // Float.MIN_VALUE
        System.out.println("(Max of) Integer MIN_VALUE vs 0: " + Math.max(Integer.MIN_VALUE, 0) + "\n");    // 0

        // Comparison 2
        System.out.println("(Max of) Double MIN_VALUE vs Double NEGATIVE_INFINITY: " + Math.max(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));  // Double.MIN_VALUE
    }
}
