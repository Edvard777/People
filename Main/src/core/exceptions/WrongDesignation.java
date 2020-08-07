package core.exceptions;

/**
 * Exception for wrong designation input
 */
public class WrongDesignation extends RuntimeException {
    public WrongDesignation()
    {
        super("Designation not supported!");
    }
}
