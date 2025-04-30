public class Course {
    private String courseCode;
    private String courseName;

    public Course() {
        this.courseCode = "SWE4207";
        this.courseName = "Object Oriented Concepts Lab";
    }

    public Course(String courseCode, String codeName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public void display() {
        System.out.println("Course Information : ");
        System.out.println("Course Code : " + courseCode);
        System.out.println("Course Name : " + courseName);
    }
}
