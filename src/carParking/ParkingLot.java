package carParking;

import java.util.HashSet;

public class ParkingLot {
    private final HashSet<Car> lot;
    private int limit;

    public ParkingLot(int limit) {
        this.limit = limit;
        this.lot = new HashSet<Car>();
    }

    public boolean park(Car car) throws ParkingLotFullException {
        if(isFull()) throw new ParkingLotFullException();
        return lot.add(car);
    }

    public boolean isFull(){
        return lot.size()>=limit;
    }
}
