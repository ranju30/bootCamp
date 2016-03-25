package carParking.criteria;

public class CanPromoteLot implements Criteria {
    @Override
    public boolean doesFulfill(int size, int limit) {
        return size * 100 / limit <= 20;
    }
}
