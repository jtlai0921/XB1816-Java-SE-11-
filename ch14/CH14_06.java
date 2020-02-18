/*程式:CH14_06.java
 *說明:throws的實作
 *使用方法處理例外問題(二) */
class CH14_06{
    static void count(int x,int y) throws ArithmeticException {
        try{
            double c=(x+y)/(y-x-1);
            System.out.println("例外錯誤不成立"+c);
        }catch(ArithmeticException e){
            System.out.println(e);
        } 		
    }
    public static void main(String[] args)  {
        int a=15;
        int b=16;
        count(a,b);  //呼叫方法
    }
}