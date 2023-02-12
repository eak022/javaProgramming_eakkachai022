import java.util.Scanner;
public class Ex2
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("ระบุตัวเลข: ");
int number = input.nextInt();
for( ; number <=0 ;){
    System.out.print("ระบุตัวเลข: ");
    number = input.nextInt();
}
System.out.println("เลขของคุณคือ "+number);
    
}
}

// public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     int number;
//     do {
//         System.out.print("Enter the number : ");
//         number = input.nextInt();
//     } while (number <= 0);
//     System.out.println("Your number is : " + number);
//     System.out.println(" ---------------------------- ");

    // System.out.print("Enter the number : "); number = input.nextInt();
    // while(number <= 0){ System.out.print("Enter the number : "); number =
    // input.nextInt();

    // }
    // System.out.println("Your number is : " + number);
// }
// }