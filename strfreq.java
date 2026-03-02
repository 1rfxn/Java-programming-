class strfreq 
{
	public static void main(String[] args) 
	{
		String s = "engineering";
		s.toLowerCase();
		int i,max = 0;
		char c = '0';
		int[] a = new int[26];
		for(i = 0 ; i < s.length() ; i++)
		{
			int pos = s.charAt(i) - 'a';
			a[pos]++;  
			if(max < a[pos]) {
				max = a[pos];
				c = s.charAt(i);
		}}
		
		System.out.println(c +" - "+max );
		
	}
}
