package Wizards_bag.exceptions;

public class YellowBallFullException extends Throwable{
    public YellowBallFullException() {
        super("Can't add anymore yellow ball");
    }
}
