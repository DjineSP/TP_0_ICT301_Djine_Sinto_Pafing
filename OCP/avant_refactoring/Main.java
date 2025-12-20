package OCP.avant_refactoring;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        double rectangleArea = calculator.calculateArea(rectangle);
        double circleArea = calculator.calculateArea(circle);

        System.out.println("Aire du rectangle : " + rectangleArea);
        System.out.println("Aire du cercle : " + circleArea);
    }
}
