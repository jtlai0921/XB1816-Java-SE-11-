/*�{��:CH14_09.java
 *����:getMessgse() */
class CH14_09{
    public static void main(String[] args) throws ArithmeticException{
        int a=15;
        int b=16;
        try{
            double d=(a+b)/(b-a-1);
        }catch(ArithmeticException e){
            System.out.println("���o�ҥ~���~�T���G"+e.getMessage());
        }
    }
}