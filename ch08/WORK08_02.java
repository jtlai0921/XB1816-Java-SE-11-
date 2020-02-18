//繼承的應用
class Ball   // Ball類別宣告
{  
    // 成員資料
    private int number; //球的號碼
    private String color; // 顏色
    // 設定球的號碼
    public void setNumber(int num) { number=num; }
    // 設定色彩
    public void setColor(String color) { this.color=color; }
    // 成員方法: 顯示球的資料
    public void showBall()
    {  // 印出資料
        System.out.println("球的編號: " + number);
        System.out.println("球的色彩: " + color);
    }
}
class Baseball extends Ball  // Baseball類別宣告
{  
    // 成員資料
    private int price;  // 價格
    // 建構子
    public Baseball(int num, String color, int price)
    {  // 呼叫父類別的成員方法
        setNumber(num);
        setColor(color);
        this.price = price;
    }
    // 顯示球的資料
    public void showBaseball()
    {  // 顯示棒球資料
        System.out.println("====棒球的基本資料====");
        showBall();      // 呼叫父類別的成員方法
        System.out.println("球的價格: " + price);
    }
}
// 主程式類別
public class WORK08_02
{   
    // 主程式
    public static void main(String[] args)
    {   
        // 宣告Baseball類別型態的變數及建立物件
        Baseball playboy = new Baseball(1002, "藍色", 500);
        Baseball nike= new Baseball(2003, "黃色", 650);
        playboy.setColor("黑色"); 
        playboy.showBaseball();    
        nike.showBaseball();
    }
}