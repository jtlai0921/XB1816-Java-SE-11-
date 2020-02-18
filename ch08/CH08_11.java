/*檔案:CH08_11.java 
 *說明:衍生類別成員的重載*/
//主要類別
public class CH08_11 extends SuperClass{
    //多載基礎類別Accounting方法
    public void Accounting(int x, int y, int z){
        int total = x + y + z;
        System.out.println("這是由衍生類別多載的Accounting()方法");
        System.out.println(x + " + " + y + " + " + z + " = " + total + "\n");
    }
    //重載基礎類別Accounting方法
    public void Accounting(int x, int y){
        int total = x * y;
        System.out.println("這是由衍生類別重載的Accounting()方法");
        System.out.println(x + " * " + y + " = " + total + "\n");
    }
    //主程式區塊
    public static void main(String args[]){
        //建立主程式物件
        CH08_11 myObject = new CH08_11();
        //呼叫衍生類別多載的Accounting()方法
        myObject.Accounting(12, 36, 60);
        //呼叫衍生類別重載的Accounting()方法
        myObject.Accounting(7, 5);
    }
}

//宣告基礎類別
class SuperClass{
    //宣告成員方法Accounting
    public void Accounting(int x, int y){
        int total = x + y;
    }
}