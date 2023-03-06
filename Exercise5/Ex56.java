import java.util.Scanner;
public class Ex56 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the amount of water you use(liter) ");
       double water = input.nextDouble();

       System.out.println("Domestic Enter 1 Commercial Enter 2 ");
       int customer = input.nextInt();

       int basicservice = 100;
       double sum = 0;
       if(customer == 1){
       sum = water * 0.5 + 100 ;
       }
       else if(customer == 2){
       sum = water * 0.9 + 100 ;
       }
       System.out.println("Your water bill is " + sum);
   }
}