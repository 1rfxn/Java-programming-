import java.util.Scanner;
class arr {
    public static void main(String args[])
    {
        int[] a = {1,2,3,1,2,2,3};
		int[] freq = new int[a.length];
		int count = 0;
		for (int i = 0;i < a.length ;i++ )
		{
			for (int j = i+1;j < a.length ;i++ )
			{
				if (a[i] == a[j])
				{
					freq[i]++;
				}
			}
				System.out.println(freq[i]);
		}
    }
    
}
