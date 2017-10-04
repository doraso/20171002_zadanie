import static java.lang.Math.*;

public class ShapeCalculator {

    public static double rectangleArea(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }

    public static double rectanglePerimeter(Rectangle rectangle) {
        return 2 * rectangle.getA() + 2 * rectangle.getB();
    }

    public static double circleArea(Circle circle) {
        return circle.getRadius() * Math.PI;
    }

    public static double circlePerimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

}
