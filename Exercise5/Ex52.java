//  import java.util.Scanner;
// public class Ex52 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter number ");
//         int n = input.nextInt();
//         for ( int i = 1; i < 100 ; i++){
//            if (i % n == 0){
//             System.out.println( i + "หารด้วย" + n + "ลงตัว");
//            }
//         }
    
// }
// }

import java.util.Scanner;
public class Ex52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = input.nextInt();
        String answers = "";
        for ( int i = 1; i < 100 ; i++){
           if (i % n == 0){
            if( answers ==  ""){
                answers = answers + i;
            }
            else{
                answers = answers + "," + i ;            }
           
           }
        }
        System.out.println(n + "หารด้วย" + answers + "ลงตัว");
}
}
