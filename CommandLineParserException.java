package HW4;

/**
 * An {@code CommandLineParserException} represents an error within an {@code
 * LongOptionsObject}.
 */
public class CommandLineParserException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * The constructor for the exception thrown when there is an error in an {@code CommandLineParserException}.
     * This exception is simply thrown:
     * <blockquote><pre>
     * throw new CommandLineParserException();
     * </pre></blockquote>
     */
    public CommandLineParserException() {
        super();
    }
}
