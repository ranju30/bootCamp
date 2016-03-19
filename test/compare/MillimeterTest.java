package compare;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MillimeterTest {

    @Test
    public void equals_should_give_true_when_same_length_in_millimeter_are_compared() {
        Millimeter fiveMillimeter = new Millimeter(5);
        Millimeter anotherFiveMillimeter = new Millimeter(5);
        assertTrue(fiveMillimeter.equals(anotherFiveMillimeter));
    }
}