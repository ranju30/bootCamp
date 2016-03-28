package carParking.watcher;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class AssistantTest {

    @Test
    public void update() {
        Assistant assistant = new Assistant();
        assistant.update(new ArrayList(), 0);
        Display expected = new Display(0, 0);
        assertEquals(expected, assistant.display());
    }
}