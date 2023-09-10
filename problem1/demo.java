package problem1;
public class Demo {
    public static void main(String[] args) {
        // Create objects of different shapes
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 5.0);
        shapes[1] = new Ellipse("Ellipse", 6.0, 3.0);
        shapes[2] = new Triangle("Triangle", 4.0, 5.0, 6.0);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 4.0);

        // Print the information of each shape using toString method
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + "\n");
        }
    }
}
