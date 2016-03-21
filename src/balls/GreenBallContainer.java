package balls;

import java.util.ArrayList;

public class GreenBallContainer implements Container {
    private final ArrayList<Ball> balls;

    public GreenBallContainer() {
        this.balls = new ArrayList<Ball>();
    }

    @Override
    public boolean canBeAdded(Ball ball) {
        if (!ball.isOfColor(Color.GREEN)) return false;
        if (ballCount() < 3){
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
