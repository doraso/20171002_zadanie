public class CalculatorTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle("czerwony", 5.1, 6.3);
        shapes[1] = new Rectangle("niebieski", 4, 7);
        shapes[2] = new Circle("różowy", 6.7);
        shapes[3] = new Circle("czarny", 4);

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle) {
                ((Rectangle) shapes[i]).showArea();
                System.out.printf("%.1f%n",ShapeCalculator.rectangleArea((Rectangle)shapes[i]));
                ((Rectangle) shapes[i]).showPerimeter();
                System.out.printf("%.1f%n",ShapeCalculator.rectanglePerimeter((Rectangle) shapes[i]));
                shapes[i].show();
            } else {
                ((Circle) shapes[i]).showArea();
                System.out.printf("%.1f%n", ShapeCalculator.circleArea((Circle) shapes[i]));
                ((Circle) shapes[i]).showPerimeter();
                System.out.printf("%.1f%n", ShapeCalculator.circlePerimeter((Circle) shapes[i]));
                shapes[i].show();
            }
        }


    }

}
