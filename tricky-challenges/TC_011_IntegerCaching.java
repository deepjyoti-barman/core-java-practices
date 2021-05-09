// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 09 (Sunday), 2021




/* 
    Program: Write a program and explain the concept Integer Caching comparing two numbers
*/
class TC_011_IntegerCaching
{
    public static void main(String[] args)
    {
        // Part 1 - Integer Caching
        // Because of Integer Caching both num1 and num2 both are auto-boxed and will take the actual value of num1 and num2
        // Integer caching range: -128 to +127
        Integer num1 = 100;
        Integer num2 = 100;

        if (num1 == num2)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");
        
        
        // Part 2 - Normal Case
        // If it exceeds the Integer Caching range the control will start comparing the references of the variables and not their actual values
        Integer num3 = 190;
        Integer num4 = 190;

        if (num3 == num4)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");
    }
}
