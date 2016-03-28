package carParking.watcher;

import java.util.List;

public class Assistant implements Watcher {
    int numberOfCars = 0;
    int maxCapacity = 0;

    @Override
    public void update(List lot, int maxCapacity) {
        numberOfCars = lot.size();
        this.maxCapacity = maxCapacity;
    }

    public Display display() {
        return new Display(numberOfCars, maxCapacity);
    }
}
