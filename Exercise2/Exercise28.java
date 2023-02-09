import java.util.Scanner;
public class Exercise28
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
final double priceReduction =0.05;
System.out.print("name: ");
String name = input.next();
System.out.print("price: ");
double price = input.nextDouble();
System.out.print("amount: ");
int amount = input.nextInt();
double Total  = price*amount;
double Final  = Total - Total*priceReduction;
System.out.print("Total : ");
System.out.println(Total);
System.out.print("Final : ");
System.out.println(Final);
}
}
