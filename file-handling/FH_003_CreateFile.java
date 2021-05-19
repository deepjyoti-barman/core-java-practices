// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 19 (Wednesday), 2021




/* 
    Program: Create a file in system
*/
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class FH_003_CreateFile
{
    // Algorithm 1: Using File
    public static void createFile1(String path)
    {
        File file = new File(path);

        try
        {
            boolean flag = file.createNewFile();
            System.out.println(flag ? "File is created" : "File is already present");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    // Algorithm 2: Using FileOutputStream
    public static void createFile2(String path)
    {
        FileOutputStream fos = null;
        Scanner scan         = null;

        try
        {
            fos  = new FileOutputStream(path, true);
            scan = new Scanner(System.in);

            System.out.println("Enter the content of the file:");
            String content = scan.nextLine();
            byte[] b       = content.getBytes();

            fos.write(b);
            System.out.println("\nFile has been created with the content");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (fos != null)
                    fos.close();
                
                if (scan != null)
                    scan.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    // Algorithm 3: Using Java NIO API
    public static void createFile3(String path)
    {
        try
        {
            Path filePath    = Paths.get(path);
            Path newFilePath = Files.createFile(filePath);

            System.out.println("File has been created in location: " + newFilePath);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        String filePath1 = "./resources/sample-file1.txt";
        String filePath2 = "./resources/sample-file2.txt";
        String filePath3 = "./resources/sample-file3.txt";

        System.out.println("---------------------------------------------------------------");
        createFile1(filePath1);
        System.out.println("---------------------------------------------------------------");
        createFile2(filePath2);
        System.out.println("---------------------------------------------------------------");
        createFile3(filePath3);
        System.out.println("---------------------------------------------------------------");
    }
}