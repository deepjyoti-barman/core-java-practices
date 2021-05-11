// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : Test Yantra Software Solutions (India) Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 11 (Tuesday), 2021




/*
    Program: Demonstrate the use of StringJoiner class
*/
import java.util.StringJoiner;

class J8_001_StringJoiner
{
    public static void main(String[] args)
    {
        // StringJoiner was introduced in JDK 1.8
        // It is used for joining separate strings into one adding a delimiter in between like , - blank_space etc
        // You may add prefix and suffix as well (Optional)
        // StringJoiner: Constructor 1 (with only delimiter)
        StringJoiner sJoiner1 = new StringJoiner(" - ");
        sJoiner1.add("Neha");
        sJoiner1.add("Deepjyoti");
        sJoiner1.add("Rahul");

        System.out.println("Output String1: " + sJoiner1.toString());


        // StringJoiner: Constructor 2 (with delimiter, prefix and suffix)
        StringJoiner sJoiner2 = new StringJoiner(", ", "[", "]");
        sJoiner2.add("Tom")
                .add("Jerry")
                .add("Silvester");
        
        System.out.println("Output String2: " + sJoiner2.toString());
    }
}