package OM;

public class Admin {
    public static void main(String[] args) {

        Student Std = new Student();

        Std.setdataId(100);
        Std.setdataName("Om Misty");
        System.out.println("Student Name: " + Std.getdataId());
        System.out.println("Student ID: " + Std.getdataName());
    }
}
