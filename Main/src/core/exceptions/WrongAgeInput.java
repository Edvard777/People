package core.exceptions;

/**
 * Exception for wrong age input
 */
public class WrongAgeInput extends RuntimeException {
    public WrongAgeInput()
    {
        super("Age not supported!");
    }
}
