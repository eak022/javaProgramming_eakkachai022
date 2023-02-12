import java.util.Scanner;
public class Ex4
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("EnterNumber1: ");
int number1 = input.nextInt();
System.out.print("EnterNumber2: ");
int number2 = input.nextInt();
System.out.print("EnterNumber3: ");
int number3 = input.nextInt();
for( ; number1 == number2 ;){
    System.out.print("Duplicate number, please enter the number1 again.: ");
    number1 = input.nextInt();
    System.out.print("Duplicate number, please enter the number2 again.: ");
    number2 = input.nextInt();
}
    for( ; number2 == number3 ;){
        System.out.print("Duplicate number, please enter the number2 again.: ");
    number2 = input.nextInt();
    System.out.print("Duplicate number, please enter the number3 again.: ");
    number3 = input.nextInt();
    }
    for( ; number3 == number1 ;){
        System.out.print("Duplicate number, please enter the number3 again.: ");
    number3 = input.nextInt();
    System.out.print("Duplicate number, please enter the number1 again.: ");
    number1 = input.nextInt();
    }

    if(number1 > number2){
         if (number1 > number2){
            System.out.println(" Maximam number is "+number1 );
        }
        else {
            System.out.println(" Maximam number is "+number3 );
        }
    }
    else if (number2 > number3){
        System.out.println(" Maximam number is "+number2 );
    }
    else {
        System.out.println(" Maximam number is "+number3 );
    }

}
}