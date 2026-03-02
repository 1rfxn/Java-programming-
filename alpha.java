class  alpha
{
	public static void main(String[] args) 
	{
		int n = args.length;
		for(int i = 0; i<n ; i++)
		{
			if (args[i+1].charAt(0)==48)
			{
				System.out.print("No Values");
				break;
			}
			else if (args[i].charAt(0) < args[i+1].charAt(0))
			{
				System.out.print(args[i]+" ,");
			}
			else
				System.out.print(args[i+1]+" ,"+args[i]);
		}
	}
}
