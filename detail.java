import java.lang.System;
import java.util.Scanner;

class detail {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();
        s.nextLine();
        String city = s.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My Age is "+age);
        System.out.print("My city is "+city);
    }
}
