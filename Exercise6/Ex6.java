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
    public void isDividedByN(int n,int x, Scanner input){
        String answers = "" ;
        for (int i = 1; i <= n;i++){
            if (i % x == 0 ){                                                           
                    if( answers ==  ""){
                        answers = answers + i;
                    }
                    else{
                        answers = answers + "," + i ;            
                    }
                   
                    
                
            }

        }
        System.out.println(" 1- " + n +" number divided by " + x + " fit is as follows " + answers );
    }
    
    // 8 printStarAdvance()
    public void printStarAdvance (int num, Scanner input){
        String u = "";
        String s = "*";
        for( int i = 1;i < num; i++){                    
            if( i == 1 ){            
                System.out.println(s);                              
            }
            u = u + "_" ;
            System.out.print(s);
            System.out.print(u);
            System.out.println(s);

        }

    }
        


    public static void main(String[] args){
        Ex6 ex = new Ex6();
        Scanner input = new Scanner(System.in);

        //1 printType1, 2 printType2, 5 ispositive, 6 isodd
       System.out.println("Please, enter a number: ");
        int num = input.nextInt();
    //     ex.printType1(num); 
    //     ex.printType2(num);
    //     ex.ispositive(num, input);
    //     ex.isodd(num, input);
            ex.printStarAdvance(num, input);
}
     // 3checkvowel,4checkchar
        //  System.out.println("Please, enter a character: ");
        //  String text = input.next();
        //  char c = text.charAt(0);
         //ex.checkvowel(c);
         //ex.checkchar(c);


     /*7isDividedByN() */
        // System.out.println("Please, enter a number: ");
        // int n = input.nextInt();
        // System.out.println("Please, enter a number: ");
        // int x = input.nextInt();
        //    ex.isDividedByN(n,x, input);


       
        
       
   
}