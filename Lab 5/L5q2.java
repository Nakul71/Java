class Employee {
    String name;
    int empid;
    double salary;

    public Employee() {
        this.name = null;
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        }
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

}

public class L5q2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Nakul Yadav", 1, 500000);
        System.out.println("Employee Name: " + emp.name());
        System.out.println("Employee Salary: " + emp.salary());
        emp.increaseSalary(10);
        System.out.println("Updated Salary: " + emp.salary());

        Manager mgr = new Manager("Angel Kwatra", 2, 7000000, "IT");
        System.out.println("Manager Name: " + mgr.getName());
        System.out.println("Manager Salary: " + mgr.getSalary());
        System.out.println("Manager Department: " + mgr.getDepartment());
    }
}
