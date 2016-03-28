package carParking.watcher;

import java.util.List;

public class CivicBody implements Watcher {
    @Override
    public void update(List lot, int maxCapacity) {
        if (lot.size() * 100 / maxCapacity >= 80)
            throw new IncreaseTaxException();
    }
}
