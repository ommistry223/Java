class Simple_Max
{
    int cal;
    int a,b,c;

    int calculation2(int a,int b,int c)
    {
        if(a>b && a>c) {
            cal=a;
        }
        else if(b>a && b>c)
        {
            cal=b;
        }
        else {
            cal=c;
        }
        return cal;
    }
}
class Simple_intrest
{
    float p,r,cal;
    int time,n;
       float calculation1(float p, float r, int time, int n)
       {


           cal=(p * r * time)/ n;

           return cal;
       }
}
public class Calculation {
    public static void main(String[] args)
    {
        Simple_Max M =new Simple_Max();
        Simple_intrest S = new Simple_intrest();
        S.p=10;
        S.r=2.5F;
        S.time=3;
        S.n=2;

        System.out.println(S.calculation1(S.p,S.r,S.time,S.n));

        M.a=2;
        M.b=50;
        M.c=1;

        System.out.println(M.calculation2(M.a,M.b,M.c));


    }
}
