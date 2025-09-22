import java.util.Scanner;

class Employee {
    public String name;
    protected double salary;
    private int empId;

    public Employee(String n, double s, int id) {
        name = n;
        salary = s;
        empId = id;
    }

    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + empId);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String n, double s, int id, String dept) {
        super(n, s, id);
        department = dept;
    }

    public void showManagerDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manager Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Manager m = new Manager(name, salary, id, dept);
        m.showManagerDetails();

        sc.close();
    }
}
