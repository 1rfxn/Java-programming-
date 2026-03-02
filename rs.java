import java.util.Scanner;
class rs
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		while(n.length()>2)
		{
			String ans = "";
			for(int i = 0;i<n.length() - 1;i++)
			{
				int a = n.charAt(i) - '0';
				int b = n.charAt(i+1) - '0';
				ans += Math.abs(a-b);
			}
			n=ans;
		}
		System.out.println(n);
	}
}
