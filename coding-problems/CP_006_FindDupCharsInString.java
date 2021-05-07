// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 07 (Friday), 2021




/* 
    Program: Given a string find the duplicate characters along with their number of occurrences in it
    Input:  pineapple
    Output: e : 2
            p : 3

    Input: mango
    Output: No duplicate characters found in the string
*/
import java.util.*;

class CP_006_FindDupCharsInString
{
    public static boolean printDuplicateChars(String str)
    {
        // Check for the negative cases
        if (str == null)
            throw new InputMismatchException("Given string cannot be null");
            
        if (str.isEmpty())
            throw new InputMismatchException("Given string cannot be empty");

        if (str.length() == 1)
            throw new InputMismatchException("Given string cannot have only a single character");

        boolean duplicateExists = false;    
        char[] charArr = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for (Character ch : charArr)
        {
            if (charMap.containsKey(ch))
            {
                charMap.put(ch, charMap.get(ch) + 1);
                duplicateExists = true;
            }
            else
                charMap.put(ch, 1);
        }

        // Print the map
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet)
        {
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        return duplicateExists;
    }

    public static void main(String[] args)
    {
        String str = "pine";

        if (!printDuplicateChars(str))
            System.out.println("No duplicate characters found in the string");
    }
}
