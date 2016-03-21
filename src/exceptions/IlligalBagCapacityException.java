package exceptions;

public class IlligalBagCapacityException extends Exception{
    public IlligalBagCapacityException(int numberOfBalls) {
        super("Invalid number of balls: "+numberOfBalls);
    }
}
