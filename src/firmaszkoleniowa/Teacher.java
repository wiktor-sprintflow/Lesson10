package firmaszkoleniowa;

public class Teacher extends Person {
    private String subject;

    public Teacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Przedmiot: " + subject);
    }
}
