import java.util.Scanner;
public class Ex3
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("EnterNumber: ");
int number = input.nextInt();
for( ; number % 2 ==0 ;){
    System.out.print("EnterNumber: ");
    number = input.nextInt();
}
System.out.println(number+" Odd number");
    
}
}