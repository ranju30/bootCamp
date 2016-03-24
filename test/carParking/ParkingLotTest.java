package carParking;

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
        ParkingLot parkingLot = new ParkingLot(5);
        assertTrue(parkingLot.park(new Car()));
    }

    @Test
    public void it_can_throw_exception_if_the_lot_is_full() throws ParkingLotFullException {
        ParkingLot parkingLot = new ParkingLot(0);
        exception.expect(ParkingLotFullException.class);
        parkingLot.park(new Car());
    }

    @Test
    public void lot_can_say_weather_lot_is_full_or_not() throws ParkingLotFullException {
        ParkingLot parkingLot = new ParkingLot(1);
        assertFalse(parkingLot.isFull());
        parkingLot.park(new Car());
        assertTrue(parkingLot.isFull());
    }
}