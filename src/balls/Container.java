package balls;

public interface Container {
    boolean canBeAdded(Ball ball);

    void add(Ball ball);
}
