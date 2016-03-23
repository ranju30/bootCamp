package exceptions;

public class InvalidColoredBallException extends Throwable {
    public InvalidColoredBallException() {
        super("You can not put this colored ball");
    }
}
