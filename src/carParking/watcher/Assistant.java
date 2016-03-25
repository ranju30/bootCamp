package carParking.watcher;

import carParking.car.Cars;

public class Assistant implements Watcher {
    int numberOfCars = 0;
    int maxCapacity = 0;

    @Override
    public void update(Cars lot, int maxCapacity) {
        numberOfCars = lot.size();
        this.maxCapacity = maxCapacity;
    }

    public Display display() {
        return new Display(numberOfCars, maxCapacity);
    }
}
