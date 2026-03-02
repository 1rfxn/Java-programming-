class fr
{
	public static void main(String[] args) 
	{
		int[] a = {23,4,54,100,3,6,4,100};
		int count,temp;
		for (int j = 0;j<a.length ;j++ )
		{
		for (int i = j+1;i<a.length ;i++ )
		{
			if (a[j] > a[i])
			{ 
			temp = a[j];
			a[j] = a[i];
			a[i] = temp; 
			}
			else 
			continue;
		}
		//System.out.println(a[j]);
		}
		
		for (int i = 0;i<a.length ;i++ )
		{ count = 1;
			for (int j = i+1;j<a.length ;j++ )
			{
				if (a[i] == a[j])
					count++;
					else
					break;
					}
				System.out.println(a[i]+"->"+count);
				i+=count-1;
		}
	}
}