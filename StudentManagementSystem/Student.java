import java.util.Random;

class Student {
    private String name;
    private int age;
    private double gpa;
    private String id;

    public Student(String name, int age, double gpa, String id) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.id = id;
    }

    public boolean isValidId() {
        if (id != null && id.matches("\\d{9}") && id.substring(2, 4).equals("00")) {
            return true;
        }
        return false;
    }

    public boolean isValidGPA() {
        if (gpa >= 0.0 && gpa <= 4.0) {
            return true;
        }
        return false;
    }

    public String getFormattedId() {
        if (!isValidId())
            return "Invalid ID";
        return String.format("%s-%s-%s-%s-%s-%s", id.substring(0, 2), id.substring(2, 4), id.charAt(4), id.charAt(5),
                id.charAt(6), id.substring(7));
    }

    public static String generateId() {
        Random rand = new Random();
        int year = rand.nextInt(20, 24);
        int dept = rand.nextInt(1, 7);
        int program = rand.nextInt(1, 5);
        int section = rand.nextInt(1, 3);
        int roll = rand.nextInt(1, 100);
        return String.format("%02d00%d%d%d%02d", year, dept, program, section, roll);
    }

    public void printStudent(int index) {
        System.out.printf("  Student%d: Name=%s, Age=%d, GPA=%.1f, ID=%s\n", index, name, age, gpa, id);
        System.out.println("  ID " + (isValidId() ? "valid" : "invalid"));
        System.out.println("  GPA " + (isValidGPA() ? "valid" : "invalid"));
        System.out.println("  Formatted ID: " + getFormattedId());
        System.out.println();
    }
}