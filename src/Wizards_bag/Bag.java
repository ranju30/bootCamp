/*
Job of Bag:
    To put a ball to bag if it satisfy specific condition
 */

package Wizards_bag;

import exceptions.IlligalBagCapacityException;
import exceptions.InvalidColoredBallException;
import exceptions.OutOfCapacityException;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final int capacity;
    private final ArrayList<Ball> balls;

    private Bag(int capacity) {
        this.capacity = capacity;
        this.balls = new ArrayList<Ball>(capacity);
    }


    public static Bag create(int capacity) throws IlligalBagCapacityException {
        if (capacity < 0 || capacity > 12)
            throw new IlligalBagCapacityException(capacity);
        return new Bag(capacity);
    }

    public boolean put(Ball ball) throws OutOfCapacityException, InvalidColoredBallException {
        if (!isAvailableSpace())
            throw new OutOfCapacityException();
        if (!canBeAdded(ball))
            throw new InvalidColoredBallException();
        this.balls.add(ball);
        return true;
    }

    private boolean canBeAdded(Ball ball) {
        HashMap<Color, Integer> colorSet = new HashMap<Color, Integer>(4);
        colorSet.put(Color.GREEN, 3);
        colorSet.put(Color.RED, 2 * hasBallsOfColour(Color.GREEN) - 1);
        colorSet.put(Color.BLUE, capacity);
        colorSet.put(Color.YELLOW, (balls.size() * 4) / 10);
        return hasBallsOfColour(colourOf(ball)) < colorSet.get(colourOf(ball));
    }

    private Color colourOf(Ball ball) {
        for (Color colour : Color.values()) {
            if (ball.isOfColor(colour))
                return colour;
        }
        return null;
    }

    private int hasBallsOfColour(Color color) {
        int count = 0;
        for (Ball ball : this.balls) {
            if (ball.isOfColor(color))
                count++;
        }
        return count;

    }

    private boolean isAvailableSpace() {
        return balls.size() < capacity;
    }

    public int ballCount() {
        return balls.size();
    }
}
