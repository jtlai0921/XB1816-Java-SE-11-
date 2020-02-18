/*檔案:CH09_10.java 
 *說明:靜態巢狀類別實作應用*/

//主程式類別
public class CH09_10{
    //主類別建構子
    public CH09_10(){
        System.out.println("主類別建構子敘述");
    }
    //宣告靜態巢狀類別
    static class InnerClass{
        public InnerClass(){
        System.out.println("靜態巢狀類別建構子敘述");
    }
}
    //主程式區塊
    public static void main(String args[]){
        new CH09_10();
        new InnerClass();
    }
}