// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 19 (Thursday), 2021




/* 
    Program: Read the content of a file (.txt)
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class FH_005_ReadFile
{
    // Algorithm 1: Using FileInputStream class
    public static void readFile1(String path)
    {
        FileInputStream fis = null;

        try
        {
            fis = new FileInputStream(new File(path));

            int ch = 0;
            while ((ch = fis.read()) != -1)
                System.out.print((char) ch);
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
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    // Algorithm 2: Using BufferedReader class
    public static void readFile2(String path)
    {
        BufferedReader br = null;

        try
        {
            br = new BufferedReader(new FileReader(path));

            int ch = 0;
            while ((ch = br.read()) != -1)
                System.out.print((char) ch);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (br != null)
                    br.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    // Algorithm 3: Using FileReader class
    public static void readFile3(String path)
    {
        FileReader fr = null;

        try
        {
            fr = new FileReader(path);

            int ch = 0;
            while ((ch = fr.read()) != -1)
                System.out.print((char) ch);
        }
        catch (IOException e)
        {    
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (fr != null)
                    fr.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    // Algorithm 4: Using Scanner class
    public static void readFile4(String path)
    {
        Scanner sc = null;

        try
        {
            sc = new Scanner(new File(path));

            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (sc != null)
                sc.close();
        }
    }

    // Algorithm 5: Using NIO package
    public static void readFile5(String path)
    {
        try
        {
            List<String> li     = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
            Iterator<String> it = li.iterator();

            while(it.hasNext())
                System.out.println(it.next());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        String filePath = "./resources/top-5-languages.txt";

        System.out.println("----- Reading the content using FileInputStream class -----");
        readFile1(filePath);
        System.out.println("\n\n----- Reading the content using BufferedReader class -----");
        readFile2(filePath);
        System.out.println("\n\n----- Reading the content using FileReader class -----");
        readFile3(filePath);
        System.out.println("\n\n----- Reading the content using Scanner class -----");
        readFile4(filePath);
        System.out.println("\n\n----- Reading the content using NIO package -----");
        readFile5(filePath);
    }
}