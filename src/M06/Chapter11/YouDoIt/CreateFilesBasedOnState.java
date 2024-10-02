/* 
    Author: Wyatt H. Pearce
    Last edit: 9-30-2024
    Program: SDEV200 Chapter11 M06 p.471 - YouDoIt "Creating Multiple Random Access Files"
*/

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.text.*;

public class CreateFilesBasedOnState {
    public static void main(String[] args) {
        // User input
        Scanner input = new Scanner(System.in);

        // Declaring in and out of state files, not created yet
        Path inStateFile = Paths.get(".\\InStateCusts.txt");
        Path outOfStateFile = Paths.get(".\\OutOfStateCusts.txt");

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

        FileChannel fcIn = null;
        FileChannel fcOut = null;
        String idString;
        int id;
        String name;
        String state;
        double balance;
        final String QUIT = "999";

        // Creating files for in and out of state
        createEmptyFile(inStateFile, s);
        createEmptyFile(outOfStateFile, s);

        // Allowing user to input records
        try{
            fcIn = (FileChannel)Files.newByteChannel(
                inStateFile, 
                CREATE, 
                WRITE
            );
            fcOut = (FileChannel)Files.newByteChannel(
                outOfStateFile,
                CREATE, 
                WRITE
            );

            while (true) {
                System.out.print("Enter customer account number >> ");
                idString = input.nextLine();
            
                // Check if length is 3 and if it contains only digits
                if (idString.length() != ID_FORMAT.length() || !idString.matches("\\d{3}")) {
                    System.out.println("Invalid id. Must be exactly 3 digits. Try again...");
                } else {
                    break; // Valid input, exit the loop
                }
            }

            while(!(idString.equals(QUIT))){
                id = Integer.parseInt(idString);

                // Make sure name isn't longer than NAME_FORMAT length
                while(true){
                    // Get the users name
                    System.out.print("Enter name for customer >> ");
                    name = input.nextLine(); 
                    if(name.length() > NAME_FORMAT.length()){
                        System.out.println("Invalid name. Must be " + NAME_FORMAT.length() + " characters or less...");
                    } else {
                        break;
                    }
                }
                // Pad the name with spaces if it's too short
                name = String.format("%-" + NAME_LENGTH + "s", name);
                
                // Get the users state
                System.out.print("Enter state >> ");
                state = input.nextLine();

                // Get the users balance
                System.out.print("Enter balance >> ");
                balance = input.nextDouble();
                input.nextLine();
                DecimalFormat df = new DecimalFormat(BALANCE_FORMAT);

                // Construct the string to be written to file
                s = 
                    idString +
                    delimiter +
                    name +
                    delimiter +
                    state +
                    delimiter +
                    df.format(balance) +
                    System.getProperty("line.separator");

                // Convert string to array of bytes and wrap in byteBuffer
                byte data[] = s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data);

                if(state.equals(HOME_STATE)){
                    fcIn.position(id * RECSIZE);
                    buffer.clear();
                    fcIn.write(buffer);
                }
                else {
                    fcOut.position(id * RECSIZE);
                    buffer.clear();
                    fcOut.write(buffer);
                }

                while(true){
                    System.out.print(
                        "Enter the next customer account number or " + 
                        QUIT + 
                        " to quit >> "
                    );
                    idString = input.nextLine();
                    if(idString.length() != ID_FORMAT.length() || !idString.matches("\\d{3}")){
                        System.out.println("Invalid id. Must be exactly 3 digits. Try again...");
                    } else {
                        break;
                    }
                }
            }
            fcIn.close();
            fcOut.close();
        } catch(Exception e){
            System.out.println("Error message: " + e);
        }
    }

    public static void createEmptyFile(Path file, String s){
        final int NUMRECS = 1000;

        try{
            OutputStream outputStream = new BufferedOutputStream(
                Files.newOutputStream(file, CREATE)
            );
            BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(outputStream)
            );

            for(int count = 0; count < NUMRECS; ++count){
                writer.write(s, 0, s.length());
            }
            writer.close();
        } catch(Exception e){
            System.out.println("Error message: " + e);
        }
    }
}
