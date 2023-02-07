import java.util.Scanner;
public class Exercise27
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
final double vat=0.07;
String probuct = scan.next();
double price = scan.nextDouble();
double sum = price*vat;
System.out.println(sum);
}
}