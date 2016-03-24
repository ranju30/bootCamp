package Wizards_bag.bag;

import Wizards_bag.balls.Ball;
import Wizards_bag.exceptions.*;
import Wizards_bag.rules.GreenBallRule;
import Wizards_bag.rules.RedBallRule;
import Wizards_bag.rules.Rules;
import Wizards_bag.rules.YellowBallRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class BagTest {

    private Rules rules;
    private Bag bag;

    @Before
    public void setUp() throws Throwable{
        rules = new Rules();
        rules.add(new GreenBallRule());
        rules.add(new RedBallRule());
        rules.add(new YellowBallRule());

        bag = Bag.create(12, rules);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldNotAllowToCreateABagOfSizeMoreThan12() throws Throwable{
        thrown.expect(InvalidBagSizeException.class);
        thrown.expectMessage("Capacity should be within 0 to 12");
        Bag.create(13, rules);
    }

    @Test
    public void shouldNotAllowToCreateABagOfSizeLessThan0() throws Throwable{
        thrown.expect(InvalidBagSizeException.class);
        thrown.expectMessage("Capacity should be within 0 to 12");
        Bag.create(-1, rules);
    }

    @Test
    public void shouldNotAllowToPutMoreBallsThanCapacity() throws Throwable{
        Bag bag = Bag.create(1, rules);
        bag.put(Ball.createGreenBall());

        thrown.expect(BagFullException.class);
        thrown.expectMessage("Bag is full");

        bag.put(Ball.createGreenBall());
    }

    @Test
    public void canAddOneGreenBallAtFirst() throws Throwable{
        bag.put(Ball.createGreenBall());
        assertEquals(1, bag.getSize());
    }

    @Test
    public void canNotAddMoreThanThreeGreenBall() throws Throwable{
        bag.put(Ball.createGreenBall());
        bag.put(Ball.createGreenBall());
        bag.put(Ball.createGreenBall());

        thrown.expect(GreenBallFullException.class);
        thrown.expectMessage("Can't put more than 3 green ball");
        bag.put(Ball.createGreenBall());
    }

    @Test
    public void cannotAddRedIfThereIsNoGreen() throws Throwable{
        thrown.expect(RedBallFullException.class);
        thrown.expectMessage("Can't add anymore red ball");
        bag.put(Ball.createRedBall());
    }

    @Test
    public void canPutAsManyRedBallsAsLessThanDoubleOfGreenBalls() throws Throwable{
        bag.put(Ball.createGreenBall());
        bag.put(Ball.createGreenBall());
        bag.put(Ball.createRedBall());
        bag.put(Ball.createRedBall());
        bag.put(Ball.createRedBall());

        assertEquals(5, bag.getSize());
    }

    @Test
    public void canPutAsManyBlueBallAsPerTheCapacity() throws Throwable{
        Bag bag = Bag.create(2, rules);
        bag.put(Ball.createBlueBall());
        bag.put(Ball.createBlueBall());
        assertEquals(2, bag.getSize());
    }

    @Test
    public void canNotPutBlueBallMoreThanTheCapacity() throws Throwable{
        Bag bag = Bag.create(2, rules);
        bag.put(Ball.createBlueBall());
        bag.put(Ball.createBlueBall());

        thrown.expect(BagFullException.class);
        thrown.expectMessage("Bag is full");

        bag.put(Ball.createBlueBall());
    }

    @Test
    public void canHoldFortyPercentYellowBallsOfBagSize() throws Throwable{
        bag.put(Ball.createBlueBall());
        bag.put(Ball.createBlueBall());
        bag.put(Ball.createYellowBall());
        assertEquals(3,bag.getSize());
    }

    @Test
    public void cannotAddMoreThanFortyPercentYellowBallOfBagSize() throws GreenBallFullException, YellowBallFullException, RedBallFullException, BagFullException {
        bag.put(Ball.createBlueBall());
        bag.put(Ball.createBlueBall());
        bag.put(Ball.createBlueBall());
        bag.put(Ball.createBlueBall());
        bag.put(Ball.createYellowBall());
        bag.put(Ball.createYellowBall());

        thrown.expect(YellowBallFullException.class);
        thrown.expectMessage("Can't add anymore yellow ball");
        bag.put(Ball.createYellowBall());
    }
}
