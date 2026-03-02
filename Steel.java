import java.util.Scanner;

class Steel {
public static void main(String... args) {

Scanner s = new Scanner(System.in);
System.out.print("Enter the Hardness : ");
int h = s.nextInt();
Scanner a = new Scanner(System.in);
System.out.print("Enter the amount Carbon content : " );
float c = a.nextFloat();
Scanner b = new Scanner(System.in);
System.out.print("Enter the Tensile strength : ");
int ts = b.nextInt();

if(h>=60 && c>=0.8 && ts>=5700) {
System.out.println("Class --A"); }
else if(h>=60 && c>=0.8) {
System.out.println("Class --B"); }
else if(h>=60 && ts>=5700) {
System.out.println("Class --C"); }
else if(c>=0.8 && ts>=5700) {
System.out.println("Class --D"); }
else if(h>=60 || c>=0.8 || ts>=5700) {
System.out.println("Class --E"); }
else {
System.out.println("Class --F"); }

}}