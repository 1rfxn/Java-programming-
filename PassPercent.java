import java.util.Scanner;

class Passpercent {
public static void main(String[] args) {

Scanner m = new Scanner(System.in);
System.out.println("Enter your Maths marks");
int mat = m.nextInt();

Scanner p = new Scanner(System.in);
System.out.println("Enter you Physics");  
int phy = p.nextInt();

Scanner c = new Scanner(System.in);
System.out.println("Enter your Coding marks");
int cod = c.nextInt();

Scanner q = new Scanner(System.in);
System.out.println("Enter your Quantz marks");
int qntz = q.nextInt();

Scanner l = new Scanner(System.in);
System.out.println("Enter your Logical marks");
int log = l.nextInt();

int marks = mat+phy+cod+qntz+log;
float percent = marks/5;
if (percent>=35 && (mat>=35 && phy>=35 && cod>=35 && qntz>=35 && log>=35)) {
System.out.println("You are Passed with "+percent+"%");
}
else {
System.out.println("You are Failed with "+percent+"%");
}
}
}