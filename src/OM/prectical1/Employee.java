package OM.prectical1;

public class Employee {

        private String id;
        private String name;
        private String department;
        private double salary;

        private static int employeeCount = 0;

        // Default Constructor
        public Employee() {
            this("None", "Unknown", "Unassigned", 0.0); // constructor chaining
        }

        // Parameterized Constructor
        public Employee(String id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
            employeeCount++;
        }

        // Getters and Setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public static int getEmployeeCount() {
            return employeeCount;
        }

        public void displayInfo() {
            System.out.println("ID :: " + id );
            System.out.println("Name :: "+name);
            System.out.println("Department :: "+department);
            System.out.println("Salary :: "+salary);
        }
    }
