public class Main {
    public static void main(String[] args) {
        Department cse = new Department("Computer Science and Engineering", "CSE", 1990);

        cse.enrollStudent("Alice");
        cse.enrollStudent("Bob");
        cse.displayDepartmentInfo();
        cse.enrollStudent("Tayma");
        cse.enrollStudent("Alia");
        cse.enrollStudent("Kiya");
        cse.enrollStudent("Tasfia");
        cse.removeStudent("Alice");
        cse.displayDepartmentInfo();

    }
}
