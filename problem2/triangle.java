package problem2;

public class triangle {
    
}
public class Triangle extends Shape {
    // Other fields and methods as before
    // ...

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}
