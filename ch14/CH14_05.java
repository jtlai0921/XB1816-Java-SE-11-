/*程式:CH14_05.java
 *說明:throws的實作
 *使用方法處理例外問題(一) */
class CH14_05{
    static double count(int x,int y){
        double c=(x+y)/(y-x-1);
        return c;
    }
    public static void main(String[] args) throws ArithmeticException{
        int a=15;
        int b=16;
        try{
            System.out.println("例外錯誤不成立"+count(a,b));
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}