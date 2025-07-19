package OM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Department: ");
        String department = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();


        Basic1 employee = new Basic1(id, name, salary, department);


        // If you overrode toString() instead:
        System.out.println("\nEmployee details:");
        System.out.println("Employee Data");
        employee.display();

        sc.close();
    }
}