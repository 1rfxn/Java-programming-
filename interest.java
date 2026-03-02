class interest 
{
	public static void main(String[] args) 
	{
		String a = "female" , b = "male";
		int n = Integer.parseInt(args[1]);
		if (args[0].equals("female") && ( n>0 && n<59 ))
		{
			System.out.println("8.2%");
		}
			else if (args[0].equals("female") && (n>58 && n<=100))
			{
				System.out.println("9.2%");
			}
				else if (args[0].equals("male") && (n>0 && n<59))
				{
					System.out.println("8.4%");
				}
				else 
					System.out.println("10.5%");
	}
}
