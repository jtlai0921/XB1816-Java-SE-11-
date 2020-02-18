/*程式:CH14_07.java
 *說明:throws的實作
 *使用自行建立的類別處理例外問題 */
class count{
    private double c;
    double calculate(int x,int y){
        c=(x+y)/(y-x-1);
        return c;
    }
}
class CH14_07{
    public static void main(String[] args) throws ArithmeticException {
        count ct=new count();
        int a=15;
        int b=16;
        try{
            System.out.println("例外錯誤不成立"+ct.calculate(a,b));
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}