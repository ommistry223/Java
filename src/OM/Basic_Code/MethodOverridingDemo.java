package OM.Basic_Code;

    class Employee {
        protected String name;
        protected double baseSalary;

        public Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        public double calculateSalary() {
            return baseSalary;
        }

        public void displayInfo() {
            System.out.println("Employee: " + name);
            System.out.println("Base Salary: $" + baseSalary);
        }

        public String getWorkDescription() {
            return name + " works as an employee";
        }
    }

    class Manager extends Employee {
        private double bonus;
        private int teamSize;

        public Manager(String name, double baseSalary, double bonus, int teamSize) {
            super(name, baseSalary);
            this.bonus = bonus;
            this.teamSize = teamSize;
        }

        // Overriding parent method
        @Override
        public double calculateSalary() {
            double parentSalary = super.calculateSalary(); // Using super to get base calculation
            return parentSalary + bonus; // Extending functionality
        }

        // Overriding parent method
        @Override
        public void displayInfo() {
            super.displayInfo(); // Calling parent method first
            System.out.println("Bonus: $" + bonus); // Adding additional info
            System.out.println("Team Size: " + teamSize);
            System.out.println("Total Salary: $" + calculateSalary());
        }

        // Overriding parent method
        @Override
        public String getWorkDescription() {
            String parentDescription = super.getWorkDescription(); // Getting parent description
            return parentDescription + " and manages " + teamSize + " team members";
        }

        // Additional method specific to Manager
        public void conductMeeting() {
            System.out.println(name + " is conducting a team meeting");
        }
    }

    class Developer extends Employee {
        private String programmingLanguage;
        private int projectsCompleted;

        public Developer(String name, double baseSalary, String language, int projects) {
            super(name, baseSalary);
            this.programmingLanguage = language;
            this.projectsCompleted = projects;
        }

        // Overriding with different logic
        @Override
        public double calculateSalary() {
            double parentSalary = super.calculateSalary();
            double projectBonus = projectsCompleted * 1000; // Bonus per project
            return parentSalary + projectBonus;
        }

        @Override
        public void displayInfo() {
            super.displayInfo(); // Reusing parent implementation
            System.out.println("Programming Language: " + programmingLanguage);
            System.out.println("Projects Completed: " + projectsCompleted);
            System.out.println("Total Salary: $" + calculateSalary());
        }

        @Override
        public String getWorkDescription() {
            return super.getWorkDescription() + " specializing in " + programmingLanguage;
        }
    }

    // Demonstration
    public class MethodOverridingDemo {
        public static void main(String[] args) {
            Employee[] employees = {
                    new Employee("John", 50000),
                    new Manager("Alice", 70000, 15000, 5),
                    new Developer("Bob", 65000, "Java", 8)
            };

            System.out.println("=== Employee Information ===");
            for (Employee emp : employees) {
                emp.displayInfo(); // Calls appropriate overridden method
                System.out.println("Description: " + emp.getWorkDescription());
                System.out.println("Calculated Salary: $" + emp.calculateSalary());
                System.out.println("---");
            }

            // Demonstrating super usage in specific context
            System.out.println("=== Demonstrating super keyword usage ===");
            Manager manager = new Manager("Sarah", 80000, 20000, 10);

            // The overridden method uses super to extend parent functionality
            System.out.println("Manager total salary (using super): $" + manager.calculateSalary());

            // Showing how super helps in method chaining
            manager.displayInfo(); // Uses super.displayInfo() plus additional info
        }
    }

