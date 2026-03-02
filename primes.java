class primes
{
	public static void main(String[] args) 
	{
		int n = 35;
		boolean a = false;
			if (n%2 != 0){
			if (n%5 != 0)
				{
			for (int i = 3; i<=n/2 ; i+=2 )
			{
				if(n%i == 0)
				{ a = false;
				break; }
				else
				a = true;
				
			}}}
			if(a == true)
			System.out.println(n+" Prime");
			else
			System.out.println(n+" Not Prime");
		
	}
}
