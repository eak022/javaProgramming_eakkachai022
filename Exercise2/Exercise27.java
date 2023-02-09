import java.util.Scanner;
public class Exercise27
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
final double vat=0.07;
System.out.print("productname: ");
String probuct = input.next();
System.out.print("price: ");
double price = input.nextDouble();
double sum = price*vat;
System.out.print("vat 7% :");
System.out.println(sum);
System.out.print(probuct + ":");
System.out.println(sum + price);
}
}
