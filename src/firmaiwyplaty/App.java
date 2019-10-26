package firmaiwyplaty;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Jan", "Kowalski", 2000);
        employees[1] = new Director("Marcin", "Nowak", 3000, 500);

        printInfo(employees);
        System.out.println(countPayment(employees));
        System.out.println(countEmployees(employees,2500));


    }

    private static double countPayment(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getTotalPayment();
        }
        return sum;
    }

    private static void printInfo(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getInfo());
        }
    }

    private static int countEmployees(Employee[] employees, int limit) {
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getTotalPayment() > limit) {
                counter++;
            }
        }
        return counter;
    }
}
