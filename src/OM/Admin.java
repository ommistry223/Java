package OM;

public class Admin {
    public static void main(String[] args) {

        Student Std = new Student();

        Std.setId(100);
        Std.setName("Om Misty");
        System.out.println("Student Name: " + Std.getId());
        System.out.println("Student ID: " + Std.getName());
    }
}
