package compare;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CentimeterTest {

    @Test
    public void convertToMillimeter_should_convert_centimeter_to_millimeter() {
        Centimeter twoCentimeter = new Centimeter(2);
        Millimeter twentyMillimeter = new Millimeter(20);
        assertTrue(twoCentimeter.convertToMillimeter().equals(twentyMillimeter));
    }

    @Test
    public void equals_should_give_true_when_same_length_in_centimeter_are_compared() {
        Centimeter twoCentimeter = new Centimeter(2);
        Centimeter anotherTwoCentimeter = new Centimeter(2);
        assertTrue(twoCentimeter.equals(anotherTwoCentimeter));
    }

    @Test
    public void convertToInch_should_convert_centimeter_to_inch() {
        Centimeter fiveCentimeter = new Centimeter(5);
        Inch twoInch = new Inch(2);
        assertTrue(fiveCentimeter.convertToInch().equals(twoInch));

    }
}