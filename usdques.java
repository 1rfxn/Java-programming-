class usdques 
{
	public static void main(String[] args) 
	{
		String str = "laptop 100;mobile 21;tv 123";
		String[] s = str.split(";");
		String a = "";
		int min = 9999999,num = 0;
		for (String i : s) 
			{
			String[] item = i.split(" ");
				num = Integer.parseInt(item[1]);
			if(num < min) {
				min = num;
				a = item[0];
				}
			}
			
			System.out.println(a);
	}}
