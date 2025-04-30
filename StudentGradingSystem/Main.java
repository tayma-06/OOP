public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Tayma", 20, "230042135");
        Course course1 = new Course("SWE 4202", "Object Oriented Concepts I Lab");
        Grade grade1 = new Grade(55, 100, 95);
        student1.display();
        System.out.println();
        course1.display();
        System.out.println();
        grade1.display();
        System.out.println();
        grade1.displayGrades();
    }
}
