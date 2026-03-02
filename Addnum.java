import java.util.Scanner;

class Addnum {
public static void main(String... args) {

Scanner s = new Scanner(System.in);
System.out.println("Enter a Number");
int n = s.nextInt();
int $1rem = n%10;
int $1qt = n/10;
int $2rem = $1qt%10;
int $2qt = $1qt/10;
int $3rem = $2qt%10;
int $3qt = $2qt/10;
int sum = $1rem + $2rem + $3rem +$3qt; 
System.out.println(sum);
}}
