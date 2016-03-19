package compare;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FeetTest {

    @Test
    public void convertToInch_should_give_me_conversion_of_feet_into_inch() {
        Feet feet = new Feet(2);
        Inch inch = new Inch(24);
        assertTrue(feet.convertToInch().equals(inch));
    }

    @Test
    public void equals_should_give_true_when_same_length_of_feet_are_compared() {
        Feet twofeet = new Feet(2);
        Feet anotherTwoFeet = new Feet(2);
        assertTrue(twofeet.equals(anotherTwoFeet));
    }
}