/*檔案:CH08_10.java 
 *說明:衍生類別成員的多載*/
//主要類別
public class CH08_10 extends SuperClass{
    //多載基礎類別totalAverage方法
    public void totalAverage(int x, int y, int z){
        int total = (x + y + z) / 3;
        System.out.println("這是由衍生類別多載的totalAverage()方法");
        System.out.println(x + " + " + y + " + " + z + " / 3 = " + total + "\n");
    }
	//主程式區塊
    public static void main(String args[]){
        //建立主程式物件
        CH08_10 myObject = new CH08_10();
        //呼叫繼承於基礎類別的totalAverage方法
        myObject.totalAverage(64, 48);
        //呼叫衍生類別多載的totalAverage方法
        myObject.totalAverage(32, 24, 58);
    }
}

//宣告基礎類別
class SuperClass{
    //宣告成員方法totalAverage
    public void totalAverage(int x, int y){
        int total = (x + y) / 2;
        System.out.println("這是繼承於基礎類別的totalAverage()方法");
        System.out.println(x + " + " + y + " / 2 = " + total + "\n");
    }
}