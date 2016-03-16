public class RectangleArea implements Calculate {
    private final int height;
    private final int width;

    public RectangleArea(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculate() {
        return height * width;
    }
}
