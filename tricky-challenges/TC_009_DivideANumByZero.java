// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 09 (Sunday), 2021




/* 
    Program: Write a program to demonstrate what will be the output when we divide numeric data of different types with zero (int, long, double, float)
*/
class TC_009_DivideANumByZero
{
    public static void main(String[] args)
    {
        // System.out.println(5 / 0);           // ArithmeticException
        // System.out.println(0 / 0);           // ArithmeticException

        System.out.println(9.0 / 0);            // Infinity
        System.out.println(12.33f / 0);         // Infinity
        System.out.println(19.99d / 0);         // Infinity
        System.out.println(10 / 0.0);           // Infinity
        System.out.println(12.33 / 0.0);        // Infinity

        System.out.println(0.0 / 0);            // NaN
        System.out.println(0 / 0.0);            // NaN
        System.out.println(0.0 / 0.0);          // NaN        
    }
}
