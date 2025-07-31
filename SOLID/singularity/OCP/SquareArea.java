package SOLID.singularity.OCP;

public class SquareArea implements Shape {

    private int side;

    public SquareArea(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }

    @Override
    public int perimeter() {
        return 4*side;
    }
}
