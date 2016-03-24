package Wizards_bag.exceptions;

public class GreenBallFullException extends Throwable {
    public GreenBallFullException() {
        super("Can't put more than 3 green ball");
    }
}
