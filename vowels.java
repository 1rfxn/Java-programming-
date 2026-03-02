class vowels 
{
	public static void main(String[] args) 
	{
		String a = "Heyyy! I'm here in 3rd floor";
		int $vow = 0, $con = 0, $spe = 0, $num = 0;
		for(int i = 0 ; i < a.length() ; i++)
		{
			if((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'))
			{
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' ||  a.charAt(i) == 'i' ||  a.charAt(i) == 'o' ||  a.charAt(i) == 'u' ||  a.charAt(i) == 'A' ||  a.charAt(i) == 'E' ||  a.charAt(i) == 'I' ||  a.charAt(i) == 'O' ||  a.charAt(i) == 'U')
				$vow++;
			else
				$con++;
			}
			else if(a.charAt(i) >= '0' && a.charAt(i) <= '9')
				$num++;
			else
				$spe++;
		}
		System.out.println("Vowels = "+$vow);
		System.out.println("Consonents = "+$con);
		System.out.println("Numbers = "+$num);
		System.out.println("Special characters = "+$spe);
	}
}
