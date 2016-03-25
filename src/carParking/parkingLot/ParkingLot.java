package carParking.parkingLot;

import carParking.car.Car;
import carParking.car.Cars;
import carParking.criteria.Criteria;
import carParking.watcher.Watcher;
import carParking.watcher.Watchers;

public class ParkingLot {
    private final Cars lot;
    private int limit;
    private Watchers watchers;

    public ParkingLot(int limit, Watchers watchers) {
        this.limit = limit;
        this.watchers = watchers;
        this.lot = new Cars();
    }

    public boolean park(Car car) throws ParkingLotFullException {
        if (isFull()) throw new ParkingLotFullException();
        for (Watcher watcher : watchers) {
            watcher.update(lot, limit);
        }
        return lot.add(car);
    }

    public boolean isFull() {
        return lot.size() >= limit;
    }

    public boolean doesFulfil(Criteria criteria) {
        return criteria.doesFulfill(lot.size(), limit);
    }
}
