import java.util.Scanner;
import java.lang.Math;
public class Ex53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius ");
        double r = input.nextDouble();

        System.out.println("Enter height ");
        double h = input.nextDouble();

        double result = 3.14 * Math.pow(r, 2) * h ;

        System.out.println(result + " cubic centimeter");


    
    
    }
}

    

