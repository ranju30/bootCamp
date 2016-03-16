/*
Job of Rectangle :

 */
public class Rectangle {

    private int height;
    private int width;
    private int result;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int calculate(String operation) {
        if(operation.equals("Area")){
            RectangleArea rectangleArea = new RectangleArea(height, width);
            result = rectangleArea.calculate();
        }
        if(operation.equals("Perimeter")){
            RectanglePerimeter rectanglePerimeter = new RectanglePerimeter(height, width);
            result = rectanglePerimeter.calculate();
        }
        return result;

    }
}
