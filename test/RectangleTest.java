import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void testcalculateAreaShouldCalculateTheAreaAccordingToHeightAndWidth() throws Exception {
        Rectangle rectangle = new Rectangle(2, 3);
        int area = rectangle.calculate("Area");
        assertEquals(area,6);
    }

    @Test
    public void testcalculatePerimeterShouldCalculateThePerimeterAccordingToHeightAndWidth() throws Exception {
        Rectangle rectangle = new Rectangle(2, 3);
        int perimeter = rectangle.calculate("Perimeter");
        assertEquals(perimeter,10);
    }
}