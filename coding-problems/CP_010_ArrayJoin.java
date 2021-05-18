// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 17 (Monday), 2021




/* 
    Program: Given two array join them together into a single array
*/
import java.util.Arrays;
import java.util.stream.Stream;

class CP_010_ArrayJoin
{
    // Algorithm 1: Using Java
    public static String[] join1(String[] arr1, String[] arr2)
    {
        String[] combo = new String[arr1.length + arr2.length];
        int index      = 0;

        for (String s : arr1)
            combo[index++] = s;
        
        for (String s : arr2)
            combo[index++] = s;

        return combo;
    }

    // Algorithm 2: Using Java Streams (Java 8 or above)
    public static String[] join2(String[] arr1, String[] arr2)
    {
        Stream<String> sBat = Arrays.stream(arr1);
        Stream<String> sBow = Arrays.stream(arr2);

        String[] combo = Stream.concat(sBat, sBow).toArray(size -> new String[size]);
        return combo;
    }

    // Algorithm 3: Using Google Guava Library [Object / Class types]
    // public static String[] join3(String[] arr1, String[] arr2)
    // {
    //     String[] combo = ObjectArrays.concat(arr1, arr2, Sting.class);
    //     return combo;
    // }

    // Algorithm 4: Using Google Guava Library [Primitive types]
    // public static int[] join4(int[] arr1, int[] arr2)
    // {
    //     int[] combo = Ints.concat(p1, p2);
    //     return combo;
    // }

    public static void main(String[] args)
    {
        String[] batsman = {"Rohit", "Virat", "Dhawan", "Shreyas", "Rishabh", "Raina"};
        String[] bowlers = {"Bumrah", "Shami", "Bhuvaneshwar", "Hardik", "Chahal", "Jadeja"};

        String[] teamList1 = join1(batsman, bowlers);
        System.out.println("Indian Team: " + Arrays.toString(teamList1) + "\n");

        String[] teamList2 = join2(batsman, bowlers);
        System.out.println("Indian Team: " + Arrays.toString(teamList2));
    }
}
