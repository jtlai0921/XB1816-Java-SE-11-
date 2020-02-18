/*檔案:CH08_12.java 
 *說明:super關鍵字的應用*/
//主要類別
public class CH08_12 extends SuperClass{
    //衍生類別重載的showData方法
    public void showData(){
        System.out.println("由衍生類別重載showData()成員方法輸出的字串!!");
    }
    //衍生類別自訂方法
    public void doSuper(){
        //利用super呼叫基礎類別的showData()成員方法
        super.showData();
    }
    //主程式區塊
    public static void main(String args[]){
        //建立主程式物件
        CH08_12 myObject = new CH08_12();
        //呼叫重載的showData()方法
        myObject.showData();
        //呼叫自訂的doSuper()方法
        myObject.doSuper();
    }
}

//宣告基礎類別
class SuperClass{
    //宣告基礎類別成員方法
    public void showData(){
        System.out.println("由基礎類別showData()成員方法輸出的字串!!");
    }
}