// the superclass
public class Shape {
    private String color;
    private double dimension;

    public Shape(String color, double dimension) {
        this.color = color;
        this.dimension = dimension;
    }

    public String getColor() {
        return color;
    }

    public double getDimension() {
        return dimension;
    }

    public double area() {
        return 0.0;
    }
}

// the subclasses
    class Circle extends Shape {
    public Circle(String color, double radius) {
        super(color, radius);
    }

    @Override
    public double area() {
        double radius = getDimension();
        return Math.PI * radius * radius;
    }
}

    class Square extends Shape {
    public Square(String color, double side) {
        super(color, side);
    }

    @Override
    public double area() {
        double side = getDimension();
        return side * side;
    }
}

    class Triangle extends Shape {
    public Triangle(String color, double base, double height) {
        super(color, base * height / 2);
    }

    @Override
    public double area() {
        double base = getDimension() * 2 / getBaseHeight();
        double height = getBaseHeight();
        return base * height / 2;
    }

    public double getBaseHeight() {
        return getDimension() * 2 / getBase();
    }

    public double getBase() {
        return getDimension() * 2 / getBaseHeight();
    }
}
