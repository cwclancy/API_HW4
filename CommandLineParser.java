package HW4;

/**
 * The class {@code CommandLineParser} can take in command line arguments,
 * parse a String Array based on the options provided.
 * An elemen
 */

public class CommandLineParser {
    /**
     * Defines a variable that is set by {@code getNext} to the index of the next
     * element of the argv to be processed.
     */
   public int optIndex;
    /**
     * Defines the variable which is set to a non-zero value for {@code getNext}
     * to print an error message.
     */
   public int optErr;
    /**
     * Defines the value of the option argument if set.
     */
   public String optArg;
    /**
     * If {@code getNext} encounters an unknown option character or an
     * option with a missing required argument, this variable is set with that
     * option character.
     */
   public char optOpt;

    /**
     * Constructor to create an object with short options
     * @param argv
     * @param options
     */
    public CommandLineParser( String[] argv, String options){
    }

    /**
     * Constructor to create an object with long options
     * @param argv
     * @param options
     * @param longOptions
     */
    public CommandLineParser(String[] argv, String options,
                             HW4.LongOptionsObject longOptions) {

    }

    /**
     * Method to get the next option character
     * @param numberOfArgs
     * @param argv
     * @param options
     * @return
     */
    public int getNext( String[] argv, String options)  { return 0; }

    /**
     * Method that allows the user to set Posixly Correct environment variable
     * @param flag
     */
    public void setPosixlyCorrect(Boolean flag) {}

    /**
     * Method that allows user to set/ reset the optind field
     * @param val
     */
    public void setOptIndex(int val) {}

    /**
     * Method to allow the user to set the opterr field
     * @param val
     */
    public void setOptErr(int val) {}

    /**
     * Method to allow user to get the current argv element
     * @return
     */
    public String getOptArg() { return "";}

}
