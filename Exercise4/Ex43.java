import java.util.Scanner;

public class Ex43 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("amout: ");
        int n = input.nextInt();
        System.out.print("price: ");
        float x = input.nextFloat();
        float result = n * x ;
        System.out.println("totle price : " + result);
        
}
}
