package balls;

public class Ball {
    private Color ballColor;

    public Ball(Color ballColor) {
        this.ballColor = ballColor;
    }

    public boolean isOfColor(Color color) {
        return ballColor == color;
    }
}
