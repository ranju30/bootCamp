package carParking.watcher;

import carParking.car.Cars;

public class CivicBody implements Watcher {
    @Override
    public void update(Cars lot, int maxCapacity) {
        if (lot.size() * 100 / maxCapacity >= 80)
            throw new IncreaseTaxException();
    }
}
