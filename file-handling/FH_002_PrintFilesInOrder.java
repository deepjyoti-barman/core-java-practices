// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 18 (Tuesday), 2021




/* 
    Program: Print all files and folders present in a directory in sorted order
*/
import java.io.File;
import java.util.Arrays;

class FH_002_PrintFilesInOrder
{
    public static void getDirs(String path)
    {
        File file = new File(path);
        File[] dirs = file.listFiles();
        
        Arrays.sort(dirs);

        for (File f : dirs)
        {
            if (f.isFile())
                System.out.println("File: " + f.getName() + " | " + f.getAbsolutePath());
            else if(f.isDirectory())
                System.out.println("Directory: " + f.getName() + " | " + f.getAbsolutePath());
            else
                System.out.println("Unknown: " + f.getName() + " | " + f.getAbsolutePath());
        }
    }
    
    public static void main(String[] args)
    {
        // Windows
        // String dirPath = "C:\\Program Files\\";

        // Mac
        String dirPath = "/Users/deepjyoti.barman/Downloads";
        
        System.out.println("Files and directories available are: ");
        getDirs(dirPath);
    }   
}