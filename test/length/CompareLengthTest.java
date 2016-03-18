package length;

import exceptions.InvalidInputException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class CompareLengthTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void compare_should_give_true_when_unit_are_in_feet_and_inch() throws InvalidInputException {
        double feet = 1;
        double inches = 12;
        CompareLength compareLength = CompareLength.create(feet,inches);
        assertTrue(compareLength.compare(2,24));
    }

    @Test
    public void compare_should_give_true_when_unit_are_in_inch_and_cm() throws InvalidInputException {
        double inches = 5;
        double centimeters = 2;
        CompareLength compareLength = CompareLength.create(centimeters,inches);
        assertTrue(compareLength.compare(4,10));
    }

    @Test
    public void compare_should_give_true_when_unit_are_in_cm_and_mm() throws InvalidInputException {
        double centimeters = 1;
        double millimeters = 10;

        CompareLength compareLength = CompareLength.create(centimeters,millimeters);
        assertTrue(compareLength.compare(2,20));
    }

    @Test
    public void compare_should_give_throw_exception_when_upperLength_unit_value_is_negative() throws InvalidInputException {
        double centimeters = -1;
        double millimeters = 10;
        thrown.expect(InvalidInputException.class);
        thrown.expectMessage("Positive number required but got -1.0");
        CompareLength.create(centimeters,millimeters);
    }

    @Test
    public void compare_should_give_throw_exception_when_lowerLength_unit_value_is_negative() throws InvalidInputException {
        double centimeters = 1;
        double millimeters = -10;
        thrown.expect(InvalidInputException.class);
        thrown.expectMessage("Positive number required but got -10.0");
        CompareLength.create(centimeters,millimeters);
    }
}