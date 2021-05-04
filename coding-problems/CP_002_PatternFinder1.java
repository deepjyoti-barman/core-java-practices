// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 02 (Sunday), 2021




/* 
    Program: Given a number N, check if the binary representation of N contains a pattern of 01 and 10 only.
    Input: 4 2 3 4 5
    Output: YES NO NO YES

    Hint: First element represents the number of inputs to be considered (i.e. 4)
    2 = 10 = YES (10 pattern is present)
    3 = 11 = NO (10 and 01 both patterns are not present)
    4 = 100 = NO (10 pattern is present but, another pattern 00 is present so we should not consider this)
    5 = 101 = YES (10 and 01 both the patterns are present)

*/
import java.util.*;

class CP_002_PatternFinder1
{
    public static String decToBin(int m)
    {
        return Integer.toBinaryString(m);
    }

    // Algorithmic Complexity: O(n)
    public static boolean patternEvaluator1(int n)
    {
        String binary = decToBin(n);
        Set<String> patterns = new HashSet<>();
        List<String> selectedPatterns = Arrays.asList(new String[]{"01", "10"});

        // 1010 => 10, 01, 10 => No of times to iterate = 3 = length of the string - 1
        for (int i = 0; i < binary.length() - 1; i++)
        {
            String pattern = binary.substring(i, i + 2);
            patterns.add(pattern);
        }

        patterns.removeAll(selectedPatterns);

        return patterns.size() == 0 ? true : false;
    }

    // Algorithmic Complexity: O(1)
    public static boolean patternEvaluator2(int n)
    {
        String binary = decToBin(n);

        // 4 patterns of length 2 can be there combining 0 and 1 (i.e. 00, 01, 10, 11)
        // We need to check other than 01 and 10 if any other patters are there or not
        if (binary.contains("00") || binary.contains("11"))
            return false;

        return true;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your inputs:");
        int noOfInputs = scan.nextInt();

        for (int t = 0; t < noOfInputs; t++)
        {
            int N = scan.nextInt();
            System.out.print(patternEvaluator1(N) ? "YES " : "NO ");
        }
        System.out.println("\n");

        System.out.println("Enter your inputs:");
        noOfInputs = scan.nextInt();

        for (int t = 0; t < noOfInputs; t++)
        {
            int N = scan.nextInt();
            System.out.print(patternEvaluator2(N) ? "YES " : "NO ");
        }
        System.out.println();

        scan.close();
    }
}
