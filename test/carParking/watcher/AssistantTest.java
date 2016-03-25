package carParking.watcher;

import carParking.car.Cars;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AssistantTest {

    @Test
    public void update() {
        Assistant assistant = new Assistant();
        assistant.update(new Cars(), 0);
        Display expected = new Display(0, 0);
        assertEquals(expected, assistant.display());
    }
}