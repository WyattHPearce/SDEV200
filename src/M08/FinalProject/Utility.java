import javax.swing.*;

public class Utility {

    // Prevents instantiation
    private Utility(){
    }

    // Returns a string from the user after sending a given message
    public static String promptForInfo(String message){
        String input;

        input = JOptionPane.showInputDialog(
                null, 
                message, 
                "Inventory Prompt", 
                JOptionPane.QUESTION_MESSAGE
        );

        if(input == null){ // User clicked cancel
            System.out.println("Action canceled");
            return null;
        } else if(input.isEmpty()){
            JOptionPane.showMessageDialog(null, "Answer cannot be empty!\n", "Input Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } else {
            return input;
        }
    }

    // Sends a given informational message
    public static void sendInfoMessage(String message){
        JOptionPane.showMessageDialog(
            null, 
            message, 
            "Inventory Info", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Sends a given error message
    public static void sendErrorMessage(String message){
        JOptionPane.showMessageDialog(
            null, 
            message, 
            "Inventory Error", 
            JOptionPane.ERROR_MESSAGE
        );
    }
}
