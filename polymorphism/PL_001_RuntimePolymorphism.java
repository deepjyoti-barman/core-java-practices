// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : Test Yantra Software Solutions (India) Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : April 22 (Thursday), 2021




/*
    Program: Demonstrate Runtime Polymorphism / Dynamic Binding with an example
*/
class Car
{
    public void paint()
    {
        System.out.println("Painted the vehicle with white");
    }
}

class BMW extends Car
{
    public void paint()
    {
        System.out.println("Painted the vehicle with red");
    }
}

class PL_001_RuntimePolymorphism
{
    public static void main(String[] args)
    {
        // Primarily the vehicleObj instance variable is going to check whether the paint() method is there in class Car or not
        // Because paint() method is present in class Car so we are not going to get any compile time error
        // But, then depending on the object we are assigning to that instance variable vehicleObj it's going to call the method of that class
        // The this behavior is known as Dynamic Binding or Runtime Polymorphism
        Car vehicleObj = new Car();         // Calls the paint() method of Car class
        vehicleObj.paint();

        vehicleObj = new BMW();             // Calls the paint() method of BMW class
        vehicleObj.paint();
    }
}