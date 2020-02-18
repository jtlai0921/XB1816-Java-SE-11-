/*檔案:CH08_02.java 單純類別繼承範例*/
//宣告基礎類別
class Accounting{
    //宣告成員方法
    public void plus(int x, int y){
    	int total = x + y;
    	System.out.println(x + " + " + y + " = " + total);
    }
    public void times(int x, int y){
    	int total = x * y;
    	System.out.println(x + " * " + y + " = " + total);
    }
    public void divided(int x, int y){
    	int total = x / y;
    	System.out.println(x + " / " + y + " = " + total);
    }
}

//宣告程式主要類別並繼承於Accounting
public class CH08_02 extends Accounting{
    //加入自訂類別方法
    public void minus(int x, int y){
        int total = x - y;
        System.out.println(x + " - " + y + " = " + total);
    }
    //主程式
    public static void main(String[] args){
        //實作主程式類別物件
        CH08_02 myObject = new CH08_02();
        //呼叫繼承Accounting類別的成員方法
        myObject.plus(100, 30);
        myObject.times(100, 30);
        myObject.divided(100, 30);
        //呼叫自訂的成員方法
        myObject.minus(100, 30);
    }
}