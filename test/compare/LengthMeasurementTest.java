package compare;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class LengthMeasurementTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void one_feet_should_be_equals_to_twelve_inches() throws Exception {
        LengthMeasurement one_feet = new LengthMeasurement(1, LengthUnit.FEET);
        LengthMeasurement twelve_inch = new LengthMeasurement(12.0, LengthUnit.INCH);
        assertTrue(one_feet.equalsTo(twelve_inch));
    }

    @Test
    public void two_inch_should_be_equals_to_five_centimeter() throws Exception {
        LengthMeasurement two_inch = new LengthMeasurement(2, LengthUnit.INCH);
        LengthMeasurement five_centimeter = new LengthMeasurement(5, LengthUnit.CENTIMETER);
        assertTrue(two_inch.equalsTo(five_centimeter));
    }

    @Test
    public void one_centimeter_should_be_equals_to_ten_millimeter() throws Exception {
        LengthMeasurement one_centimeter = new LengthMeasurement(1, LengthUnit.CENTIMETER);
        LengthMeasurement ten_millimeter = new LengthMeasurement(10, LengthUnit.MILLIMETER);
        assertTrue(one_centimeter.equalsTo(ten_millimeter));
    }

    @Test
    public void add_should_add_two_inches_with_two_inches_and_gives_four_inches() throws Exception {
        LengthMeasurement two_inch = new LengthMeasurement(2, LengthUnit.INCH);
        LengthMeasurement another_two_inch = new LengthMeasurement(2, LengthUnit.INCH);
        LengthMeasurement four_inch = new LengthMeasurement(4, LengthUnit.INCH);
        assertEquals(four_inch, two_inch.add(another_two_inch));
    }

    @Test
    public void add_should_add_two_inches_with_two_and_a_half_centimeter_and_gives_three_inches() throws Exception {
        LengthMeasurement two_feet = new LengthMeasurement(2, LengthUnit.INCH);
        LengthMeasurement twoPointFive_inch = new LengthMeasurement(2.5, LengthUnit.CENTIMETER);
        LengthMeasurement three_inch = new LengthMeasurement(3, LengthUnit.INCH);
        assertEquals(three_inch, two_feet.add(twoPointFive_inch));
    }
}