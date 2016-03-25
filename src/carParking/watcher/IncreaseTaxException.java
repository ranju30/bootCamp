package carParking.watcher;

public class IncreaseTaxException extends RuntimeException {

    public IncreaseTaxException() {
        super("More than 80% cars... Tax has to be increased...");
    }
}
