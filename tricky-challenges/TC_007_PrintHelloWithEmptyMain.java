// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 09 (Sunday), 2021




/* 
    Program: Print the message "Hello" without writing any statements inside main() method
*/
class TC_007_PrintHelloWithEmptyMain
{
    static String str = printName();

    static
    {
        System.out.println("Hello Deepjyoti");
    }

    public static String printName()
    {
        System.out.println("Hello World");
        return null;
    }

    public static void main(String[] args) { }
}
