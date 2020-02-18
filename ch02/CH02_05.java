// CH02_05.java, 變數與常數宣告
public class CH02_05 {  //宣告常數C(光速) 
    final static double C = 2997924581.2;
    public static void main(String args[]) {
        //宣告變數e與m
        int m;
        double e;
        //賦予變數值
        m = 10;
        e = m * C * C;
        //輸出於螢幕      
        System.out.println("當質量為：" + m);
        System.out.println("所釋放出的能量為：" + e);
    }
}