package length;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CentimeterTest {

    @Test
    public void convertToMillimeter_should_convert_centimeter_to_millimeter() {
        Centimeter centimeter = new Centimeter(2);
        Millimeter millimeter = new Millimeter(20);
        assertTrue(centimeter.convertToMillimeter().equals(millimeter));
    }

    @Test
    public void equals_should_give_true_when_same_length_in_centimeter_are_compared() {
        Centimeter centimeter_A = new Centimeter(2);
        Centimeter centimeter_B = new Centimeter(2);
        assertTrue(centimeter_A.equals(centimeter_B));
    }
}