package carParking;

import java.util.ArrayList;

public class ParkingLots {
    ArrayList<ParkingLot> parkingLots = new ArrayList<ParkingLot>();

    public boolean add(ParkingLot parkingLot){
        return parkingLots.add(parkingLot);
    }

    public boolean isFull() {
        for (ParkingLot parkingLot : parkingLots) {
            if(!parkingLot.isFull())
                return false;
        }
        return true;
    }
}
