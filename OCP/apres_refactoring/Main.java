package OCP.apres_refactoring;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 3);
        System.out.println("Rect Area = " + rectangle.calculateArea());

        Shape circle = new Circle(7);
        AreaCalculator2 areaCalculator = new AreaCalculator2();
        System.out.println("Circle Area = " + areaCalculator.calculateArea(circle));
     }
}
