package HW4;
import java.lang.String;
/**
 * A {@code LongOptionsObject} is a collection of long options
 * that interfaces with GetOpt class. Specifically this class
 * is meant to describe the long option fields. A common use case of this
 * class is to make the program accept long options if it uses any options.
 * If the program accepts only long options then optstring should be
 * specified as an empty string (""). A long option may take a parameter of
 * the form --arg=param or --arg param.
 * <p>
 * To <b>create a LongOptionsObject </b>
 * <blockquote><pre>
 * LongOptionsObject options = new LongOptionsObject(String name, int has_arg, int flag, int val);
 * </pre></blockquote>
 * <p>
 */
public class LongOptionsObject {
    /**
     * Defines the name of the long option
     */
    public String name;
    /**
     * Specifies if the option takes an argument.
     * No argument is 0, required argument is 1. optional argument is 2.
    */
    public int has_arg;
    /**
     * Specifies how the results are returned for a long option
     */
    public int flag;
    /**
     * Defines the value to return
     */
    public int val;
    /**
     * Creates a {@code LongOptionsObject} with mappings to {@code name}, {@code has_arg},
     * {@code flag}, and {@code val} The class
     * is instanitated.
     */
    public LongOptionsObject(String name, int has_arg, int flag, int val) {
        name = name;
        has_arg = has_arg;
        flag = flag;
        val = val;
    }
}
