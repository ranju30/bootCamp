package Wizards_bag.rules;

import Wizards_bag.balls.Ball;
import Wizards_bag.balls.Balls;
import Wizards_bag.exceptions.GreenBallFullException;
import Wizards_bag.exceptions.RedBallFullException;
import Wizards_bag.exceptions.YellowBallFullException;

public interface Rule {
    boolean canBeAdded(Ball ball, Balls balls) throws GreenBallFullException, RedBallFullException, YellowBallFullException;
}
