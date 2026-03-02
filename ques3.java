class ques3 
{
	public static void main(String[] args) 
	{
		int n = args.length;
		for (int i = 0;i<n;i++ )
		{
			String res = (n==0) ? "No Values" : (i != n-1) ? args[i]+"," : args[i];
			System.out.print(res);		
		}
	}
}
