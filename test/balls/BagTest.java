package balls;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BagTest {

    @Test
    public void shouldReturnNumberOfBallsInBag() {
        Bag bag = Bag.create();
        Ball greenBall = new Ball(Color.GREEN);
        bag.put(greenBall);
        assertEquals(1, bag.ballCount());
    }


    @Test
    public void shouldNotAllowTheUserToPutMoreThanTwelveBallsInBag() {
        Bag bag = Bag.create();
        Ball greenBall = new Ball(Color.GREEN);
        Ball greenBall2 = new Ball(Color.GREEN);
        Ball greenBall3 = new Ball(Color.GREEN);
        Ball redBall = new Ball(Color.RED);
        Ball redBall2 = new Ball(Color.RED);
        Ball redBall3 = new Ball(Color.RED);
        Ball redBall4 = new Ball(Color.RED);
        Ball redBall5 = new Ball(Color.RED);
        Ball redBall6 = new Ball(Color.RED);
        Ball blueBall = new Ball(Color.BLUE);
        Ball blueBall1 = new Ball(Color.BLUE);
        Ball blueBall2 = new Ball(Color.BLUE);
        Ball blueBall3 = new Ball(Color.BLUE);

        bag.put(greenBall);
        bag.put(greenBall2);
        bag.put(greenBall3);
        bag.put(redBall);
        bag.put(redBall2);
        bag.put(redBall3);
        bag.put(redBall4);
        bag.put(redBall5);
        bag.put(redBall6);
        bag.put(blueBall);
        bag.put(blueBall1);
        bag.put(blueBall2);
        boolean isInserted = bag.put(blueBall3);

        assertEquals(false, isInserted);
        assertEquals(12, bag.ballCount());
    }

    @Test
    public void shouldNotAllowTheWizardToPutMoreThanThreeGreenBalls() {
        Bag bag = Bag.create();
        Ball greenBall = new Ball(Color.GREEN);
        Ball greenBall2 = new Ball(Color.GREEN);
        Ball greenBall3 = new Ball(Color.GREEN);
        Ball greenBall4 = new Ball(Color.GREEN);

        assertTrue(bag.put(greenBall));
        assertTrue(bag.put(greenBall2));
        assertTrue(bag.put(greenBall3));
        assertFalse(bag.put(greenBall4));

        assertEquals(3, bag.ballCount());
    }

    @Test
    public void shouldNotAllowToAddMoreThanFourRedIfThereIsTwoGreen() {
        Bag bag = Bag.create();
        Ball greenBall = new Ball(Color.GREEN);
        Ball greenBall2 = new Ball(Color.GREEN);
        Ball redBall = new Ball(Color.RED);
        Ball redBall2 = new Ball(Color.RED);
        Ball redBall3 = new Ball(Color.RED);
        Ball redBall4 = new Ball(Color.RED);
        Ball redBall5 = new Ball(Color.RED);
        Ball blueBall = new Ball(Color.BLUE);

        bag.put(greenBall);
        bag.put(greenBall2);
        bag.put(redBall);
        bag.put(redBall2);
        bag.put(redBall3);
        bag.put(redBall4);
        assertFalse(bag.put(redBall5));
        assertTrue(bag.put(blueBall));
    }
}