// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 09 (Sunday), 2021




/* 
    Program: Print 1 to 100 with using any numbers
*/
class TC_006_PrintNumbersWithoutNum
{
    // Algorithm 1: Using length of the string and characters
    public static void printNos1()
    {
        int startNum = 'A' / 'A';
        String endNum = "..........";

        for (int i = startNum; i <= endNum.length() * endNum.length(); i++)
            System.out.println(i);
    }
    
    // Algorithm 2: Using ASCII value of characters
    public static void printNos2()
    {
        int startNum = 'B' - 'A';

        for (int i = startNum; i <= 'd'; i++)
            System.out.println(i);
    }

    public static void main(String[] args)
    {
        System.out.println("1 to 100 without any numbers:");
        printNos1();
        System.out.println();
        

        System.out.println("1 to 100 without any numbers:");
        printNos2();
    }
}