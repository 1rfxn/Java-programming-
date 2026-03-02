import java.util.Scanner;
class odd
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		String odsq = "";
		String evsq = "";
		int $od=0,$ev=0;
			for (int i=0;i<n.length();i++)
			{
				if((n.charAt(i) -'0')%2==1)
				{ odsq += n.charAt(i);
					$od++;
				} else {
					evsq += n.charAt(i);
					$ev++;
			}}
		System.out.println(odsq+$od+evsq+$ev);
	}}
