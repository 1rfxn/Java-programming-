import java.util.Scanner;

class diff {
public static void main(String... args)
{
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int ans=0,res=0;

while(n>0)
{
int x=n%10;
int y=(n%100)/10;
int z=x-y;

if(z<0)
z=-z;

ans=ans*10+z;
n/=10;

if (n<10)
break; }

if (ans>99) {
n = ans;
ans = 0; }
else {
break;
}

while(ans>0)
{
int a = ans%10;
res = res*10+a;
ans/=10;
}
System.out.println(res);
}}