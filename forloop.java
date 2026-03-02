import java.util.Scanner;
class forloop{
    public static void main(String args[])
    {
        int i;
        int count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a st no.");
        int a = s.nextInt();
        System.out.println("Enter a last no.");
        int b = s.nextInt();
        for(i=a;i<=b;i=i+1)
        {
        if(i%2==1)
        {
           count += i;
        }
		System.out.println(count);
        }
    
    }
}
