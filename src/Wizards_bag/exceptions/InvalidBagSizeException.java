package Wizards_bag.exceptions;

public class InvalidBagSizeException extends Throwable{
    public InvalidBagSizeException() {
        super("Capacity should be within 0 to 12");
    }
}
