import java.util.Scanner;
public class Ex55 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter num1 ");
       int x = input.nextInt();

       System.out.println("Enter num2 ");
       int y = input.nextInt();

       System.out.println("Enter num3 ");
       int z = input.nextInt();
       if(x > y){
        if(x > z){
            System.out.println("x is greater than y and z");
        }
        else{
            System.out.println("x is greater than y but x is less than z");
        }
       }
       else{
        System.out.println("“x is  less than y");
       }

   }
}