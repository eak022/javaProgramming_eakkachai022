import java.util.Scanner;
public class Ex42 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("จำนวนสินค้า : ");
        int n = input.nextInt();
        double sum = 0;
        for( ; n > 0; n--){
            System.out.print("ราคาสินค้า: ");
            double x = input.nextDouble();
            sum = sum +x;
        }
        System.out.println("ราคาสินค้ารวม" + sum);
 
}
}