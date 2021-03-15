package HW4;

/**
 * An {@code GetOptException} represents an error within an {@code
 * LongOptionsObject}.
 */
public class GetOptException extends RuntimeException {

    /**
     * The constructor for the exception thrown when there is an error in an {@code LongOptionsObject}.
     * This exception is simply thrown:
     * <blockquote><pre>
     * throw new GetOptException();
     * </pre></blockquote>
     */
    public GetOptException() {
        super();
    }
}
