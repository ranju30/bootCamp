package carParking;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParkingLotsTest {

    @Test
    public void parkingLots_can_tell_weather_all_the_lots_are_full_or_not() {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(new ParkingLot(0));
        parkingLots.add(new ParkingLot(0));

        assertTrue(parkingLots.isFull());
    }
}