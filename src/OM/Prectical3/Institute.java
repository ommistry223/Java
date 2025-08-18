package OM.Prectical3;

public class Institute {
    int icode = 0;
    static String iname = null;
    public final String location = "Charusat";

    public static String changInst(String iname)
    {   Institute.iname=iname;
        return iname;
    }
    public Institute(){
        System.out.println("Welcome to CSPIT.");
    }
    public  Institute(int icode,String iname){
        this.icode=icode;
        this.iname=iname;
    }
    void display()
    {
        System.out.println("Name :: " + iname);
    }


}
