import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your time(minute) ");
        int t = input.nextInt();
        if (t <= 2){
           t = t * 5 ;
        }
        else {
            t = (t - 2) * 2 + 10 ;
        }
        System.out.println("Your service charge is " + t);
    }
}
