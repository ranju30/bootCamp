package Wizards_bag.exceptions;

public class BagFullException extends Throwable {
    public BagFullException() {
        super("Bag is full");
    }
}
