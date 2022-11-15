// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 09 (Sunday), 2021




/* 
    Program: Print "Hello" without semicolon
*/
class TC_008_PrintHelloWithoutSemiColon
{
    public static void main(String[] args)
    {
        // Algorithm 1
        // We can't use println() or print() method of System class because the return type is void
        if (System.out.printf("Hello Dj\n") == null) { }

        // Algorithm 2
        if (System.out.append("Hello Deepjyoti\n") == null) { }

        // Algorithm 3
        if (System.out.printf("Hello GitHub\n").equals(null)) { }

        // Algorithm 4
        while (System.out.append("Hello World\n").equals(null)) { }
    }    
}