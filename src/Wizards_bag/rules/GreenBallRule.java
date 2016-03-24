package Wizards_bag.rules;

import Wizards_bag.balls.Ball;
import Wizards_bag.balls.Balls;
import Wizards_bag.color.Color;
import Wizards_bag.exceptions.GreenBallFullException;

public class GreenBallRule implements Rule{
    @Override
    public boolean canBeAdded(Ball ball, Balls balls) throws GreenBallFullException {
        if(ball.isColorOf(Color.GREEN)){
            if(balls.noOfBallsOf(Color.GREEN) < 3)
                return true;
            throw new GreenBallFullException();
        }
        return true;
    }
}
