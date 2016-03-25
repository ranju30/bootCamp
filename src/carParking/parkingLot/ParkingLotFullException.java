package carParking.parkingLot;

public class ParkingLotFullException extends Exception {
    public ParkingLotFullException() {
        super("Parking Lot is FULL");
    }
}
