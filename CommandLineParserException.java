package HW4;

/**
 * An {@code GetOptException} represents an error within an {@code
 * LongOptionsObject}.
 */
public class CommandLineParserException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    /**
     * The constructor for the exception thrown when there is an error in an {@code LongOptionsObject}.
     * This exception is simply thrown:
     * <blockquote><pre>
     * throw new GetOptException();
     * </pre></blockquote>
     */
    public CommandLineParserException() {
        super();
    }
}
