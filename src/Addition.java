public class Addition {
    public static void main(String[] args)
    {
        Sum out = new Sum();
        out.calculation(12,34);
    }

    public static class Admin {
        public static void main(String[] args)
        {
            Student sobj=new Student();

            sobj.setdataId(100);
            sobj.setdataName("Om");

            System.out.println(sobj.getdataId());
            System.out.println(sobj.getdataName());
        }
    }
}
