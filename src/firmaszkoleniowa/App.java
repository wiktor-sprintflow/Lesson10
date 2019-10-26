package firmaszkoleniowa;

public class App {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jan", "Kowalski", 20, "Fizyka");
        Teacher teacher2 = new Teacher("Albert", "Malinowski", 40, "Matematyka");
        Student student1 = new Student("Adam", "Nowak", 15, 1111);
        Student student2 = new Student("Basia", "Zadrozna", 16, 2222);
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        Group group1 = new Group(teacher1, students);
        Group group2 = new Group(teacher2, students);

        Grade grade1 = new Grade(3, student1, group1);
        Grade grade2 = new Grade(5, student1, group2);

        group1.printInfo();
        group2.printInfo();

        grade1.printInfo();
        grade2.printInfo();


    }
}
