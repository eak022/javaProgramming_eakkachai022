public class VariableScopDemo {
    public int i; //GLOBAL VARIABLE
    public void method1(){
        int j = 4; //LOCAL VARIABLE
        int k = 2;
    }
    public void method2(){
        int j = 0;
        System.out.println(j);
    }
        public static void main(String[] args){
            VariableScopDemo v1 = new VariableScopDemo();
            v1.method2();

        }
    
}