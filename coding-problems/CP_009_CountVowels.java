// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 17 (Monday), 2021




/* 
    Program: Given a string count the number of vowels in it
    Input:  Apple
    Output: 2
*/
import java.util.function.IntPredicate;

class CP_009_CountVowels
{
    public static boolean isVowel(char c)
    {
        char ch = Character.toLowerCase(c);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Algorithms 1: Using Java
    public static int countVowels1(String s)
    {
        int count = 0;

        for (char c : s.toCharArray())
        {
            if (isVowel(c))
                count++;
        }

        return count;
    }

    // Algorithm 2: Using Streams (Java 8 or above)
    public static int countVowels2(String s)
    {
        // Short way
        // long count = s.chars().filter(e -> e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u' || e =='A' || e == 'E' || e == 'I' || e == 'O' || e == 'U').count();

        // Lengthy way
        IntPredicate vowels = new IntPredicate() {
            @Override
            public boolean test(int t)
            {
                return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
                    t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
            }
        };

        long count = s.chars().filter(vowels).count();
        return (int) count;
    }

    // Algorithm 3: Using Google Guava library [Guava: Google Core Libraries for Java]
    // public static int countVowels3(String s)
    // {
    //     int count = CharMatcher.anyOf("aeiouAEIOU").countIn(s);
    //     return count;
    // }

    public static void main(String[] args)
    {
        String str = "Apple";

        System.out.println("Vowels count: " + countVowels1(str));
        System.out.println("Vowels count: " + countVowels2(str));
        
    }
}