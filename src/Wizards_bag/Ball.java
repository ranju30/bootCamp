/*
Job of Ball:
    To check whether same color or not
 */

package Wizards_bag;

public class Ball {
    private Color ballColor;

    public Ball(Color ballColor) {
        this.ballColor = ballColor;
    }

    public boolean isOfColor(Color color) {
        return ballColor == color;
    }
}
