package compare;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class LitreTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void add_should_add_gallon_to_litre() {
        Litre oneLitre = new Litre(1);
        Gallon oneGallon = new Gallon(1);
        Litre fourPointSevenLitre = new Litre(4.78);
        assertTrue(oneLitre.add(oneGallon).equals(fourPointSevenLitre));
    }

    @Test
    public void add_should_throw_exception_error_when_litre_is_added_inch() {
        Litre oneLitre = new Litre(1);
        Inch oneInch = new Inch(1);
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Litre can only add gallon and litre with it");
        oneLitre.add(oneInch);

    }
}