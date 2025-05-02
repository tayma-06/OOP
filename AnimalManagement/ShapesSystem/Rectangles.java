public class Rectangles extends Shapes {
    private double length;
    private double width;

    public Rectangles(String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}
