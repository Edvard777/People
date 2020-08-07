package core.exceptions;

/**
 * Exception for wrong email input
 */
public class WrongEmailInput extends RuntimeException {
    public WrongEmailInput()
    {
        super("Email not supported!");
    }
}
