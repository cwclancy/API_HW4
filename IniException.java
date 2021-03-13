package HW4;

/**
 * An {@code IniException} represents an error within an {@code IniObject}.
 */
public class IniException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * The constructor for the exception thrown when there is an error in an {@code IniObject}.
     * This exception is simply thrown:
     * <blockquote><pre>
     * throw new IniException();
     * </pre></blockquote>
     */
    public IniException() {
        super();
    }
}
