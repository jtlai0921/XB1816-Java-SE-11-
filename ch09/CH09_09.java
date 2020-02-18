/*檔案:CH09_09.java 
 *說明:內部類別實作應用*/

//主程式類別
public class CH09_09{
    //主類別建構子
    public CH09_09(){
        System.out.println("主類別建構子敘述");
    }
    //宣告內部類別
    class InnerClass{
        public InnerClass(){
        System.out.println("內部類別建構子敘述");
    }
}
    //主類別成員方法
    public InnerClass ImplementInnerClass(){
        return new InnerClass();
    }
    //主程式區塊
    public static void main(String args[]){
        //實作主類別物件
        CH09_09 myObject = new CH09_09();
        myObject.ImplementInnerClass();
    }
}