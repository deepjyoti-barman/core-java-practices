// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 10 (Monday), 2021




/* 
    Program: Write a program to demonstrate what will be the output when you use a Long number with L and without L as suffix
*/
class TC_015_LongWithAndWithoutL
{
    public static void main(String[] args)
    {
        // Actual result of multiplication = 31536000000
        // Max no of bits that an integer type can accommodate = 32 bits
        // Binary of 31536000000 -> 11101010111101100010010110000000000 -> 35 bits
        // (35 - 32) bits = 3 bits = Most significant 3 bits will be removed -> 111 from the LHS will be removed -> 01010111101100010010110000000000 = 1471228928
        long longNumWithoutL = 1000 * 60 * 60 * 24 * 365;       // 1471228928
        System.out.println("longNumWithoutL: " + longNumWithoutL);


        // Max no of bits that an integer type can accommodate = 64 bits
        long longNumWithL = 1000 * 60 * 60 * 24 * 365L;         // 31536000000
        System.out.println("longNumWithL: " + longNumWithL);
    }
}