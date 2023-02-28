import java.util.Scanner;

public class Execrise49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number :");
        int x = scan.nextInt();
        if (x > 0) {
            System.out.print("Positive number");
        } else if (x < 0) {
            System.out.print("Negative number");
        } else {
            System.out.print("Zero");
        }

    }
}
