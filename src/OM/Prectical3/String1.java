package OM.Prectical3;
import java.lang.String;

import java.util.Locale;

public class String1 {
    public static void main(String[] args) {
        String str1="Ommmm";
        String str3="Om";
        String str2= new String("Om");
        String Name= " Om Mistry";

        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);
        System.out.println(str1 + str2);
        System.out.println(str1.intern()==str2.intern());


        String s1 = "hello"; // Interned by default
        String s2 = "hello"; // Uses the same reference as s1
        String s3 = new String("hello"); // Created in heap, not interned
        String s4 = s3.intern(); // Interns s3, potentially creating a new entry

        System.out.println(s1 == s2); // Output: true (same object in the pool)
        System.out.println(s1 == s3); // Output: false (different objects in heap and pool)
        System.out.println(s1 == s4); // Output: true (s4 is interned)
        System.out.println(s3 == s4); // Output: false (s3 is not interned)

        System.out.println(str1.length());

        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf('O'));
        System.out.println(str1.lastIndexOf('m'));

        System.out.println(Name.substring(0,4));
        System.out.println(Name.substring(0,3));
        System.out.println(Name.contains("Om"));
        System.out.println(Name.equalsIgnoreCase("om mistry"));

        System.out.println(Name.toUpperCase());
        System.out.println(Name.toLowerCase());

        System.out.println(Name.toUpperCase());
        System.out.println(Name.trim());
        System.out.println(Name.split(s1));

        StringBuffer St1=new StringBuffer("Mistry");

        System.out.println(St1);
    }
}
