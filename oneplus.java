class oneplus 
{
	public static void main(String[] args) 
	{
		int[] digits = {9,8,7,6,5,4,3,2,1,0};
        long temp = 0l;
        String s = "";
        for (int i = 0 ; i < digits.length ; i++)
        {
            temp = temp*10 + digits[i];
        }
        temp++;
		System.out.println("temp = "+temp);
        s += temp;
		System.out.println("s = "+s);
        int[] a = new int[s.length()];
        for (int i = 0 ; i < a.length ; i++)
        {
            a[i] = a[i] + (s.charAt(i) - '0');
        System.out.print(a[i]);
		}
	}
}
