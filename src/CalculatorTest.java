public class CalculatorTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,6);
        Circle circle1 = new Circle(5);
        rectangle1.showArea();
        System.out.println(ShapeCalculator.rectangleArea(rectangle1));
        rectangle1.showPerimeter();
        System.out.println(ShapeCalculator.rectanglePerimeter(rectangle1));
        circle1.showArea();
        System.out.printf("%.1f%n", ShapeCalculator.circleArea(circle1));
        circle1.showPerimeter();
        System.out.printf("%.1f%n", ShapeCalculator.circlePerimeter(circle1));

    }

}
