/*程式：CH15_03 基本輸入範例*/
//載入IO套件
import java.io.*;
public class CH15_03{
    public static void main(String args[])throws IOException{
        //宣告變數
        int ASCIIcode;
        char myChar;
        System.out.println("[鍵盤按鍵ASCII碼轉換程式]");
        System.out.print("請輸入欲轉換的按鈕：  ");
        ASCIIcode = System.in.read();
        myChar = (char)ASCIIcode;
        if(ASCIIcode == 13)
            System.out.println("鍵盤 Enter 鍵的ASCII值為 " + ASCIIcode);
        else
            System.out.println("鍵盤 " + myChar + "鍵的ASCII值為 " + ASCIIcode);
    }
}