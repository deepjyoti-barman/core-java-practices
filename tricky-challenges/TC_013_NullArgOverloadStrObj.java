// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 10 (Monday), 2021




/* 
    Program: Write a program to demonstrate which method will be called if we pass null argument with method overloading with String and Object types
*/
class TC_013_NullArgOverloadStrObj
{
    public static void test(String str)
    {
        System.out.println("Method of 'String' type is invoked");
    }

    public static void test(Object obj)
    {
        System.out.println("Method of 'Object' type is invoked");
    }

    // Following overloaded method won't work because String and StringBuffer / StringBuilder is on the same hierarchy level, hence we will get a compile time error
    // public static void test(StringBuilder obj)
    // {
    //     System.out.println("Method of 'Object' type is invoked");
    // }

    public static void main(String[] args) 
    {
        // Calls the method of String type
        test(null);

        // To explicitly call the method of Object type
        test((Object) null);
    }
}
