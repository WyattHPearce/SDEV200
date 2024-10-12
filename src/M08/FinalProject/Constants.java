public final class Constants {

    /*
        NOTE:
        This class is intentionally not an interface (despite the SDEV200 book saying to use interfaces for constants)
        The main reason for this is clarity. By using a class, constants must be referenced like "Constants.VERSION" 
        instead of just "VERSION." This makes it clear where the values are defined and improves readability.
    */

    // Prevent instantiation
    private Constants() {}

    // Version of the program
    public static final String VERSION = "1.0.0";
    // Initial width and height of the window
    public static final int WIDTH = 700;
    public static final int HEIGHT = 550;
}