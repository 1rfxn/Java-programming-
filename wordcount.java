class wordcount  
{
	public static void main(String[] args) 
	{
		String s = " Vel 343Tech High Tech     ";
		int count = 0;
		Boolean word = true;
		
		
		
		
		for ( int i = 0 ; i < s.length() - 1 ; i++ )
		{
				if((s.charAt(i+1) == ' ') && ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) && !(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) )
					count++;
	
		}
		System.out.println(count);
	}
}
