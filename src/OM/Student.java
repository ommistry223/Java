package OM;

public class Student {
    private int stdId;
    private String stdName;

    public Student(){}
    public void setId(int stdID)
    {
        this.stdId=stdID;
    }
    public void setName(String stdName)
    {
        this.stdName=stdName;
    }
    
    public int getId()
    {
        return stdId;
    }
    public String getName()
    {
        return stdName;
    }
}


