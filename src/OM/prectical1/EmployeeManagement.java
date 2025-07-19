package OM.prectical1;

class PermanentEmployee extends Employee {
    public PermanentEmployee(String id, String name, String department, double salary) {
        super(id, name, department, salary);
    }
}

class ContractEmployee extends Employee {
    public ContractEmployee(String id, String name, String department, double salary) {
        super(id, name, department, salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Employee(); // using default constructor
        Employee e2 = new Employee("A122", "Om", "HR", 5200000); // parameterized constructor
        PermanentEmployee p1 = new PermanentEmployee("A222", "Man", "CE", 50000);
        ContractEmployee c1 = new ContractEmployee("A333", "Hit", "Marketing", 20000);

        // Display employee information
        e1.displayInfo();
        System.out.println("---------------------");
        e2.displayInfo();
        System.out.println("---------------------");
        p1.displayInfo();
        System.out.println("---------------------");
        c1.displayInfo();
        System.out.println("---------------------");

        // Count of employees created
        System.out.println("Total Employees Created: " + Employee.getEmployeeCount());
        System.out.println("---------------------------------------");

        // Using instanceof to check object type
        checkEmployeeType(p1);
        checkEmployeeType(c1);
        checkEmployeeType(e1);
    }

    public static void checkEmployeeType(Employee emp) {
        if (emp instanceof PermanentEmployee) {
            System.out.println(emp.getName() + " is a Permanent Employee.");
        } else if (emp instanceof ContractEmployee) {
            System.out.println(emp.getName() + " is a Contract Employee.");
        } else {
            System.out.println(emp.getName() + " is a General Employee.");
        }
    }
}