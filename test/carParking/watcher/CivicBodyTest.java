package carParking.watcher;

import carParking.car.Car;
import carParking.car.Cars;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CivicBodyTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void update_can_throw_exception_if_more_than_80_percent() {
        CivicBody civicBody = new CivicBody();
        exception.expect(IncreaseTaxException.class);
        Cars cars = new Cars();
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        civicBody.update(cars, 5);
    }
}