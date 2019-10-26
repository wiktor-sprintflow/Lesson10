package firmaiwyplaty;

public class Employee extends Person {
    double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    String getInfo() {
        return super.getInfo() + " wypłata: " + salary;
    }

    public double getTotalPayment(){
        return salary;
    }
}
