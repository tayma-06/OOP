public class Birds extends Animal {
    private int wingSpan;
    private String wingColor;

    public Birds(String name, String species, int age, int wingSpan, String wingColor) {
        super(name, species, age);
        this.wingSpan = wingSpan;
        this.wingColor = wingColor;
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    public void buildNest() {
        System.out.println(getName() + " is building a nest");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wing Span : " + wingSpan);
        System.out.println("Wing color : " + wingColor);
    }
}
