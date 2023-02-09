import java.util.Scanner;
public class Exercise29
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("USD: ");
double usd = input.nextDouble();
double thb  = 35.50;
double rate  = usd * thb;
System.out.printf("THB : %.2f ", rate );
}
}