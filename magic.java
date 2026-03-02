import java.util.Scanner;

class magic
{
public static void main(String... args)
{
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int sum=0,x;

while(n>0)
{
x=n%10;
sum=sum+x;
n/=10;
if (sum>9)
{
n = sum;
sum = 0;
}}
System.out.println(sum);
if (sum==1)
System.out.println("Magical");
else
System.out.println("-1");
}}