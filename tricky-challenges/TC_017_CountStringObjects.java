// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 12 (Wednesday), 2021




/* 
    Program: Write a program and show how many string objects are created using the following statements:
        String str1 = new String("Hello World");
        String str2 = new String("Hello World");
        String str3 = "Hello World";
        String str4 = "Hello World";
*/
class TC_017_CountStringObjects
{
    public static void main(String[] args)
    {
        // The following statement will create 2 objects in memory (one because of the String literal and one because of the new keyword)
        // First object will be created inside Heap Memory
        // Second object will be created inside String Constant Pool Area (SCP)
        // str1 will point to the object created inside Heap Memory
        String str1 = new String("Hello World");

        // The following statement will create 1 object in memory
        // The object will be created inside Heap Memory
        // Second object will not be created in String Constant Pool Area (SCP) because an object with the same name already exists there
        // str2 will point to the object created inside Heap Memory
        String str2 = new String("Hello World");

        // The following statement won't create any object
        // Object won't be created because object with the same content already exists in the String Constant Pool (SCP) area
        // str3 will point to the object created inside String Constant Pool (SCP) area
        String str3 = "Hello World";

        // The following statement won't create any object
        // Object won't be created because object with the same content already exists in the String Constant Pool (SCP) area
        // str3 will point to the object created inside String Constant Pool (SCP) area
        // str3 and str4 are pointing to the same object created inside String Constant Pool (SCP) area
        String str4 = "Hello World";

        System.out.println("str1 == str2: " + (str1 == str2));        // false
        System.out.println("str2 == str3: " + (str2 == str3));        // false
        System.out.println("str3 == str4: " + (str3 == str4));        // true
    }
}