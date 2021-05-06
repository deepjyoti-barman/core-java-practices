// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 05 (Wednesday), 2021




/* 
    Program: Create a string language translator or auto bots in Java
*/
import java.lang.reflect.Field;

class TC_004_StringLanguageTranslator
{
    static
    {
        try
        {
            // With the use of Reflection API we are fetching the string objects getting created inside String constant pool area, granting accessible permission for those objects and modifying the values
            Field value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello Deepjyoti", value.get("Hi Deepjyoti, How are you?"));
            value.set("Wish you have a great day", value.get("Same goes for you"));
            value.set("Good morning bro", value.get("A pleasant morning to you as well"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Hello Dj");
        System.out.println("Wish you have a great day");
        System.out.println("Good morning bro");
    }
}
