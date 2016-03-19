package length;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LitterTest {

    @Test
    public void add_should_add_gallon_to_litter() {
        Litter oneLitter = new Litter(1);
        Gallon oneGallon = new Gallon(1);
        Litter fourPointSevenLitter = new Litter(4.78);
        assertTrue(oneLitter.add(oneGallon).equals(fourPointSevenLitter));
    }
}