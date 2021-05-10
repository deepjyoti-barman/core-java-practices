// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 10 (Monday), 2021




/* 
    Program: Given an array find the duplicate elements along with their number of occurrences in it
    Input:  ["Amazon", "GCP", "Azure", "Amazon", "Azure"]
    Output: ["Amazon", "Azure"]
*/
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class CP_007_FindDupElementsInArray
{
    // Algorithm 1: Brute force approach, [Complexity: O(n^2)]]
    public static void findDuplicates1(String[] strArr) 
    {
        List<String> duplicates = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++)
        {
            for (int j = i + 1; j < strArr.length; j++)
            {
                if (strArr[i].equals(strArr[j]))
                    duplicates.add(strArr[i]);
            }
        }

        System.out.println(duplicates);
    }

    // Algorithm 2: Using HashSet
    public static void findDuplicates2(String[] strArr)
    {
        Set<String> dataSet     = new HashSet<>();
        List<String> duplicates = new ArrayList<>();
        
        for (String str : strArr)
        {
            if (dataSet.add(str) == false)
                duplicates.add(str);
        }

        System.out.println(duplicates);
    }

    // Algorithm 3: Using HashMap
    public static void findDuplicates3(String[] strArr)
    {
        Map<String, Integer> dataMap = new HashMap<>();
        List<String> duplicates      = new ArrayList<>();

        for (String str : strArr)
        {
            Integer count = dataMap.get(str);

            // We can build similar type of logic with dataMap.containsKey() as well
            if (count == null)
                dataMap.put(str, 1);
            else
                dataMap.put(str, ++count);
        }

        Set<Map.Entry<String, Integer>> entrySet = dataMap.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet)
        {
            if (entry.getValue() > 1)
                duplicates.add(entry.getKey());
        }
        
        System.out.println(duplicates);
    }

    // Algorithm 4: Using Java Streams with Set and filter() (Java 8 and above)
    public static void findDuplicates4(String[] strArr)
    {
        Set<String> dataSet = new HashSet<>();

        Set<String> dupSet  = Arrays.asList(strArr)
                                    .stream()
                                    .filter(e -> !dataSet.add(e))
                                    .collect(Collectors.toSet());

        System.out.println(dupSet);
    }

    // Algorithm 5: Using Java Streams with groupingBy() (Java 8 and above)
    public static void findDuplicates5(String[] strArr)
    {
        Set<String> dupSet  = Arrays.asList(strArr)
                                    .stream()
                                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                    .entrySet()
                                    .stream()
                                    .filter(e -> e.getValue() > 1)
                                    .map(Map.Entry::getKey)
                                    .collect(Collectors.toSet());
        
        System.out.println(dupSet);                                  
    }

    // Algorithm 4: Using Java Streams with frequency() (Java 8 and above)
    public static void findDuplicates6(String[] strArr)
    {
        List<String> dataList = Arrays.asList(strArr);
        
        Set<String> dupSet    = dataList.stream()
                                        .filter(e -> Collections.frequency(dataList, e) > 1)
                                        .collect(Collectors.toSet());
        System.out.println(dupSet);
    }

    public static void main(String[] args)
    {
        String[] infra = {"Amazon", "Azure", "GCP", "Amazon", "Azure", "Ali Baba", "GCP", "SauceLabs"};

        System.out.println("----- Duplicates values using Brute Force -----");
        findDuplicates1(infra);

        System.out.println("\n----- Duplicates values using HashSet -----");
        findDuplicates2(infra);

        System.out.println("\n----- Duplicates values using HashMap -----");
        findDuplicates3(infra);
        
        System.out.println("\n----- Duplicates values using Java Streams with Set and filter() -----");
        findDuplicates4(infra);

        System.out.println("\n----- Duplicates values using Java Streams with groupingBy() -----");
        findDuplicates5(infra);

        System.out.println("\n----- Duplicates values using Java Streams with frequency() -----");
        findDuplicates6(infra);
    }
}