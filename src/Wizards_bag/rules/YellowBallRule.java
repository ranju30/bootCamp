package Wizards_bag.rules;

import Wizards_bag.balls.Ball;
import Wizards_bag.balls.Balls;
import Wizards_bag.color.Color;
import Wizards_bag.exceptions.YellowBallFullException;

public class YellowBallRule implements Rule{
    @Override
    public boolean canBeAdded(Ball ball, Balls balls) throws YellowBallFullException {
        if(ball.isColorOf(Color.YELLOW)){
            if(((balls.noOfBallsOf(Color.YELLOW)+1)*100/(balls.size()+1)) < 40 )
                return true;
            throw new YellowBallFullException();
        }
        return true;
    }
}
