package problem2;

public class demo {
    public static void main(String[] args) {
        // Create objects of different shapes
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 5.0);
        shapes[1] = new Ellipse("Ellipse", 6.0, 3.0);
        shapes[2] = new Triangle("Triangle", 4.0, 5.0, 6.0);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 4.0);

        // Print the objects before scaling
        System.out.println("Objects before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + "\n");
        }

        // Scale the objects
        scaleAll(shapes, 2.0);

        // Print the objects after scaling
        System.out.println("Objects after scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + "\n");
        }
    }

    // Static method to scale all Scalable objects in an array
    public static void scaleAll(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}
