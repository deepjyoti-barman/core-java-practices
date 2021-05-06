// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 05 (Wednesday), 2021




/* 
    Program: Guess the output of the following statement
        (byte) + (char) - (int) + (long) - 1
*/
class TC_005_GuessTheOutput1
{
    public static void main(String[] args)
    {
        // Direction of execution of the statement: RHS to LHS
        // + (long) - 1 = -1
        // - (int) -1 = 1
        // + (char) 1 = 1
        // (byte) 1 = 1
        byte result = (byte) + (char) - (int) + (long) - 1;
        System.out.println("Output: " +  result);
    }
}
