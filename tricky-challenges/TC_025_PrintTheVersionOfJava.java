// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Senior Quality Assurance Engineer
// Date                 : November 16 (Wednesday), 2022




/* 
    Program: Print the version of Java installed on your system via a program
*/
import java.lang.Runtime.Version;

public class TC_025_PrintTheVersionOfJava {

    public static void main(String[] args) {

        // Java 9 or above
        Version version = Runtime.version();
        System.out.println("Java version = " + version);                                                // Java version = 17.0.4.1+1-LTS-2

        // Any version of Java
        System.out.println("Java version = " + System.getProperty("java.version"));                 // Java version = 17.0.4.1
        System.out.println("Java version = " + System.getProperty("java.specification.version"));   // Java version = 17
    }
}
