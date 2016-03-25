package probability.exceptions;

public class InvalidInputException extends Throwable {

    public InvalidInputException(String message, double value) {
        super(message + value);

    }
}
