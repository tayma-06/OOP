public class Grade {
    private int quiz;
    private int midTerm;
    private int finals;

    public Grade() {
        this.quiz = 0;
        this.midTerm = 0;
        this.finals = 0;
    }

    public Grade(int quiz, int midTerm, int finals) {
        this.quiz = quiz;
        this.midTerm = midTerm;
        this.finals = finals;
    }

    public void display() {
        System.out.println("Grade Information : ");
        System.out.println("Quiz : " + quiz + "/60");
        System.out.println("Midterm : " + midTerm + "/120");
        System.out.println("Final Exam : " + finals + "/120");
    }

    public void displayGrades() {
        System.out.println("Grade of the student : ");
        String grade;
        int totalMarks = quiz + midTerm + finals;
        int fullMarks = 60 + 120 + 120;
        double percentage = ((double) totalMarks / fullMarks * 100);
        if (percentage >= 80)
            grade = "A+";
        else if (percentage >= 75)
            grade = "A";
        else if (percentage >= 70)
            grade = "A-";
        else if (percentage >= 65)
            grade = "B+";
        else if (percentage >= 60)
            grade = "B";
        else if (percentage >= 55)
            grade = "B-";
        else if (percentage >= 50)
            grade = "C+";
        else if (percentage >= 45)
            grade = "C";
        else if (percentage >= 40)
            grade = "D";
        else
            grade = "F";
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Percentage : " + percentage);
        System.out.println("Letter Grade : " + grade);
    }
}
