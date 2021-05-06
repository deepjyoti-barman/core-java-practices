// Platform             : GitHub
// Course Name          : core-java-practices
// Company              : MakeMyTrip India Pvt. Ltd.
// Author               : Deepjyoti Barman
// Designation          : Quality Assurance Engineer
// Date                 : May 05 (Wednesday), 2021




/* 
    Program: Given a site URL compare it with its IP address
    Input: https://google.com, https://142.250.193.110
    Output: Same
*/
import java.net.*;

class TC_002_CompareURLwithIP
{
    public static boolean compareUrlAndIp(String url, String ipaddr)
    {
        try
        {
            return new URL(url).equals(new URL(ipaddr));
        }
        catch (MalformedURLException mue)
        {
            mue.printStackTrace();
        }

        return false;
    }

    public static void main(String[] args)
    {
        // To find IP address: Google 'Find ip address of a website' (or) go to https://www.uptrends.com/tools/find-ip-address-of-my-website (or) ping the name of the website in Terminal / Command Prompt
        String url    = "https://udemy.com";
        String ipaddr = "https://104.16.65.85"; 

        System.out.println(compareUrlAndIp(url, ipaddr) ? "Same" : "Different");
    }
}
