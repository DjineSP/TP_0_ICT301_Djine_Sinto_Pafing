package LSP.avant_refactoring;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4); // Attend une aire de 20
        System.out.println("Aire du Rectangle = " + rectangle.getArea());

        Rectangle rectangle1 = new Square();
        rectangle1.setWidth(5);
        rectangle1.setHeight(4); // Attend une aire de 20, mais obtient 16 (4x4)
        System.out.println("Aire du Carré = " + rectangle1.getArea());
    }
}
