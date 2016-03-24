package Wizards_bag.bag;

import Wizards_bag.balls.Ball;
import Wizards_bag.balls.Balls;
import Wizards_bag.exceptions.*;
import Wizards_bag.rules.Rule;
import Wizards_bag.rules.Rules;

public class Bag {
    private int capacity;
    private Rules rules;
    private Balls balls;

    public Bag(int capacity, Rules rules) {
        this.capacity = capacity;
        this.rules = rules;
        balls = new Balls();
    }

    public static Bag create(int capacity, Rules rules) throws InvalidBagSizeException {
        if(capacity < 0 || capacity > 12)
            throw new InvalidBagSizeException();
        return new Bag(capacity,rules);
    }

    public boolean put(Ball ball) throws BagFullException, GreenBallFullException, RedBallFullException, YellowBallFullException {
        if(balls.size() == capacity)
            throw new BagFullException();
        for (Rule rule : rules) {
            if(!rule.canBeAdded(ball,balls))
                return false;
        }
        return balls.add(ball);
    }

    public int getSize() {
        return balls.size();
    }
}
