// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : Test Yantra Software Solutions (India) Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : April 22 (Thursday), 2021




/*
    Program: Demonstrate the use of Comparable interface with an example
*/
import java.util.*;

class PencilBox implements Comparable<PencilBox>
{
    int noOfPencil;
    String brand;

    public PencilBox() { }
    public PencilBox (int nop, String brand)
    {
        this.noOfPencil = nop;
        this.brand = brand;
    }

    @Override
    public String toString()
    {
        return "(noOfPencil = " + noOfPencil + ", brand = " + brand + ")";
    }

    @Override
    public int compareTo(PencilBox obj)
    {
        return this.brand.compareTo(obj.brand);
    }
}

class CL_001_ComparableExample
{
    public static void main(String[] args)
    {
        PencilBox pBox1 = new PencilBox(3, "Nataraj");
        PencilBox pBox2 = new PencilBox(5, "Apsara");

        ArrayList<PencilBox> list = new ArrayList<>();
        list.add(pBox1);
        list.add(pBox2);

        System.out.println("Before sorting objects by brand:\n" + list + "\n");
        Collections.sort(list);
        System.out.println("After sorting objects by brand:\n" + list);
    }
}