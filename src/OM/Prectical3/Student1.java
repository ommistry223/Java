package OM.Prectical3;

public class Student1 extends Institute{
    String sid;
    String sname;
    String sem;

    public Student1()
    {
        super();
        System.out.println("Welcome to Student Class");
    }

    public Student1(String sid, String sname, String sem)
    {
        this.sid=sid;
        this.sname=sname;
        this.sem=sem;
    }
    void display()
    {
        System.out.println("Student Id :: " + sid + ". Student Name :: " + sname + ". Student sem :: " + sem + ". ");
    }
}
