public class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Species Name : " + species);
        System.out.println("Age : " + age);
    }
}
