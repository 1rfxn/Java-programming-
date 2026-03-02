class chrr
{
	public static void main(String[] args) 
	{
		char n = 'f' ;
		String res = (n >= 'a' && n<= 'z') ? "Alphabet" : (n >= 0 && n<=9) ? "Digit" : "Special Character";
		System.out.println(res);	
	}
}
