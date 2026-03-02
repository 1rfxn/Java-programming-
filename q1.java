import java.lang.System;
import java.util.Scanner;

class q1 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        double f = d/e;
        System.out.println("The product is"+d);
        System.out.println("The Sum is "+e);
        System.out.print("The division of d & e is "+f);
    }
}
