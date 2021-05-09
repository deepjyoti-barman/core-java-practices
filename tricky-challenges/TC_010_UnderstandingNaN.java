// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 09 (Sunday), 2021




/* 
    Program: Write a program to demonstrate how can we come across with NaN in Java and how it is defined in other programming languages
*/
class TC_010_UnderstandingNaN
{
    public static void main(String[] args)
    {
        // Java
        System.out.println(0.0 / 0.0);      // NaN
        System.out.println(4.1 % 0);        // NaN
        System.out.println(Math.sqrt(-1));  // NaN

        // Comparing two NaN
        System.out.println(Float.NaN == Float.NaN);     // false
        System.out.println(Float.NaN != Float.NaN);     // true
        
        double nan = 2.1 % 0;
        System.out.println((2.1 % 0) == nan);           // false
        System.out.println(nan == nan);                 // false, can't compare two NaN because both of them are undefined numbers

        // JavaScript: NaN
        // C: -44410408 (Negative imaginary number)
        // C++: -nan
        // C#: NaN
        // Ruby: NaN
    }
}
