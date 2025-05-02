public class Main {
    public static void main(String[] args) {
        Birds parrot = new Birds("Polly", "Parrot", 2, 25, "Green");
        System.out.println("Bird Details");
        parrot.displayDetails();
        parrot.eat();
        parrot.fly();
        parrot.buildNest();
        System.out.println();

        Fish tuna = new Fish("Tuna", "Bluefin", 3, 15, "Light");
        System.out.println("Fish Details");
        tuna.displayDetails();
        tuna.eat();
        tuna.swim();
        System.out.println();

        Whale blueWhale = new Whale("BigBlue", "Blue Whale", 25, 40, "Spongy");
        System.out.println("Whale Details");
        blueWhale.displayDetails();
        blueWhale.eat();
        blueWhale.swim();
        System.out.println();

        Seal seal = new Seal("Sammy", "Harbor Seal", 5, 20, "Light");
        System.out.println("Seal Details");
        seal.displayDetails();
        seal.eat();
        seal.swim();
        System.out.println();
    }
}
