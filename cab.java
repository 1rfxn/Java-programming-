import java.util.Scanner;

class cab {
public static void main(String... args) {

Scanner s = new Scanner(System.in);
System.out.print("Enter Taxi Number : ");
String taxi = s.nextLine();
Scanner a = new Scanner(System.in);
System.out.print("Enter Total Distance Travelled : ");
int d = a.nextInt();
int amt = 0;

System.out.println("Taxi No. : "+taxi);
System.out.println("Distance covered : "+d);

if(d>25) {
d-=25;
amt = 280+(d*5); }
else if(d>=16 && d<=25) {
d-=15;
amt = 200+(d*8); }
else if(d>=6 && d<=15) {
d-=5;
amt = 100+(d*10); }
else {
amt = d*20; }


System.out.println("Amount : "+amt);
}}
