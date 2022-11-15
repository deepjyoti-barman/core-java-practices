// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Senior Quality Assurance Engineer
// Date                 : November 15 (Tuesday), 2022




/* 
    Program: Given an array join all its elements in the following format
    Input: ["t", "r", "v"]
    Output: trv
    Output: t|r|v
    Output: t;r;v
*/
import java.util.Arrays;
import java.util.stream.Collectors;

public class TC_021_ArrayElementJoiner {

    public static String joiner(String separator, String... arr) {
        StringBuilder sb = new StringBuilder();

        for (String element : arr) {
            if (element != null) {
                sb.append(element);
                sb.append(separator);
            }
        }

        return sb.substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {

        String[] arr = {"t", "r", "v"};
        
        // Algorithm 1 - String.join()
        String completeString = String.join("", arr);
        System.out.println(completeString);

        // Algorithm 2 - Stream API
        String joinedString1 = Arrays.asList(arr).stream().collect(Collectors.joining(";"));
        System.out.println(joinedString1);

        // Algorithm 3 - StringBuilder
        String joinedString2 = joiner("|", arr);
        System.out.println(joinedString2);

        // Joining Integer arrays
        Integer[] intArr = {1, 2, 3, 4, 5};
        String joinedInt = Arrays.asList(intArr).stream().map(e -> String.valueOf(e)).collect(Collectors.joining("-"));
        System.out.println(joinedInt);
    }
}
