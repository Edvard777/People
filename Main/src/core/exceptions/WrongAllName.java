package core.exceptions;

/**
 * Exception for wrong name, surname, lastname, or nickname input
 */
public class WrongAllName extends RuntimeException {
    public WrongAllName()
    {
        super("Name not supported!");
    }
}
