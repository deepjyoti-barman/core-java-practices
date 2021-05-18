// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 07 (Friday), 2021




/* 
    Program: Given a string and a character, count the occurrences of the character in the string
    Input:  I love apple more than a mango
            a
    Output: 3
*/
class CP_005_CountCharOccurrence
{
    // Algorithm 1: Using character array
    public static int getCharCount1(String str, char searchableChar)
    {
        int count = 0;

        for (char ch : str.toCharArray())
        {
            if (ch == searchableChar)
                count++;
        }

        return count;
    }

    // Algorithm 2: Using charAt() method
    public static int getCharCount2(String str, char searchableChar)
    {
        int count = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == searchableChar)
                count++;
        }

        return count;
    }

    // Algorithm 3: Using streams (Java 8 and above)
    public static int getCharCount3(String str, char searchableChar)
    {
        long count = str.chars()
                        .mapToObj(e -> String.valueOf((char) e))
                        .filter(e -> e.equals(String.valueOf(searchableChar)))
                        .count();
        return (int) count;
    }

    // Algorithm 4: Using streams in a simpler way (Java 8 and above)
    public static int getCharCount4(String str, char searchableChar)
    {
        // Use the following to find occurrences of multiple characters
        // filter(e -> (char) e == searchableChar1 || (char) e == searchableChar2)
        long count = str.chars()
                        .filter(e -> (char) e == searchableChar)
                        .count();

        return (int) count;
    }

/*
    // Algorithm 5: Using StringUtils (Part of Apache Commons Lang 3rd party library)
    public static int getCharCount5(String str, char searchableChar)
    {
        return StringUtils.countMatches(str, String.valueOf(searchableChar));
    }
*/
    
    public static void main(String[] args)
    {
        String str        = "I love apple more than a mango";
        char charToSearch = 'a';
        
        System.out.printf("Character '%c' is found %d time(s) in the string\n", charToSearch, getCharCount1(str, charToSearch));
        System.out.printf("Character '%c' is found %d time(s) in the string\n", charToSearch, getCharCount2(str, charToSearch));
        System.out.printf("Character '%c' is found %d time(s) in the string\n", charToSearch, getCharCount3(str, charToSearch));
        System.out.printf("Character '%c' is found %d time(s) in the string\n", charToSearch, getCharCount4(str, charToSearch));
    }
}