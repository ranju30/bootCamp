package Wizards_bag.balls;

import Wizards_bag.color.Color;

import java.util.ArrayList;

public class Balls {
    private final ArrayList<Ball> balls;

    public Balls() {
        this.balls = new ArrayList<Ball>();
    }

    public int noOfBallsOf(Color color) {
        int count = 0;
        for (Ball ball : balls) {
            if(ball.isColorOf(color))
                count++;
        }
        return count;
    }

    public int size() {
        return balls.size();
    }

    public boolean add(Ball ball) {
        return balls.add(ball);
    }
}
