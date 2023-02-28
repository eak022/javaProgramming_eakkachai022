import java.util.Scanner;

public class Execrise410 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number Midterm :");
        int a = scan.nextInt();
        System.out.print("Enter Number Final:");
        int b = scan.nextInt();
        System.out.println("คะแนนสอบกลางภาค = " + a);
        System.out.println("คะแนนสอบปลายภาค = " + b);
        int sum = a + b;
        if (sum >= 80) {
            System.out.println("A");
        } else if (sum >= 75) {
            System.out.println("B+");
        } else if (sum >= 70) {
            System.out.println("B");
        } else if (sum >= 65) {
            System.out.println("C+");
        } else if (sum >= 60) {
            System.out.println("C");
        } else if (sum >= 55) {
            System.out.println("D+");
        } else if (sum >= 50) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

    }
}