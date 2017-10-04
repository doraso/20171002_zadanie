public class Rectangle extends Shape{
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public void showArea() {
        System.out.print("Pole prostokąta o bokach" + " " + a + ", " + b + " " + "wynosi" + " ");
    }

        public void showPerimeter(){
        System.out.print("Obwód prostokąta o bokach" + " " + a + ", " + b + " " + "wynosi" + " ");
    }



}
