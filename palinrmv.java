class palinrmv
{
	public static void main(String[] args) 
	{
		String a = "abishek";
		String[] arr = a.split(" ");
		String res = "";
		for(int i = a.length() - 1 ; i >= 0 ; i--)
		{
			res += a.charAt(i);
			
		}
System.out.println(res);
	}
}
