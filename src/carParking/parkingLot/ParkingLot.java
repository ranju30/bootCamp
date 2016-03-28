package carParking.parkingLot;

import carParking.criteria.Criteria;
import carParking.watcher.Watcher;
import carParking.watcher.Watchers;

import java.util.ArrayList;

public class ParkingLot {
    private final ArrayList lot;
    private int limit;
    private Watchers watchers;

    public ParkingLot(int limit, Watchers watchers) {
        this.limit = limit;
        this.watchers = watchers;
        this.lot = new ArrayList<Object>();
    }

    public boolean park(Object car) throws ParkingLotFullException {
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
