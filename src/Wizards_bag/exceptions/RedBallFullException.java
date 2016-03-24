package Wizards_bag.exceptions;

public class RedBallFullException extends Throwable{
    public RedBallFullException() {
        super("Can't add anymore red ball");
    }
}
