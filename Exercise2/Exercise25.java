import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your weight (kg):");
        double weigth = scan.nextDouble();
        System.out.print("Input your hight (cm):");
        double higth = scan.nextDouble();
        double h = (higth / 100);
        double bmi = weigth / (h * h);
        System.out.println("your bmi is : " + bmi);

        String status = " ";
        if (bmi >= 30)
            status = "Very fat";
        else if (bmi >= 25)
            status = "Fat";
        else if (bmi >= 23)
            status = "Overweight";
        else if (bmi >= 18)
            status = "normal";
        else
            status = "Too skinny";

        System.out.println("You are : " + status);

    }
}
