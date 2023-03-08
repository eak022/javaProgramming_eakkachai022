public class Ex58 {
    public static void main(String[] args) {
        String answers = "" ;
        for (int i = 100 ; i < 200; i++){
            if (i % 5 == 0 || i % 11 == 0){            
                if (i % 11 == 0)                 
                    if (i % 55 != 0){                      
                        if( answers ==  ""){
                            answers = answers + i;
                        }
                        else{
                            answers = answers + "," + i ;            
                        }
                       
                        
                    
                }

            }
        }
        System.out.println("จำนวนที่หารด้วย 5 หรือ 11 ลงตัว แต่หาร 55 ไม่ลงตัวมีดังนี้" + answers );

    }
    
}
