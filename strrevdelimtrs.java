class strrevdelimtrs
{
	public static void main(String[] args) 
	{
		StringBuffer a = new StringBuffer("Hi! Irfan");
		int i = a.length() - 1;
		String res = "";
		while(i >= 0)
		{
			if (Character.isLetter(a.charAt(i)))
			res += a.charAt(i);
			else
				a.insert(2,'!');
			i--;
		}
		System.out.println(res);
	}
}
