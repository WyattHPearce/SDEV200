/* 
    Author: Wyatt H. Pearce
    Last edit: 10-2-2024
    Program: SDEV200 Chapter11 M06 p.475 - YouDoIt "Creating Multiple Random Access Files"
*/

import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class ReadStateFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fileName;
        System.out.println("Enter name of file to use (within current directory) >> ");
        fileName = keyboard.nextLine();
        fileName = ".\\" + fileName;
        Path file = Paths.get(fileName);

        // Declaring constants
        final String ID_FORMAT = "000";
        final String NAME_FORMAT = "          ";
        final int NAME_LENGTH = NAME_FORMAT.length();
        final String HOME_STATE = "WI";
        final String BALANCE_FORMAT = "0000.00";
        String delimiter = ",";

        // Concatenating string
        String s = 
            ID_FORMAT + 
            delimiter + 
            NAME_FORMAT + 
            delimiter + 
            HOME_STATE + 
            delimiter + 
            BALANCE_FORMAT + 
            System.getProperty("line.separator");

        final int RECSIZE = s.length();

        byte data[] = s.getBytes();
        final String EMPTY_ACCT = "000";
        String[] array = new String[4];
        double balance;
        double total = 0;

        // Displaying attributes of the file
        try{
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("\nAttributes of the file:");
            System.out.println("Creation time: " + attr.creationTime());
            System.out.println("Size: " + attr.size());
        }
        catch(IOException e){
            System.out.println("IO Exeption: " + e);
        }

        // Reading the file
        try{
            InputStream iStream = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));

            System.out.println("\nAll non-default records:\n");
            s = reader.readLine();

            while(s != null){
                array = s.split(delimiter);
                if(!array[0].equals(EMPTY_ACCT)){
                    balance = Double.parseDouble(array[3]);
                    System.out.println("ID #" + array[0] + " " + array[1] + " " + array[2] + " $" + array[3]);
                    total += balance;
                }
                s = reader.readLine();
            }

            System.out.println("Total of all balances is $" + total);
            reader.close();
        }
        catch(Exception e){
            System.out.println("Error message: " + e);
        }

        // Display specific account
        try{
            FileChannel fc = (FileChannel)Files.newByteChannel(file, READ);
            ByteBuffer buffer = ByteBuffer.wrap(data);
            int findAcct;
            System.out.print("\nEnter account to seek >> ");
            findAcct = keyboard.nextInt();

            fc.position(findAcct * RECSIZE);
            fc.read(buffer);
            s = new String(data);
            System.out.println("Desired record: " + s);
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}
