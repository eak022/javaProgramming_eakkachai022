public class Ex6 {
    public static void main(String[] args) {
        double number = 1 ;
         for(double i = 1 ; i <= 100 ; i++){
             if (i % 2 == 0){
                 number = number * i ;
                 
             }   
             
         } 
         System.out.print("ผลคูณเลขคู่ตั้งแต่1-100 คือ " + number );  
     }
}
