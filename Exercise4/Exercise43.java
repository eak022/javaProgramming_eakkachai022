import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount :");
        float n = input.nextInt();
        System.out.println("Enter Price :");
        float x = input.nextInt();
        float result = n * x;
        System.out.println("Total price : " + result);
    }
}