package carParking.watcher;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

public class CivicBodyTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void update_can_throw_exception_if_more_than_80_percent() {
        CivicBody civicBody = new CivicBody();
        exception.expect(IncreaseTaxException.class);
        List<Object> cars = new ArrayList<Object>();
        cars.add(new Object());
        cars.add(new Object());
        cars.add(new Object());
        cars.add(new Object());
        civicBody.update(cars, 5);
    }
}