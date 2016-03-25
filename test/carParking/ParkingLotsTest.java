package carParking;

import carParking.parkingLot.ParkingLot;
import carParking.parkingLot.ParkingLots;
import carParking.watcher.Watchers;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotsTest {

    @Test
    public void parkingLots_can_tell_weather_all_the_lots_are_full_or_not() {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(new ParkingLot(0, new Watchers()));
        parkingLots.add(new ParkingLot(0, new Watchers()));

        assertTrue(parkingLots.isFull());

        parkingLots.add(new ParkingLot(1, new Watchers()));

        assertFalse(parkingLots.isFull());
    }
}