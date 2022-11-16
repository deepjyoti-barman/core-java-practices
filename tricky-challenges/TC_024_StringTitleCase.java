// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Senior Quality Assurance Engineer
// Date                 : November 15 (Tuesday), 2022




/* 
    Program: Convert the given string into title case
    Input: naveen automation labs
    Output: Naveen Automation Labs
*/
import java.util.Arrays;
import java.util.stream.Collectors;

public class TC_024_StringTitleCase {

    public static String strToTitleCase(String str) {

        // java.lang.String.isBlank() return true if the string is empty or contains only white space
        if (str == null || str.isBlank())
            return str;

        if (str.length() == 1) {
            return Character.toTitleCase(str.charAt(0)) + str.substring(1).toLowerCase();
        }

        // word.isEmpty(): saves the program from throwing StringIndexOutOfBoundsException when multiple spaces are there in-between words
        return Arrays.stream(str.split("\\s"))
            .map(word -> word.isEmpty() ? word : Character.toTitleCase(word.charAt(0)) + word.substring(1).toLowerCase())
            .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {

        System.out.println(strToTitleCase(null));
        System.out.println(strToTitleCase(""));
        System.out.println(strToTitleCase("          "));
        System.out.println(strToTitleCase("naveen"));
        System.out.println(strToTitleCase("naveen automation labs"));
        System.out.println(strToTitleCase("123  n aUtOmaTion LABS"));
    }
}
