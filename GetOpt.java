package HW4;


/**
 * The class {@code GetOpt} allows the program to take in the command line
 * options.
 * Function the same as {@code CommandLineParser} class.
 * <p>
 * The class provides functionality to parse a String array according to
 * the Options specified.
 *
 * There are three methods in GetOpt interface, {@code getoption}, {@code getopt_long}
 * and {@code getopt_long_only}.
 *
 * <p>
 *
 */
public class GetOpt {
    /**
     * Defines a variable that is set by {@code getoption} to the index of the next
     * element of the argv to be processed.
     *
     */
   public int optind;
    /**
     * Defines the variable which is set to a non-zero value for {@code getoption}
     * to print an error message.
     */
   public int opterr;
    /**
     * Defines the value of the option argument if set.
     */
   public String optarg;
    /**
     * If {@code getoption} encounters an unknown option character or an
     * option with a missing required argument, this variable is set with that
     * option character.
     */
   public char optopt;

    /**
     * <ul>
     * <li>{@code optind} The initial value of optind is set to 1.
     * <li>{@code optarg} Is set as an empty string intitially
     * <li>{@code opterr} The default value is 1 (non-zero value)
     * <li>{@code optopt} The optopt holds the erroneous option character
     * and is initialized to 0.
     * </ul>
     */
   public GetOpt(){
       optind = 1;
       optarg = "";
       opterr = 1;
       optopt = 0;
   }

    /**
     * The getoption function parses the command-line arguments. It takes
     * String array representing the list of arguments and a String
     * representing options.
     * If the function finds the next option character then it returns that,
     * updates the optind
     * character with it. If optind is reset to 1 then the scanning of argv
     * can be restarted. If there are no more option characters to scan
     * then getoption returns -1. Options is the String of options containing
     * valid option characters.
     * @param argv String array of list of arguments
     * @param options String representing Options
     * @return If an option is successfully found then it returns the option
     * character else returns -1
     *
     */
   public int getoption(String[] argv, String options)  { return 0; } //Todo:
    // do we need argc?

    /**
     * This function works like {@code getoption} but it also accepts long
     * options starting with two dashes.
     * @param argv String array of list of arguments
     * @param optstring String representing Options
     * @param options Represents an array of {@code LongOptionsObject} type
     *                to specify the long options.
     * @return If a short option is successfully found then it returns the
     * short option character else returns -1. For a long option, it returns
     * the value of {@code val}
     * @throws GetOptException is an error in an {@code LongOptionsObject}
     */

   public int getopt_long(String[] argv, String optstring,
                          LongOptionsObject[] options) throws GetOptException { return 0; }
                          // todo: do we need longindex?

    /**
     * Using this function, the user can provide only long options. In that
     * case the value of {@code optstring} will be an empty string ("").
     * @param argv String array of list of arguments
     * @param options Represents an array of {@code LongOptionsObject} type
     * to specify the long options.
     * @return returns the value of {@code val}
     * @throws GetOptException is an error in an {@code LongOptionsObject}
     */
   public int getopt_long_only(String[] argv,
                               LongOptionsObject[] options)  throws GetOptException {return 0; }
}
