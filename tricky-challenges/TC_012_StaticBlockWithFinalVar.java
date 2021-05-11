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
    // Loads the class, invokes the static block and prints the value of a
    // public static int a = 100;

    // Loads the class, invokes the static block and prints the value of a
    // public final int a = 100;
    // The above variable can't be directly accessed via class name. You have to create the object of class DemoStatic during which the class will be loaded and static block will be executed [new DemoStatic().a]

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
        // The following statement executes only, a = 100
        // Java to improve the performance of code execution it replaces, 'DemoStatic.a' with 100 and does not load the class DemoStatic, instead it will load the value from the metaspace or common memory allocation. So the static block of that class does not even get invoked (Can be proved via Java De-compiler)
        System.out.println("a = " + DemoStatic.a);      
    }
}
