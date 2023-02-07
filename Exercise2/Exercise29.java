import java.util.Scanner;
public class Exercise29
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
float usd = scan.nextFloat();
double rate = 35.50;
double sum = usd*rate;
System.out.print("Enter Dollar (USD) amount : ");
System.out.printf("%.2f", usd);
System.out.println();
System.out.printf("Exchange rate 1 (USD) = %.2f (THB)", rate);
System.out.println();
System.out.printf("%.2f (USD) = %.2f (THB)", usd, sum);
}
}