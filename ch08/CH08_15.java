/*檔案:CH08_15.java 
 *說明:物件的多形*/
//基礎類別RemoteControl
class RemoteControl{
    //類別建構子
    RemoteControl(){
        System.out.print("使用萬能遙控器：");
    }
    //成員方法powerOn()
    public void powerOn(){};
}

//衍生類別MyTV
class MyTV extends RemoteControl{
    //重新定義基礎類別的powerOn()方法
    public void powerOn(){
        System.out.println("開啟電視機...");
        System.out.println("電視機開啟成功!!\n");
    }
}

//衍生類別MyAirCon
class MyAirCon extends RemoteControl{
    //重新定義基礎類別的powerOn()方法
    public void powerOn(){
        System.out.println("開啟冷氣機...");
        System.out.println("冷氣機開啟成功!!\n");
    }
}

//主要類別
public class CH08_15{
    //主程式區塊
    public static void main(String args[]){
        //建立基礎類別物件
        RemoteControl myControl;
        //轉型為MyTV物件
        myControl = new MyTV();
        //呼叫重新定義的powerOn()方法
        myControl.powerOn();
        //轉型為MyAirCon物件
        myControl = new MyAirCon();
        //呼叫重新定義的powerOn()方法
        myControl.powerOn();
    }
}