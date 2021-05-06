// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 06 (Thursday), 2021




/* 
    Program: Given a string find the largest palindrome in it
    Input: EABCBAEDABDEEDBAABE
    Output: ABDEEDBA
*/
import java.util.*;

class CP_004_FindLargestPalindrome
{
    public static boolean isPalindrome(String str)
    {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

    public static String findLongestPalindrome1(String str)
    {
        if (str == null || str.equals(""))
            throw new InputMismatchException("Given string input cannot be empty");

        // TreeMap sorts its elements in ascending order of their keys
        // Knowing the above, We are creating a set up to sort all possible palindromes on the basis of length of their length
        TreeMap<Integer, String> palindromeMap = new TreeMap<>();

        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i + 1; j <= str.length(); j++)
            {
                String subStr = str.substring(i, j);

                if (isPalindrome(subStr))
                {
                    Integer length = subStr.length();
                    palindromeMap.put(length, subStr);
                }
            }
        }

        // Debug [Palindrome coverage is less because keys are the length of the patterns and we can't have duplicate keys]
        System.out.println("Palindromes [Algorithm_1]: " + palindromeMap);

        // Retrieve the last element of the TreeMap
        return palindromeMap.get(palindromeMap.lastKey());
    }

    public static String findLongestPalindrome2(String str)
    {
        if (str == null || str.equals(""))
            throw new InputMismatchException("Given string input cannot be empty");

        HashMap<String, Integer> palindromeMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i + 1; j <= str.length(); j++)
            {
                String subStr = str.substring(i, j);
                
                if (isPalindrome(subStr))
                {
                    Integer length = subStr.length();
                    palindromeMap.put(subStr, length);
                }
            }
        }

        // Debug [Palindrome coverage is more because keys are patterns and we can't have duplicate keys]
        System.out.println("Palindromes [Algorithm_2]: " + palindromeMap);

        // Retrieve the largest element of the HashMap
        return palindromeMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
    
    public static void main(String[] args)
    {
        String charSet1 = "EABCBAEDABDEEDBAABE";

        System.out.println("Longest Palindrome: " + findLongestPalindrome1(charSet1) + "\n");
        System.out.println("Longest Palindrome: " + findLongestPalindrome2(charSet1));
    }
}