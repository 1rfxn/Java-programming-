import java.util.*;

public class Addition {
    int a;
    int b;
    int c;
    void sum()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Number 1 is ");
        int a = s.nextInt();
        System.out.print("Number 2 is ");
        int b = s.nextInt();
        int c;
        c = a+b;
        System.out.println("The Sum is "+c);
    }
    public static void main(String[] args)
    {
        Addition add = new Addition();
        add.sum();
    }
}
