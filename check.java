import java.util.Arrays;
class check
{
	public static void main(String[] args) 
	{
		int n = 5;
		int a = 0;
        int b = 1;
        while(n > 0)
        {
        int c = a + b;
        a = b;
        b = c;
        n--;
        
		System.out.println(c);
	}}}