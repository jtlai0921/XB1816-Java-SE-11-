/*檔案:CH08_09.java 
 *說明:衍生類別物件與基礎類別建構子繼承關係*/
//繼承於SuperClass的程式主要類別
public class CH08_09 extends SuperClass{
    //衍生類別建構子
    public CH08_09(){
        System.out.println("這是由衍生類別建構子所輸出的字串");
    }
    //主程式區塊
    public static void main(String args[]){
        new CH08_09();
    }
}

//宣告基礎類別
class SuperClass{
    public SuperClass(){
        System.out.println("這是由基礎類別SuperClass建構子" + 
		           "所輸出的字串");
    }
}