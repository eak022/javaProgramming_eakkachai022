import java.util.Scanner;

public class Execrise51 {   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number1 :");
        int Number1 = scan.nextInt();
        System.out.print("Enter Number2 :");
        int Number2 = scan.nextInt();
        System.out.print("Enter Number3 :");
        int Number3 = scan.nextInt();
        System.out.print("Enter Number4 :");
        int Number4 = scan.nextInt();
        System.out.print("Enter Number5 :");
        int Number5 = scan.nextInt();
        int  max = Number1;

        if(max<Number2){
            max=Number2;
        }
        if (max<Number3){
            max=Number3;
        }
        if (max < Number4) {
            max = Number4;
        }
        if (max < Number5) {
            max = Number5;
        }
        System.out.println("The Maximum velue is" +max);
    }

    
}