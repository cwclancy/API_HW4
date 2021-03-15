package HW4;
import java.lang.String;
/**
 * A {@code LongOptionsObject} is a collection of long options
 * that interfaces with GetOpt class. Specifically this class
 * is meant to describe the long option fields. A common use case of this
 * class is to make the program accept long options if it uses any options.
 * <p>
 * To <b>create a LongOptionsObject </b>
 * <blockquote><pre>
 * LongOptionsObject options = new LongOptionsObject(String name, int has_arg, int flag, int val);
 * </pre></blockquote>
 * <p>
 */
public class LongOptionsObject {
    public enum optionType {
        NO_ARGUMENT, REQUIRED_ARGUMENT, OPTIONAL_ARGUMENT;
    }
    /**
     * Defines the name of the long option
     */
    public String name;
    /**
     * Specifies if the option takes an argument.
    */
    public optionType has_arg;
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
     * {@code flag}, and {@code val}.
     * If flag is null, the contents of val indicate which option it found.
     * If flag is not a null, the value of flag is stored in val.
     */
    public LongOptionsObject(String name, optionType has_arg, String flag,
                             int val) {
        name = name;
        has_arg = has_arg;
        flag = flag;
        val = val;
    }
}
