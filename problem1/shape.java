public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods to compute area and perimeter
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Name: " + name + "\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter();
    }
}
