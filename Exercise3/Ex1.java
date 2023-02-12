
import java.util.Scanner;
public class Ex1
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("you number: ");
int x = input.nextInt();
if (x == 0){
    System.out.println("is Zero");
}
    else if ( x % 2 == 0 ){
        System.out.println("is Evennumber");
    }
        else  {
           System.out.println("is Oddnumber"); 
        }
}
}
