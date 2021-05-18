// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 17 (Monday), 2021




/* 
    Program: Copy a file(doc, pdf or txt) and create a different file in the same location
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FH_001_FileCopy
{
    public static void copy(String source, String destination)
    {
        File input  = new File(source);
        File output = new File(destination);

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try
        {
            fis = new FileInputStream(input);
            fos = new FileOutputStream(output);

            System.out.println("Bytes available in source file to be read: " + fis.available());
            
            // Reading content of the file one by one until it reaches EOF
            int i = 0;
            while ((i = fis.read()) != -1)
                fos.write(i);

            System.out.println("Successfully copied the file from source to destination");
            System.out.println("Source: " + source);
            System.out.println("Destination: " + destination);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (fis != null)
                    fis.close();
                
                if (fos != null)
                    fos.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        String sourcePath = "resources/python3-cheatsheet.pdf";
        String destPath   = "resources/python3-cheatsheet-copy.pdf";

        copy(sourcePath, destPath);
    }
}