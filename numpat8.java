class numpat8
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i = 1;i<=n*2-1 ;i++ )
		{
			for (int j = 1;j<=n ;j++ )
			{
			if (i<=n && j<=i)
			System.out.print(i+" ");
			else if(i>n && j<=n*2-i)
				System.out.print((n*2-i)+" ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
