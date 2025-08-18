package OM.Prectice;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        System.out.println("Welcome to Array .");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the Array :: ");
        int n = input.nextInt();

        int A[] = new int[n];
        int i=0;
        while (i< n)
        {
            System.out.print("Enter the " + (i+1)  + "element :");

            A[i]= input.nextInt();
            i++;
        }
        i=0;
        System.out.println("All Element of the Array. ");
        while (i<n)
        {
            System.out.print("Element " + (i+1) + "=");
            System.out.println(A[i]);
            i++;
        }
        System.out.print("Enter the the Number for find in the Array ::");
        int Num = input.nextInt();
        boolean Find = Find_element(A,Num);
        if(Find)
        {
            System.out.println("Element is Found");
        }
        else{
            System.out.println("Element is not Found");
        }

    }
    public static boolean Find_element(int A[],int Num)
    {
        int i=0;
        while (i< A.length)
        {
            if(Num == A[i]) {
                return true;
            }
        }
        return false;
    }

}
