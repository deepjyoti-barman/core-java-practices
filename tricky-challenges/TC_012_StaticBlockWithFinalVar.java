// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 09 (Sunday), 2021




/* 
    Program: Write a program to demonstrate that a class having a final static variable is not loaded when we call the static final variable of that class from another class
*/
class DemoStatic
{
    // Loads the class, invokes static block and prints the value of a
    // public static int a = 100;

    // Prints only the values of a
    public static final int a = 100;

    static
    {
        System.out.println("----- Static block (DemoStatic.class) -----");
    }
}

class TC_012_StaticBlockWithFinalVar
{
    public static void main(String[] args)
    {
        // The following statement only executes only, a = 100
        // Java to improve the performance of code execution it replaces, 'DemoStatic.a' with 100 and does not load the class DemoStatic, so static block of that class does not even get invoked (Can be proved via Java De-compiler)
        System.out.println("a = " + DemoStatic.a);      
    }
}
