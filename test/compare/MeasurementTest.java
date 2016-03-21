package compare;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MeasurementTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void one_feet_should_be_equals_to_twelve_inches() throws Exception{
        Measurement one_feet= new Measurement(1, LengthUnit.FEET);
        Measurement twelve_inch = new Measurement(12.0 , LengthUnit.INCH);
        assertTrue(one_feet.equals(twelve_inch));
    }

    @Test
    public void two_inch_should_be_equals_to_five_centimeter() throws Exception{
        Measurement two_inch= new Measurement(2, LengthUnit.INCH);
        Measurement five_centimeter = new Measurement(5 , LengthUnit.CENTIMETER);
        assertTrue(two_inch.equals(five_centimeter));
    }

    @Test
    public void one_centimeter_should_be_equals_to_ten_millimeter() throws Exception{
        Measurement one_centimeter= new Measurement(1, LengthUnit.CENTIMETER);
        Measurement ten_millimeter = new Measurement(10 , LengthUnit.MILLIMETER);
        assertTrue(one_centimeter.equals(ten_millimeter));
    }

    @Test
    public void one_gallon_should_be_equals_to_three_point_seventy_eight_litres() throws Exception{
        Measurement one_gallon= new Measurement(1, VolumeUnit.GALLON);
        Measurement  threePointSeventyEight_litre= new Measurement(3.78 , VolumeUnit.LITRE);
        assertTrue(one_gallon.equals(threePointSeventyEight_litre));

    }

    @Test
    public void add_should_add_two_inches_with_two_inches_and_gives_four_inches() throws Exception{
        Measurement two_inch= new Measurement(2, LengthUnit.INCH);
        Measurement another_two_inch = new Measurement(2, LengthUnit.INCH);
        Measurement four_inch = new Measurement(4, LengthUnit.INCH);
        assertEquals(four_inch ,two_inch.add(another_two_inch));
    }

    @Test
    public void add_should_add_two_inches_with_two_and_a_half_centimeter_and_gives_three_inches() throws Exception{
        Measurement two_feet= new Measurement(2, LengthUnit.INCH);
        Measurement twoPointFive_inch = new Measurement(2.5, LengthUnit.CENTIMETER);
        Measurement three_inch = new Measurement(3, LengthUnit.INCH);
        assertEquals(three_inch ,two_feet.add(twoPointFive_inch));
    }

    @Test
    public void add_should_add_one_gallon_with_one_litre_and_give_four_point_seven_eight_litres()throws Exception{
        Measurement one_gallon= new Measurement(1, VolumeUnit.GALLON);
        Measurement one_litre = new Measurement(1, VolumeUnit.LITRE);
        Measurement fourPointSeventyEight_litre = new Measurement(4.78, VolumeUnit.LITRE);
        assertEquals(fourPointSeventyEight_litre ,one_gallon.add(one_litre));
    }
}