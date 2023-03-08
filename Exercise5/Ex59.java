import java.util.Scanner;
public class Ex59 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter name ");
       String name = input.next();
       System.out.println("Enter year of birth(BE) ");
       int year = input.nextInt();
       int i = 2566;       
        for(; i <= year;){          
            System.out.println("you gave wrong information ");
            System.out.println("Enter year of birth(BE) ");
            year = input.nextInt();                                          
        }
            year = i- year ;
            System.out.println(name + "อายุ" + year );

   }
}