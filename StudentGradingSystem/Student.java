public class Student {
    private String name;
    private int age;
    private String ID;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.ID = "0000";
    }

    public Student(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public void display() {
        System.out.println("Student Information : ");
        System.out.println("Name of the student : " + name);
        System.out.println("Age of the student : " + age);
        System.out.println("ID of the student : " + ID);
    }
}
