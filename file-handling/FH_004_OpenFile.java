// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 20 (Thursday), 2021




/* 
    Program: Open a file using the default app of the system
*/
import java.io.File;
import java.io.IOException;
import java.awt.Desktop;

class FH_004_OpenFile
{
    public static void openFile(String path)
    {
        Desktop desktop = Desktop.getDesktop();
        File file       = new File(path);

        if (!Desktop.isDesktopSupported())
        {
            System.out.println("Desktop not supported");
            return;
        }

        try
        {
            if (file.exists())
                desktop.open(file);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        String filePath = "./resources/top-5-languages.txt";

        openFile(filePath);
    }
}