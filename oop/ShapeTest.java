abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(2.0),
            new Rectangle(3.0, 4.0)
        };

        for (Shape s : shapes) {
            System.out.printf("Area: %.2f%n", s.area());
        }
    }
}
