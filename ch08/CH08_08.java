/*檔案:CH08_08.java 
 *說明:基礎類別建構子繼承關係*/
//繼承於SuperClass的程式主要類別
public class CH08_08 extends SuperClass{
    //主程式區塊
    public static void main(String args[]){
        //建立主程式物件
        CH08_08 myObject = new CH08_08();
        //呼叫基礎類別建構子
        myObject.SuperClass();
    }
}

//宣告基礎類別
class SuperClass{
     public SuperClass(){
    System.out.println("這是由基礎類別SuperClass建構子" + 
		       "所輸出的字串");
    }
}