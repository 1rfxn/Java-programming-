class hpy
{
	public static void main(String[] args) 
	{
		int n = 1111111;
		int sum = 0;
        int x = n;
        StringBuilder s = new StringBuilder();
        while(n > 0)
        {
            int a = (n%10)*(n%10);
            sum += a;
            if(n / 10 == 0) {
                s.append(sum+"");
				System.out.println("s = "+s);				
				if(sum > 9)
				{
					n = sum * 10;
					sum	= 0;
				}
				else if(sum != 1)
				{
					for(int i = 0 ; i < s.length() - 1 ; i++)
					{
						if(s.charAt(i) - '0' == sum)
						{ n = 0;
						break; }
					}

				}
				}
            n/=10;
        }
		System.out.println(n);
		if (n == 1)
		{
			System.out.println(x+" is a Happy Number");
		}
		else
		{
			System.out.println(x+" is Not a Happy Number");
		}
	}
}
