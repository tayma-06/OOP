import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("ID (or type 'auto' to generate automatically): ");
            String idInput = scanner.nextLine();
            String id;
            if (idInput.equals("auto")) {
                id = Student.generateId();
            } else {
                id = idInput;
            }
            students[i] = new Student(name, age, gpa, id);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            students[i].printStudent(i + 1);
        }
        scanner.close();
    }
}
