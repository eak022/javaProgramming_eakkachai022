import java.util.Scanner;
public class Exercise28{
    
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
final double vat=0.05;
String name = scan.next();
double price = scan.nextDouble();
int amount = scan.nextInt();
double total = price*amount;
final double sum = total*vat;

System.out.println(sum);
}
}