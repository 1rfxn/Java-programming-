import java.util.Scanner;
class smmm {
public static void main(String... args) {

Scanner s = new Scanner(System.in);
int num = s.nextInt();
//System.out.println((num/1000)+((num/100)%10)+((num/10)%100)+num%10);
System.out.println((num%10)+((num%100)/10)+((num%1000)/100)+(num/1000));
}}
