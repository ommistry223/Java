package OM;

import java.util.Objects;

public class StudentP2 {

    String id;
    String name;
    String branch;

    public StudentP2(String id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    void display() {
        System.out.println("ID :: " + id);
        System.out.println("Name :: " + name);
        System.out.println("Branch :: " + branch);
    }

    public void checkScholarship(double cgpa) {
        if (cgpa > 7.5) {
            System.out.println("Student is eligible for scholarship");
        } else {
            System.out.println("Student is not eligible for scholarship");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentP2 other = (StudentP2) obj;
        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name) &&
                Objects.equals(branch, other.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, branch);
    }

    public static void main(String[] args) {
        StudentP2 s = new StudentP2("21", "OM", "CSE");
        StudentP2 s1 = new StudentP2("21", "OM", "CSE");
        StudentP2 s2 = new StudentP2("23", "Man", "CE");

        System.out.println("Print Student Details.");
        s.display();
        System.out.println("-----------------------");
        s1.display();
        System.out.println("-----------------------");
        s2.display();
        System.out.println("-----------------------");

        System.out.println("Print Hash Code.");
        System.out.println("HashCode s :: " + s.hashCode());
        System.out.println("HashCode s1 :: " + s1.hashCode());
        System.out.println("HashCode s2 :: " + s2.hashCode());

        System.out.println("-----------------------");
        System.out.println("Check details are equal or not.");
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s1.equals(s2));

        System.out.println("-----------------------");
        System.out.println("Student 1 is eligible or not.");
        s.checkScholarship(8.2);
        s.checkScholarship(6.5);
    }
}
