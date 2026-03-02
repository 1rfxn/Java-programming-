import java.util.*;

public class find {
    void evenodd(int num)
    {
        if(num%2==0)
        {
            System.out.println("The "+num+" is EVEN");
        }
        else
        {
            System.out.println("The "+num+" is ODD");
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a = s.nextInt();
        find obj1 = new find();
        obj1.evenodd(a);
    }    
}
