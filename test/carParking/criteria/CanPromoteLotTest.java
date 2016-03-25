package carParking.criteria;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanPromoteLotTest {

    @Test
    public void doesFulfill() {
        CanPromoteLot canPromoteLot = new CanPromoteLot();
        assertTrue(canPromoteLot.doesFulfill(1, 5));
        assertFalse(canPromoteLot.doesFulfill(4, 5));
    }
}