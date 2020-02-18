/*程式:CH14_08.java
 *說明:throws的實作
 *多catch區塊 */
class CH14_08{
    public static void main(String[] args) throws ArithmeticException,IndexOutOfBoundsException{
        int a=15;
        int b=16;
        double c[]=new double[2];
        try{
            double d=(a+b)/(b-a-1);
        }catch(ArithmeticException e){
            System.out.println("分母為0的例外錯誤："+e);
        }catch(IndexOutOfBoundsException e){
            System.out.println("超出陣列範圍的例外錯誤："+e);
        }
        
        try{
            double d=(a+b)/(b-a);
            c[3]=d;
        }catch(ArithmeticException e){
            System.out.println("分母為0的例外錯誤："+e);
        }catch(IndexOutOfBoundsException e){
            System.out.println("超出陣列範圍的例外錯誤："+e);
        }          
    }
}