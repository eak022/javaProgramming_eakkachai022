import java.util.Scanner;

public class Execrise45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number1 :");
        float w = scan.nextFloat();
        System.out.print("Enter Number2 :");
        float l = scan.nextFloat();
        System.out.println("ความกว้าง = " + w);
        System.out.println("ความยาว = " + l);
        float area = w * l;
        System.out.print(area);
    }
}