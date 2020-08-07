package core.exceptions;

/**
 * Exception for wrong person input
 */
public class WrongInputException extends RuntimeException {
    public WrongInputException()
    {
        super("Person not supported!");
    }
}
