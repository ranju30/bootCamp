package carParking.criteria;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanAssignToTraineeTest {

    @Test
    public void doesFulfill() {
        CanAssignToTrainee canAssignToTrainee = new CanAssignToTrainee();
        assertFalse(canAssignToTrainee.doesFulfill(1, 5));
        assertTrue(canAssignToTrainee.doesFulfill(4, 5));
    }
}