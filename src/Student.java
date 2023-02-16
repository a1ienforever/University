public class Student {

    private int grade;
    private String firstName;


    public Student(String firstName, String lastName, int grade) {
        this.grade = grade;
        this.firstName = firstName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    @Override
    public String toString() {
        return "Student: " +
                "grade=" + grade +
                ", firstName='" + firstName;
    }
}
