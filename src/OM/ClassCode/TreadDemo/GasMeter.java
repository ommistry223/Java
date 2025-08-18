package OM.ClassCode.TreadDemo;
import java.util.*;
class Fu1{
      void value(int f)
      {
          int Fuel=f;
      }
}
class Fu2{
    void value(int f)
    {
        int Fuel=f;
    }
}
class Fu3{
    void value(int f)
    {
        int Fuel=f;
    }
}
public class GasMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fu1 f1= new Fu1();
        Fu1 f2= new Fu1();
        Fu1 f3= new Fu1();
        int n= sc.nextInt();
        while(n!=1 && n!=2 && n!=3)
        {
            if(n==1)
            {
                System.out.println("What do you want : 1-95,2-98,3-Diesel(type any other number to quit)");
                int fu = sc.nextInt();
                f1.value(fu);
            }
            if(n==2)
            {
                System.out.println("What do you want : 1-95,2-98,3-Diesel(type any other number to quit)");
                int fu1 = sc.nextInt();
                f1.value(fu1);
            }
            if(n==3)
            {
                System.out.println("What do you want : 1-95,2-98,3-Diesel(type any other number to quit)");
                int fu2 = sc.nextInt();
                f1.value(fu2);
            }
        }
    }
}
