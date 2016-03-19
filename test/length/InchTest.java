package length;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InchTest {

    @Test
    public void convertToCentimeter_should_convert_inch_into_centimeter() {
        Inch inch = new Inch(2);
        Centimeter centimeter = new Centimeter(5);
        assertTrue(inch.convertToCentimeter().equals(centimeter));
    }

    @Test
    public void equals_should_give_true_when_same_length_in_inch_are_compared() {
        Inch inch_A = new Inch(2);
        Inch inch_B = new Inch(2);
        assertTrue(inch_A.equals(inch_B));
    }

    @Test
    public void add_should_add_inch_to_inch_and_give_sum_in_inch() {
        Inch twoInch = new Inch(2);
        Inch fourInch = new Inch(4);
        assertTrue(twoInch.add(twoInch).equals(fourInch));
    }

    @Test
    public void add_should_add_inch_to_centimeter_and_give_sum_in_inch() {
        Inch twoInch = new Inch(2);
        Centimeter two_point_five_centimeter = new Centimeter(2.5);
        Inch threeInch = new Inch(3);
        assertTrue(twoInch.add(two_point_five_centimeter).equals(threeInch));
    }
}
