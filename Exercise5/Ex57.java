import java.util.Scanner;
public class Ex57 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("normal working hours ");
       int normalh = input.nextInt();

       System.out.println("overtime hours ");
       int overh = input.nextInt();

       System.out.println("normal wage rate ");
       int rate = input.nextInt();

       int normalwages = normalh * rate;
       double overtimepay = overh * (rate * 1.5);
       double sum = normalwages + overtimepay ;
       System.out.println("normal wages" + normalwages );
       System.out.println("overtime pay" + overtimepay);
       System.out.println("sum" + sum);


   }
}
