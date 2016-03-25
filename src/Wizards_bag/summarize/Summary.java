package Wizards_bag.summarize;

import Wizards_bag.balls.Balls;
import Wizards_bag.color.Color;

public class Summary {
    private Balls balls;

    public Summary(Balls balls) {
        this.balls = balls;
    }

    public String totalSummary() {
        String result = "Bag: " + balls.size() + " Balls\n";
        result += Color.GREEN.name() + ": " + balls.noOfBallsOf(Color.GREEN) + "\n";
        result += Color.RED.name() + ": " + balls.noOfBallsOf(Color.RED) + "\n";
        result += Color.BLUE.name() + ": " + balls.noOfBallsOf(Color.BLUE) + "\n";
        result += Color.YELLOW.name() + ": " + balls.noOfBallsOf(Color.YELLOW);
        return result;
    }

    public String sequentialSummary() {
        String result = "Bag: " + balls.size() + " Balls\n";
        int count = 1;
        Color currentColor = balls.getColor(0);
        for (int i = 1; i < balls.size(); i++) {
            Color color = balls.getColor(i);
            if (currentColor.equals(color))
                count++;
            if (currentColor != color) {
                result += count + ": " + currentColor.name() + "\n";
                currentColor = color;
                count = 1;
            }
        }
        result += count + ": " + currentColor.name();
        return result;
    }
}
