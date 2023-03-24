import java.util.Scanner;
public class Ex6{
    //Method
    /**
     * 1 Check number type and print out
     * @param num
     */
    public void printType1(int num){
        if(num == 0){
            System.out.println(num + " is zero");
        }else if(num < 0){
            System.out.println(num + " is negative");
        }else{
            System.out.println(num + " is positive");
        }
    }

    /*
    2 Check number odd or even
    */ 
     public void printType2(int num){
        if(num == 0){
            System.out.println(num + " is zero");
        }else if(num % 2 == 0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }

    /*
    3 check vowel
     */
     public void checkvowel(char c){       
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
            System.out.println("This character is a vowel.");
        }else{
            System.out.println("This character is not a vowel.");
        }
    }
    /*
    4 checkchar  65-90 Uppercase 97-122 Lowercase*/ 
    public void checkchar(char c){       
        if(c >= 65 && c <= 90){
            System.out.println("This character is Uppercase");
        }
        else if(c >= 97 && c >= 122){
            System.out.println("This character is Lowercase");
        }
        else{
            System.out.println("This character is Not a letter");
        }
    }

    /*5isPositive */
    public void ispositive(int num, Scanner input){
        while(num <= 0){
            System.out.println("Please, enter a number: ");
         num = input.nextInt();
        }
        System.out.println("Positive number");

    }

    /*6isOdd*/ 
    public void isodd(int num, Scanner input){
        while(num %2 == 0){
            System.out.println("Please, enter a number: ");
         num = input.nextInt();
        }
        System.out.println("Odd number");

    }
    /*7isDividedByN() */
    public void isDividedByN(int num, Scanner input){

    }

    public static void main(String[] args){
        Ex6 ex = new Ex6();
        Scanner input = new Scanner(System.in);
    //    System.out.println("Please, enter a number: ");
    //     int num = input.nextInt();
    System.out.println("Please, enter a number: ");
        int num = input.nextInt();
        //ex.printType1(num); 
        //ex.printType2(num);
        //  System.out.println("Please, enter a character: ");
        //  String text = input.next();
        //  char c = text.charAt(0);
         //ex.checkvowel(c);
         //ex.checkchar(c);
        //  ex.ispositive(num, input);
        ex.isodd(num, input);
    }
   
}