package balls;

import java.util.ArrayList;

public class BlueBallContainer implements Container {
    private final ArrayList<Ball> balls;

    public BlueBallContainer() {
        this.balls = new ArrayList<Ball>();
    }

    @Override
    public boolean canBeAdded(Ball ball) {
        if (!ball.isOfColor(Color.BLUE)) return false;
        if (ballCount() < 12){
            return true;
        }
        return false;
    }

    private int ballCount() {
        return balls.size();
    }

    @Override
    public void add(Ball ball) {
        balls.add(ball);
    }
}
