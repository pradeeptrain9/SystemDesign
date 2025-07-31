package SOLID.OCP;

public class AreaCalculator {

    public int calculateArea(Shape shape) {
        return shape.area();
    }

    public int calulatePerimeter(Shape shape) {
        // This method can be implemented if needed, but currently not used.
        return shape.perimeter(); // Placeholder implementation
    }

    public static void main(String[] args) {
        Shape rectangle = new RectangleArea(5, 10);
        Shape square = new SquareArea(4);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
        System.out.println("Square Area: " + calculator.calculateArea(square));
        System.out.println("Rectangle Perimeter: " + calculator.calulatePerimeter(rectangle));
        System.out.println("Square Perimeter: " + calculator.calulatePerimeter(square));
    }
}
