class strnum
{
	public static void main(String[] args) 
	{
		String a = "tec3h 8high 53 eng1";
		int sum = 0;
		String s = "";
		for(int i = 0 ; i < a.length() ; i++)
		{
			if((a.charAt(i) - '0' >= 0) && (a.charAt(i) - '0' <= 9))
				s += (a.charAt(i)+"");
			else
				if(s.length() > 0)
			{
				sum += Integer.parseInt(s);
				s = "";
			}
			if(i == a.length() - 1)
				sum += Integer.parseInt(s);
				
		}
		System.out.println(sum);
	}
}