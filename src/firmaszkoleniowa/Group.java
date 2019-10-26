package firmaszkoleniowa;

public class Group {
    private Teacher teacher;
    private Student[] students;

    public Group(Teacher teacher, Student[] students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    void printInfo(){
        teacher.printInfo();
        for (Student student : students) {
            student.printInfo();
        }
    }
}
