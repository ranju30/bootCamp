package balls;

import java.util.ArrayList;

public class RedBallContainer implements Container {
    private final ArrayList<Ball> balls;
    private int threshold;

    public RedBallContainer() {
        this.balls = new ArrayList<Ball>();
        this.threshold = 0;
    }

    @Override
    public boolean canBeAdded(Ball ball) {
        if (!ball.isOfColor(Color.RED)) return false;
        if (threshold > ballCount()) return true;
        return false;
    }

    private int ballCount() {
        return balls.size();
    }

    @Override
    public void add(Ball ball) {
        balls.add(ball);
    }

    public void updateThreshold(Ball ball) {
        if (ball.isOfColor(Color.GREEN)) {
            threshold += 2;
        }
    }
}
