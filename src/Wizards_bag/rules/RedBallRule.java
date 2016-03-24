package Wizards_bag.rules;

import Wizards_bag.balls.Ball;
import Wizards_bag.balls.Balls;
import Wizards_bag.color.Color;
import Wizards_bag.exceptions.RedBallFullException;

public class RedBallRule implements Rule{
    @Override
    public boolean canBeAdded(Ball ball, Balls balls) throws RedBallFullException {
        if(ball.isColorOf(Color.RED)){
            if(balls.noOfBallsOf(Color.RED) < (balls.noOfBallsOf(Color.GREEN) *2)-1)
                return true;
            throw new RedBallFullException();
        }
        return true;
    }
}
