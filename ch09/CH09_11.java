/*檔案:CH09_11.java 
 *說明:內部匿名類別實作應用*/

//主程式類別
public class CH09_11{
    //外部類別建構子
    public CH09_11(){
        System.out.println("實作外部類別建構子敘述成功!!");
    }
    //宣告內部類別
    class MyInnerClass{
    //內部類別建構子
        public MyInnerClass(){
            System.out.println("  實作內部類別建構子敘述成功!!");
        }
        public void show(){
            System.out.println("    呼叫內部類別show()方法成功!!");
        }
    }
	//定義內部匿名類別
    public MyInnerClass MyInnerClass(){
        //傳回內部匿名類別建構方法
        return new MyInnerClass(){
            //重載內部類別成員方法
            public void show(){
                System.out.println("    呼叫內部匿名類別show()方法成功!!");
            }
        };
    }
    //主程式區塊
    public static void main(String args[]){
        //實作主類別物件
        CH09_11 myObject = new CH09_11();
        //實作內部匿名類別物件
        MyInnerClass myAnonymous = myObject.MyInnerClass();
        //呼叫內部匿名類別重載方法
        myAnonymous.show();
    }
}