public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void showArea() {
        System.out.print("Pole koła o promieniu" + " " + radius + " " + "wynosi" + " ");
    }
    public void showPerimeter(){
        System.out.print("Obwód koła o promieniu" + " " + radius + " " + "wynosi" + " ");
    }


}
