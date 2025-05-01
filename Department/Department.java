import java.util.ArrayList;

public class Department {
    public String name;
    public String shortName;
    public int establishedYear;
    public ArrayList<String> students;

    public Department(String name, String shortName, int establishedYear) {
        this.name = name;
        this.shortName = shortName;
        this.establishedYear = establishedYear;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(String studentName) {
        students.add(studentName);
        System.out.println(studentName + " enrolled in " + shortName + " department.");
    }

    public void removeStudent(String studentName) {
        if (students.remove(studentName)) {
            System.out.println(studentName + " removed from " + shortName + " department.");
        } else {
            System.out.println(studentName + " not found in " + shortName + " department.");
        }
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department Name: " + name);
        System.out.println("Short Name: " + shortName);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Enrolled Students: " + students);
    }
}