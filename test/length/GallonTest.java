package length;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class GallonTest {

    @Test
    public void convertToLitter_should_give_a_conversion_of_gallon_to_litter() {
        Gallon oneGallon = new Gallon(1);
        Litter litter = new Litter(3.78);
        oneGallon.convertToLitter().equals(litter);
    }

    @Test
    public void equals_should_give_false_when_gallon_is_conpared_with_inch() {
        Gallon oneGallon = new Gallon(1);
        Inch inch = new Inch(1);
        assertFalse(oneGallon.equals(inch));
    }
}
