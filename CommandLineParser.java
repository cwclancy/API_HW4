package HW4;

/**
 * The class {@code CommandLineParser} can take in command line arguments,
 * parse a String Array based on the options provided.
 * An element of the argv String array starts with '-' if it is an option
 * element. The characters followed by '-' are option characters. If next()
 * is called repeatedly in a loop, it returns each of the option characters
 * from each of the option elements. If all the elements are scanned and no more
 * are remaining, then next() returns -1.
 * <p>
 *
 * A command Line Parser object can be instantiated in two ways
 * 1) By creating an object with short option command.
 *
 * <blockquote><pre>
 * CommandLineParser parser = new CommandLineParser(String[] args, String shortOptionString);
 * </pre></blockquote>
 *
 * 2) By creating an object with the long option command.
 * <blockquote><pre>
 * CommandLineParser parser = new CommandLineParser(String[] args, LongOptionsObject longOptions);
 * </pre></blockquote>
 *
 * The optionString argument in the {@code next()} function represents a
 * string that has the valid option characters for the program. An option character in this
 * string can be followed by a colon (‘:’) to indicate that it takes a required argument. If an
 * option character is followed by two colons (‘::’)
 *
 * <blockquote><pre>
 * int c = parser.next(String[] args, String optionString);
 * </pre></blockquote>
 *
 * By default, next() permutes the contents of the args that it scans
 * in such a way that all the non options are at the end. Two other scanning
 * modes are also implemented where if the first character of the
 * optionString is '+" or if POSIXLY_CORRECT is set, then the option
 * processing is stopped as soon as a nonoption argument is encountered.
 *
 * <p>
 * If the first character of the optionString is '-' then each non-option
 * element is args is handled such that it is an argument of an option with
 * character code 1.
 */

public class CommandLineParser {
    /**
     * Defines a variable that is set by {@code next} to the index of the next
     * element of the argv to be processed. Default value is set to 1.
     */
   public int optIndex=1;
    /**
     * Defines the variable which is set to a non-zero value for {@code next}
     * to print an error message. Default value is set to 1.
     */
    
   private String optArg;
    /**
     * If {@code next} encounters an unknown option character or an
     * option with a missing required argument, this variable is set with that
     * option character. Default value is set to 0.
     */
   public char optOpt;

    /**
     * Constructor to create an object with short options
     * @param args String array of arguments
     * @param optionString String representing the options
     */
    public CommandLineParser( String[] args, String optionString){
    }

    /**
     * Constructor to create an object with long options
     * @param args String array of arguments
     * @param optionString String representing the option
     * @param longOptions {@code LongOptionsObject} type to take long options
     *                                            command
     */
    public CommandLineParser(String[] args, String optionString,
                             LongOptionsObject[] longOptions) {

    }

    /**
     * Method to get the next option character
     * @param args String array of arguments
     * @param optionString String representing the option
     * @return This method returns the following based on the use case
     * <ul>
     * <li> The option character for the next command line option.
     * <li> When all option arguments are parsed, returns -1
     * <li> If the option has an argument, returns the argument by storing
     * it in optArg
     * <li> If there is an option character in args which is not there in
     * optionString then it returns '?'
     * <li> Returns 0 if the flag in LongOptionsObject is not null.
     * <li> Returns the contents of val in LongOptionsObject if the flag in
     * LongOptionsObject is null.
     * </ul>
     * @throws CommandLineParserException if there is an error in parsing the
     * command line options.
     */
    public int next( String[] args, String optionString) throws CommandLineParserException { return 0; }

    /**
     * Method that allows the user to set Posixly Correct environment variable
     * @param flag To set/unset the POSIXLY_CORRECT environment variable
     */
    public void setPosixlyCorrect(Boolean flag) {}

    /**
     * Method that allows user to set/ reset the optIndex field
     * @param val The value to be set for optIndex
     */
    public void setOptIndex(int val) {}


    /**
     * Method to allow user to get the current argument element
     * @return The current argument value is put in optArg
     */
    public String OptArg() { return "";}

}
