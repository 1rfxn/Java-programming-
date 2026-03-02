class primmme
{
public static void main(String... Awwwwww)
{
	int count = 0;
for (int i = 3;i<=100 ;i+=2) {
	if(i%5 != 0)
	for (int j = 3;j<=i/2 ;j+=2 )
	{
		if(i%j == 0)
	    break;
		if(i%j != 0) {
		count++;
		System.out.print(i+" ");
		break; }
	} }
	System.out.println("Count "+count);
}
}