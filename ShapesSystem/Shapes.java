public class Shapes {
    private String name;
    private String color;

    public Shapes(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void draw() {
        System.out.println(name + " is been drawn.");
    }

    public double area() {
        return 0.0;
    }

    public double perimeter() {
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
