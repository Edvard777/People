package core.exceptions;

/**
 * Exception for wrong gender type input
 */
public class WrongGenderInput extends RuntimeException {
    public WrongGenderInput()
    {
        super("Gender not supported!");
    }
}
