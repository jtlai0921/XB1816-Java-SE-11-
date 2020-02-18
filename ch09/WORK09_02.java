//說明:介面實作
//宣告介面一

interface autoMobile_setData
{ 
    //成員方法
    void setData();
}
//宣告介面二
interface autoMobile_showData
{ 
    //成員方法
    void showData();
}

//介面實作類別
class WORK09_02 implements autoMobile_setData, autoMobile_showData
{ 
    //成員資料
    int carLength, engCC, maxSpeed;
    //建構子
    public WORK09_02(String modelName)
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
    //主程式區塊
    public static void main(String args[])
    {
        WORK09_02 SLK2000 = new WORK09_02("SLK2000");
        SLK2000.setData();
        SLK2000.showData();
    }
}