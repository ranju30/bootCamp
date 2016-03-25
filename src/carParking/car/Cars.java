package carParking.car;

import java.util.HashSet;

public class Cars {
    HashSet<Car> cars = new HashSet<Car>();

    public boolean add(Car car) {
        return cars.add(car);
    }

    public int size() {
        return cars.size();
    }
}
