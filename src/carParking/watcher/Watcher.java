package carParking.watcher;

import carParking.car.Cars;

public interface Watcher {

    void update(Cars lot, int maxCapacity) throws IncreaseTaxException;
}
