class  NamePattern
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 10 ; i++ )
		{
			for (int j = 1;j<=35 ;j++ )
			{
				if (i==1 && j%6!=0 && j<25 || j==3 || j==7 || j==13 || j==19 || j==23 || j==25 || j==34 || i==6 && j%6!=0 && j>6 && j<24 || i==10 && j<6 || j==11 && i<=6 || i>=7 && j>=8 && j<12 && i+1 == j || j>=24 && i+24 == j)					
					System.out.print("* "); 
			
				 else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
