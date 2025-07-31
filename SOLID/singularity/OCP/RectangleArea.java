package SOLID.singularity.OCP;

public class RectangleArea implements Shape {

    private int length;
    private int width;

    public RectangleArea(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int area() {
        return length * width;
    }

    @Override
    public int perimeter() {
        return 2*(length + width);
    }
}
