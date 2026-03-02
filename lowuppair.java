import java.util.Arrays;
class lowuppair
{
	public static void main(String[] args) 
	{
		StringBuilder a = new StringBuilder("aaaaaaABbbb");
		int c = 0;
		for(int i = 0 ; i < a.length() - 1 ; i++)
		{
			System.out.println("c = "+c);
			System.out.println("i = "+i);
			for(int j = i+1 ; j < a.length() ; j++)
			{
			if((a.charAt(i) == ((char)(a.charAt(j) - 32)))|| (((char)(a.charAt(i) - 32)) == a.charAt(j)))
			{
				c++;
				a.deleteCharAt(i);
				System.out.println("a = "+a);
				a.deleteCharAt(j);
				System.out.println("a = "+a);
				i--;
				break;
			}
			}
			System.out.println("i = "+i);
		}
		System.out.println(c);
	}
}
