// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Senior Quality Assurance Engineer
// Date                 : November 15 (Tuesday), 2022




/* 
    Program: Find the order of method overloading
*/
class TC_020_MethodOverloading
{
    // Order: int, long, Integer, int..., CTE [no suitable method found for print(int)]

    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int... i) {
        System.out.println("int...");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(byte i) {
        System.out.println("byte");
    }

    public void print(short i) {
        System.out.println("short");
    }

    public void print(long i) {
        System.out.println("long");
    }

    public static void main(String[] args) {

        TC_020_MethodOverloading testObj = new TC_020_MethodOverloading();
        testObj.print(10);

        // Explicitly call the byte method
        testObj.print((byte) 10);

        // Explicitly call the long method
        testObj.print(10L);

        // Explicitly call the Integer method
        testObj.print((Integer) 10);
    }    
}



