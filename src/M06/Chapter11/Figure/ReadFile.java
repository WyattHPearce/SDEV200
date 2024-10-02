/* 
    Author: Wyatt H. Pearce
    Last edit: 9-30-2024
    Program: SDEV200 Chapter11 M06 p.455 - Figure 11-20 ReadFile
*/

import java.nio.file.*;
import java.io.*;
public class ReadFile
{
    public static void main(String[] args)
    {
        Path file = Paths.get(".\\Grades.txt");
        InputStream input = null;
        try
        {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String s = null;
            s = reader.readLine();
            System.out.println(s);
            input.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}