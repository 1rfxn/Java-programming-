import java.util.Scanner;
class sum
{
int largeSmall(String s)
{
	int n = Integer.parseInt(s);
	int c = 0,d = 9;
	String str ;
	while(n > 0)
	{
    if(n%10 > c) 
		c = n%10;
		
	if(n%10 < d || n%10 == 0) 	
		d = n%10;
		
	n /= 10; }
	 return  str = c+"".concat(d+"");
	} }
	
  class sod {
    public static void main(String[] argv) {
	String $a = "1234";
	String $b = "2345";
	String $c = "3456";
	
	sum s = new sum();
	String n1 = s.largeSmall($a);
	String n2 = s.largeSmall($b);
	String n3 = s.largeSmall($c);
	int large = n1.charAt(0)-'0' + n2.charAt(0)-'0' + n3.charAt(0)-'0';
	String m1 = s.largeSmall($a);
	String m2 = s.largeSmall($b);
	String m3 = s.largeSmall($c);
	int small = m1.charAt(1)-'0' + m2.charAt(1)-'0' + m3.charAt(1)-'0';
	int key = large - small;
	System.out.println("Key : "+key);
	}
	}