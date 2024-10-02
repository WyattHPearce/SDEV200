/* 
    Author: Wyatt H. Pearce
    Last edit: 9-30-2024
    Program: SDEV200 Chapter11 M06 p.454 - Figure 11-18 FileOut
*/

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class FileOut
{ 
   public static void main(String[] args)
   {
      Path file = Paths.get(".\\Grades.txt");
      String s = "ABCDF";
      byte[] data = s.getBytes();
      OutputStream output = null;   
      try
      {
         output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
         output.write(data);
         output.flush();
         output.close();
      }
      catch(Exception e)
      {
         System.out.println("Message: " + e);
      }
   }
}
