// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 05 (Wednesday), 2021




/* 
    Program: Given an integer array find out the missing number in sequence
    Input: [1, 2, 3, 5]
    Output: 4
*/
class TC_001_MissingElementInSeq
{
    public static int findMissingNum(int[] arr, int totalCount)
    {
        // Formula for summation of n elements, sum = n * (n + 1) / 2
        int expectedSum = totalCount * (totalCount + 1) / 2;
        int actualSum   = 0;

        for (int i : arr)
            actualSum = actualSum + i;

        return expectedSum - actualSum;
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 3, 4, 5};
        int missingNum = findMissingNum(arr, 5);

        System.out.println("Missing number: " + missingNum);
    }    
}