// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 10 (Monday), 2021




/* 
    Program: Write a program to find the length of a string without using length() method of String class
*/
import java.util.regex.*;

class TC_016_StrLengthWithoutLengthMethod
{
    // Algorithm 1: Using the length property
    public static int getLength1(String str)
    {
        return str.toCharArray().length;
    }

    // Algorithm 2: Using lastIndexOf() method
    public static int getLength2(String str)
    {
        return str.lastIndexOf("");
    }

    // Algorithm 3: Using split() method
    public static int getLength3(String str)
    {
        return str.split("").length;
    }

    // Algorithm 4: Using length() method of StringBuilder() class
    public static int getLength4(String str)
    {
        return new StringBuilder(str).length();
    }

    // Algorithm 5: Using regular expression
    public static int getLength5(String str)
    {
        // $ represents the end of the string
        Matcher match = Pattern.compile("$").matcher(str);
        match.find();

        return match.end();
    }

    // Algorithm 6: Using for-each loop
    public static int getLength6(String str)
    {
        int length = 0;

        for (char ch : str.toCharArray())
            length++;

        return length;
    }

    // Algorithm 7: Using try-catch block and charAt() method
    public static int getLength7(String str)
    {
        int length = 0;

        try
        {
            while (true)
            {
                str.charAt(length);
                length++;
            }
        }
        catch (IndexOutOfBoundsException iobe)
        {
            return length;
        }
    }

    // Algorithm 8: Using try-catch block and getBytes() method
    public static int getLength8(String str)
    {
        int length = 0;

        try
        {
            // length = str.getBytes("UTF-16BE").length / 2;
            length = str.getBytes("UTF-8").length;
        }
        catch (Exception e) { }

        return length;
    }

    // Algorithm 9: Using split() and toCharArray() methods together
    public static int getLength9(String str)
    {
        String[] strArr = str.split("");

        int length = 0;

        for (String s : strArr)
            length = length + s.toCharArray().length;

        return length;
    }

    public static void main(String[] args)
    {
        String str = "Programming in Java";

        System.out.println("Length of str using length property: " + getLength1(str));
        System.out.println("Length of str using lastIndexOf(): " + getLength2(str));
        System.out.println("Length of str using split(): " + getLength3(str));
        System.out.println("Length of str using length() of StringBuilder: " + getLength4(str));
        System.out.println("Length of str using regular expression: " + getLength5(str));
        System.out.println("Length of str using for-each loop: " + getLength6(str));
        System.out.println("Length of str using try-catch block and charAt(): " + getLength7(str));
        System.out.println("Length of str using try-catch block and getBytes(): " + getLength8(str));
        System.out.println("Length of str using split() and toCharArray() methods together: " + getLength9(str));
    }
}
