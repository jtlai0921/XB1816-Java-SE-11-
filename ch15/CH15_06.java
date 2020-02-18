/*程式：CH15_06 BufferedReader應用*/
//載入IO套件
import java.io.*;
public class CH15_06{
    private static String myStr;
    public static void main(String args[])throws IOException{
        //建立BufferedReader物件並加以實作
        BufferedReader myReader;
        myReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入文字：  ");
        //將暫存區中資料轉存至變數之中
        myStr = myReader.readLine();
        System.out.println("您所輸入的文字為： " + myStr);
    }
}