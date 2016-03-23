package Wizards_bag;

import exceptions.IlligalBagCapacityException;
import exceptions.InvalidColoredBallException;
import exceptions.OutOfCapacityException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BagTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createShouldNotAllowToCreateIfSizeIsMoreThanTwelve() throws IlligalBagCapacityException {
        thrown.expect(IlligalBagCapacityException.class);
        thrown.expectMessage("Invalid number of capacity for Wizards_bag: 13");
        Bag.create(13);
    }

    @Test
    public void createShouldNotAllowToCreateIfSizeIsLessThanZero() throws IlligalBagCapacityException {
        thrown.expect(IlligalBagCapacityException.class);
        thrown.expectMessage("Invalid number of capacity for Wizards_bag: -1");
        Bag.create(-1);
    }

    @Test
    public void shouldReturnNumberOfBallsInBag() throws IlligalBagCapacityException, InvalidColoredBallException, OutOfCapacityException {
        Bag bag = Bag.create(12);
        Ball greenBall = new Ball(Color.GREEN);
        bag.put(greenBall);
        assertEquals(1, bag.ballCount());
    }


    @Test
    public void shouldNotAllowTheWizardToPutMoreThanThreeGreenBalls() throws IlligalBagCapacityException, InvalidColoredBallException, OutOfCapacityException {
        Bag bag = Bag.create(4);
        Ball greenBall = new Ball(Color.GREEN);
        Ball greenBall2 = new Ball(Color.GREEN);
        Ball greenBall3 = new Ball(Color.GREEN);
        Ball greenBall4 = new Ball(Color.GREEN);

        assertTrue(bag.put(greenBall));
        assertTrue(bag.put(greenBall2));
        assertTrue(bag.put(greenBall3));
        thrown.expect(InvalidColoredBallException.class);
        thrown.expectMessage("You can not put this colored ball");
        bag.put(greenBall4);

        assertEquals(3, bag.ballCount());
    }

    @Test
    public void shouldNotAllowTheUserToPutMoreBallsThanCapacity() throws IlligalBagCapacityException, InvalidColoredBallException, OutOfCapacityException {
        Bag bag = Bag.create(1);
        Ball greenBall = new Ball(Color.GREEN);
        Ball blueBall = new Ball(Color.BLUE);

        bag.put(greenBall);

        thrown.expect(OutOfCapacityException.class);
        thrown.expectMessage("Bag is full..");

        bag.put(blueBall);

        assertEquals(1, bag.ballCount());
    }

    @Test
    public void shouldNotAllowToAddMoreThanThreeRedIfThereIsTwoGreen() throws IlligalBagCapacityException, InvalidColoredBallException, OutOfCapacityException {
        Bag bag = Bag.create(6);
        Ball greenBall = new Ball(Color.GREEN);
        Ball greenBall2 = new Ball(Color.GREEN);
        Ball redBall = new Ball(Color.RED);
        Ball redBall2 = new Ball(Color.RED);
        Ball redBall3 = new Ball(Color.RED);
        Ball redBall4 = new Ball(Color.RED);

        bag.put(greenBall);
        bag.put(greenBall2);
        bag.put(redBall);
        bag.put(redBall2);
        bag.put(redBall3);

        thrown.expect(InvalidColoredBallException.class);
        thrown.expectMessage("You can not put this colored ball");

        bag.put(redBall4);

        assertEquals(5, bag.ballCount());
    }

    @Test
    public void bagShouldNotAllowToPutYellowBallMoreThan40Percent() throws IlligalBagCapacityException, InvalidColoredBallException, OutOfCapacityException {
        Bag bag = Bag.create(5);
        Ball greenBall = new Ball(Color.GREEN);
        Ball greenBall2 = new Ball(Color.GREEN);

        Ball yellowBall = new Ball(Color.YELLOW);
        Ball yellowBall2 = new Ball(Color.YELLOW);

        Ball redBall = new Ball(Color.RED);
        Ball redBall2 = new Ball(Color.RED);

        bag.put(greenBall);
        bag.put(greenBall2);
        bag.put(redBall);
        bag.put(yellowBall);

        thrown.expect(InvalidColoredBallException.class);
        thrown.expectMessage("You can not put this colored ball");
        bag.put(yellowBall2);

        bag.put(redBall2);

        assertEquals(6, bag.ballCount());
    }

    @Test
    public void bagShouldAllowAsMuchBlueBallAsBagCapacity() throws IlligalBagCapacityException, InvalidColoredBallException, OutOfCapacityException {
        Bag bag = Bag.create(2);
        bag.put(new Ball(Color.BLUE));
        bag.put(new Ball(Color.BLUE));
        assertEquals(2, bag.ballCount());
    }
}