package carParking.criteria;

public class CanAssignToTrainee implements Criteria {
    private static final int MAX_LIMIT = 80;

    @Override
    public boolean doesFulfill(int size, int limit) {
        return (size * 100 / limit) >= MAX_LIMIT;
    }
}
