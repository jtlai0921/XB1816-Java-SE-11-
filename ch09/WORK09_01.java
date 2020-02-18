//抽象類別
abstract class autoMobile
{ 
    //抽象方法
    abstract public void setData();
    abstract public void showData();
}
//衍生類別
class BENZ_Serial extends autoMobile
{ 
    //成員資料
    private int carLength, engCC, maxSpeed;
    //建構子
    public BENZ_Serial(String modelName)
    {
        System.out.println("BENZ系列："+ modelName +"基本資料");
    }
    //重新定義抽象方法
    public void setData()
    {
        carLength = 400;
        engCC = 3200;
        maxSpeed = 280;
    }
    public void showData()
    {
        System.out.println("車身長度：" + carLength);
        System.out.println("汽缸CC數：" + engCC);
        System.out.println("最高車速：" + maxSpeed);
    }
}
//主要類別
public class WORK09_01
{
    public static void main(String args[])
    { 
        //實作抽象類別物件
        autoMobile myCar = null;
        //實作衍生類別物件
        BENZ_Serial SLK2000 = new BENZ_Serial("SLK2000");
        //實作多形
        myCar = SLK2000;
        myCar.setData();
        myCar.showData();
    }
}