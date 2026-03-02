class aray 
{
	public static void main(String[] args) 
	{
		int count,max = 0,b = 0;
		int[] a = {1,1,2,2,3,3,2,4,3,2,2,2,4,5,2,6};
		for (int i = 0;i < a.length ;i++ )
		{ 
			count = 1;
			for (int j = i+1;j<a.length ;j++ )
			{
				if (a[i] == a[j])
					count++;
			}
				if (count > max)
			{ max = count;
				b = a[i]; }
				if (i == a.length-1) 
				System.out.println(b+" occurs "+max+" times"); 
		}
	}
}
