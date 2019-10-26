package firmaszkoleniowa;

public class Grade {
    private int grade;
    private Student student;
    private Group group;

    public Grade(int grade, Student student, Group group) {
        this.grade = grade;
        this.student = student;
        this.group = group;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    void printInfo(){
        student.printInfo();
        System.out.println(getGroup().getTeacher().getSubject() + " " + grade);
    }
}
