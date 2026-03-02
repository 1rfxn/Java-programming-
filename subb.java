import java.util.Scanner;
class odd
{
	public static void main(String[] args) 
	{
		String n = "12345";	
		String odsq = "";
		String evsq = "";
			for (int i=0;i<n.length() - 1;i++)
			{
				if((n.charAt(i) -'0')%2==1)
					odsq += n.charAt(i);
				else 
					evsq += n.charAt(i);
			}
		System.out.println(odsq+evsq);
	}}
