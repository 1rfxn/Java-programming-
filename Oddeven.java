import java.util.Scanner;
class Oddeven {
public static void main(String... args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter a number: ");
int n = s.nextInt();
if((n%2==1) || (n>=6 && n<=20))
System.out.println("Weird");
else
System.out.println("Not Weird");
}}