class valid_id
{
	public static void main(String[] args) 
	{
		String a = "_dcdc$qs";
		String b = "1234567890";
		for (int i = 0 ; i < a.length() ; i++ )
		{
			if(a.charAt(0) == '$' || a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
			{
				if(a.charAt(i) == '$' || a.charAt(i) == '_' || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || b.contains(a.charAt(i)+""))
				{
					if(i == a.length() - 1)
					System.out.println("Valid Identifier");
				}
				else
				{
					System.out.println("Invalid Identifier");
				    break;
				}
			}
			else
			{
				System.out.println("Invalid Identifier");
				break;
			}
		}
	}
}
