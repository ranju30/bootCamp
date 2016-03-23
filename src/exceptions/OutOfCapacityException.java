package exceptions;

public class OutOfCapacityException extends Throwable {
    public OutOfCapacityException() {
        super("Bag is full..");
    }
}
