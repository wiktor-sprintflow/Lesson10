package firmaiwyplaty;

public class Director extends Employee {
    double bonus;

    public Director(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    String getInfo() {
        return super.getInfo() + " bonus: " + bonus;
    }

    @Override
    public double getTotalPayment() {
        return super.getTotalPayment() + bonus;
    }
}
