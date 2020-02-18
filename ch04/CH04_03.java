/* 類別變數的宣告實例  */
public class CH04_03 {
    // 宣告類別變數
    static int value=0;
    // 宣告類別方法
    static void add100() { value=value+100; }
    // 主程式
    public static void main(String[] args) {
        System.out.println("目前的值= "+ value);
        add100();
        System.out.println("目前的值= "+ value);
        add100();
        System.out.println("目前的值= "+ value);
    }
}