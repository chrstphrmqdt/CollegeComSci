import java.util.Scanner;

public class W7A2Maquidato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the color of the circle:");
        String circleColor = scanner.nextLine();
        System.out.println("Enter the radius of the circle:");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleColor, circleRadius);
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.area());


        System.out.println("Enter the color of the square:");
        String squareColor = scanner.next();
        System.out.println("Enter the side length of the square:");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareColor, squareSide);
        System.out.println("Square color: " + square.getColor());
        System.out.println("Square area: " + square.area());


        System.out.println("Enter the color of the triangle:");
        String triangleColor = scanner.next();
        System.out.println("Enter the base length of the triangle:");
        double triangleBase = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double triangleHeight = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleColor, triangleBase, triangleHeight);
        System.out.println("Triangle color: " + triangle.getColor());
        System.out.println("Triangle area: " + triangle.area());

        scanner.close();
    }
}
