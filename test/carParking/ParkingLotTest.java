package carParking;

import carParking.criteria.CanAssignToTrainee;
import carParking.parkingLot.ParkingLot;
import carParking.parkingLot.ParkingLotFullException;
import carParking.watcher.CivicBody;
import carParking.watcher.IncreaseTaxException;
import carParking.watcher.Watchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void car_can_be_parked_in_the_lot() throws ParkingLotFullException {
        ParkingLot parkingLot = new ParkingLot(1, new Watchers());
        assertTrue(parkingLot.park(new Object()));
    }

    @Test
    public void it_can_throw_exception_if_the_lot_is_full() throws ParkingLotFullException {
        ParkingLot parkingLot = new ParkingLot(0, new Watchers());
        exception.expect(ParkingLotFullException.class);
        parkingLot.park(new Object());
    }

    @Test
    public void lot_can_say_weather_lot_is_full_or_not() throws ParkingLotFullException {
        ParkingLot parkingLot = new ParkingLot(1, new Watchers());
        assertFalse(parkingLot.isFull());
        parkingLot.park(new Object());
        assertTrue(parkingLot.isFull());
    }

    @Test
    public void can_say_weather_the_lot_is_80percent_full_or_not() throws ParkingLotFullException {
        ParkingLot parkingLot = new ParkingLot(5, new Watchers());
        CanAssignToTrainee canAssignToTrainee = new CanAssignToTrainee();
        assertFalse(parkingLot.doesFulfil(canAssignToTrainee));
        parkingLot.park(new Object());
        assertFalse(parkingLot.doesFulfil(canAssignToTrainee));
        parkingLot.park(new Object());
        assertFalse(parkingLot.doesFulfil(canAssignToTrainee));
        parkingLot.park(new Object());
        assertFalse(parkingLot.doesFulfil(canAssignToTrainee));
        parkingLot.park(new Object());
        assertTrue(parkingLot.doesFulfil(canAssignToTrainee));
    }

    @Test
    public void can_throw_exception_when_more_than_80_percent_of_cars_are_parked() throws ParkingLotFullException {
        Watchers watchers = new Watchers();
        watchers.add(new CivicBody());
        ParkingLot parkingLot = new ParkingLot(5, watchers);

        parkingLot.park(new Object());
        parkingLot.park(new Object());
        parkingLot.park(new Object());
        parkingLot.park(new Object());
        exception.expect(IncreaseTaxException.class);
        parkingLot.park(new Object());
    }
}