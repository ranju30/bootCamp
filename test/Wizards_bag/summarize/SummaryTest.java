package Wizards_bag.summarize;

import Wizards_bag.balls.Ball;
import Wizards_bag.balls.Balls;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SummaryTest {
    private Balls balls;

    @Before
    public void setUp() {
        balls = new Balls();

        balls.add(Ball.createBlueBall());
        balls.add(Ball.createBlueBall());
        balls.add(Ball.createBlueBall());

        balls.add(Ball.createYellowBall());

        balls.add(Ball.createBlueBall());

        balls.add(Ball.createYellowBall());
    }

    @Test
    public void totalSummary() {
        Summary summary = new Summary(balls);
        String expected = "Bag: 6 Balls\n" +
                "GREEN: 0\n" +
                "RED: 0\n" +
                "BLUE: 4\n" +
                "YELLOW: 2";
        assertEquals(summary.totalSummary(), expected);
    }

    @Test
    public void sequentialSummary() {
        Summary summary = new Summary(balls);
        String expected = "Bag: 6 Balls\n" +
                "3: BLUE\n" +
                "1: YELLOW\n" +
                "1: BLUE\n" +
                "1: YELLOW";
        assertEquals(summary.sequentialSummary(), expected);
    }
}