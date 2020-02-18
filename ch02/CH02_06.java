//程式:CH02_06.java, 基本輸出
public class CH02_06 {
    public static void main(String args[]) { //宣告變數
        String myStringA = "第一個字串";
        String myStringB = "第二個字串";
        String myStringC = "會串聯在一起";
        int myIntA = 3;
        boolean myBoolean = true;
        //螢幕輸出
        System.out.print("[JAVA基本輸出練習]\n");
        System.out.println("「真」的英文是" + myBoolean);
        System.out.println(myStringA + myStringB);
        System.out.println(myStringC);
        System.out.println("1 + 2 = " + myIntA);
        System.out.println("5 - 3 = " + (5 - myIntA));
    } 
}