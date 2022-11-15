// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Senior Quality Assurance Engineer
// Date                 : November 15 (Tuesday), 2022




/* 
    Program: Demonstration of concatenation on Strings
*/
public class TC_022_ConcatOnStrings {

    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        a.concat(b);
        String c = a.concat(b);

        System.out.println(a);          // abc -> as String objects are immutable in nature
        System.out.println(c);          // abcabc -> Created a String in string constant pool area
    }
}
