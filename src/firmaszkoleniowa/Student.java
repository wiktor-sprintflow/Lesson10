package firmaszkoleniowa;

public class Student extends Person {
    private int indexNumber;

    public Student(String firstName, String lastName, int age, int indexNumber) {
        super(firstName, lastName, age);
        this.indexNumber = indexNumber;
    }


    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Numer indeksu: " + indexNumber);

    }
}
