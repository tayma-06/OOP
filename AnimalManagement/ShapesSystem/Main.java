public class Main {
    public static void main(String[] args) {
        Circles circle = new Circles("Circle", "Red", 5.0);
        Rectangles rectangle = new Rectangles("Rectangle", "Blue", 4.0, 6.0);

        System.out.println("Circle");
        circle.draw();
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        System.out.println("Rectangle");
        rectangle.draw();
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
