package carParking.watcher;

import java.util.List;

public interface Watcher {

    void update(List lot, int maxCapacity) throws IncreaseTaxException;
}
