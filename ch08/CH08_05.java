/*檔案:CH08_05.java 
 *說明:呼叫外部類別protected成員範例*/
//宣告主程式類別並向上繼承於外部類別SetString
public class CH08_05 extends SetString{
    //宣告主類別的成員方法
    public void resetData(){
    /*利用「類別名稱.成員資料」格式，
     *重新定義外部類別的protected成員資料*/
    SetString.protectedString = "由主程式CH08_05中重新定義的" + 
		                "protected成員資料";
    }
    //主程式
    public static void main(String[] args){
        //建立主類別物件
        CH08_05 myObject = new CH08_05();
        //呼叫自訂的成員方法
        myObject.resetData();
        //呼叫繼承的protected成員方法
        SetString.protectedData();
    }
}