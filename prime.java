class primes
{
	public static void main(String[] args) 
	{
		int n = 17;
		int i = 3;
		int count = 2;
			if (n%2 != 0 || n%5 != 0)
			{
			for (i = 3;i<=n ;i+=2 )
			{
				if(n%i != 0 && count == i)
				break;
			}}
			if(n == i)
			System.out.println(n+" Prime");
			else
			System.out.println(n+" Not Prime");
		
	}
}
