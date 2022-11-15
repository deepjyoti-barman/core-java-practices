// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Senior Quality Assurance Engineer
// Date                 : November 15 (Tuesday), 2022




/* 
    Program: Demonstrate the usage of labels on Java
*/
public class TC_023_JavaLabelUsage {

    public static void main(String[] args) {

        // Dummy usage - JVM will throw a warning but not a CTE
        System.out.println("Hello");
        label1:
        System.out.println("Bye");
        System.out.println("--------------------------------------");

        // Single loop
        label2:
        for(int i = 0; i < 10; i++) {
            System.out.println("i = " + i);

            if (i == 5)
                break label2;
        }
        System.out.println("--------------------------------------");

        // Multi-level loop
        outer:
        for(int i = 0; i < 10; i++) {
            System.out.println("i = " + i);

            inner:
            for (int j = 0; j < 10; j++) {
                
                if (j > 5)
                    continue inner;

                if (i == 2)
                    break outer;

                System.out.println("j = " + j);    
            }
        }
    }
}
