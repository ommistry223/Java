package OM;

public class Basic1 {
    // ---------- fields ----------
    public int    id;
    public String name;
    private double salary;
    public String department;

    // static counter to track how many employees are created
    private static int count = 0;


    public Basic1() {
        this(0, "Unknown", 0.0, "General");
    }

    public Basic1(int id, String name, double salary, String department) {
        this.id         = id;
        this.name       = name;
        this.salary     = salary;
        this.department = department;
    }


    public static int getEmployeeCount() { return count; }

    public void display() {
        System.out.println("Employee Id:         " + id);
        System.out.println("Employee Name:       " + name);
        System.out.println("Employee Salary:     ₹" + salary);
        System.out.println("Employee Department: " + department);
    }
}