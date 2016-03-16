public class RectanglePerimeter implements Calculate{
    private final int height;
    private final int width;

    public RectanglePerimeter(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculate() {
        return 2 * (height + width);
    }
}
