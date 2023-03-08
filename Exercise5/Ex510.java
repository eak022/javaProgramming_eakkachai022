import java.util.Scanner;
public class Ex510 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("width 1 ");
       double w1 = input.nextDouble();

       System.out.println("long 1 ");
       double l1 = input.nextDouble();

       System.out.println("width 2 ");
       double w2 = input.nextDouble();

       System.out.println("long 2 ");
       double l2 = input.nextDouble();

       double square1 = w1 * l1;
       double square2 = w2 * l2;
        
       if(square1 > square2 ){
        System.out.println("รูปที่ 1 มีพื้นที่ "+square1);
        System.out.println("รูปที่ 2 มีพื้นที่ "+square2);
        System.out.println("รูปที่ 1 มีพื้นที่มากกว่า");
       }
       else if(square2 > square1 ){
        System.out.println("รูปที่ 1 มีพื้นที่ "+square1);
        System.out.println("รูปที่ 2 มีพื้นที่ "+square2);
        System.out.println("รูปที่ 2 มีพื้นที่มากกว่า");
       }
       else{
        System.out.println("รูปที่ 1 มีพื้นที่ "+square1);
        System.out.println("รูปที่ 2 มีพื้นที่ "+square2);
        System.out.println("ทั้ง 2 รูปมีพื้นที่เท่ากัน");
       }


   }
}
