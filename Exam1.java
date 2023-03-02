import java.util.Scanner;
public class Exam1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("amount: ");
int n = input.nextInt();
int sum = 0 ;
for(int i = 1; i <= n; i++){
    System.out.print("Price: " + i + " ");
double price = input.nextDouble();
 sum += price ;
}
System.out.println("final" + sum +" " );
System.out.print("pay : ");
int pay = input.nextInt();
int change = pay - sum ;
System.out.println("pay" + change + "bath" );
}
}
