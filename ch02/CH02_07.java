//程式:CH02_07.java, 基本輸入
import java.io.*;
public class CH02_07 {
    private static char myData;
    public static void main(String args[]) throws IOException {
        System.out.print("[基本輸入練習]\n");
        System.out.print("請輸入文字：");
        //文字輸入
        myData = (char)System.in.read();
		System.out.println("輸入的資料為：" + myData);
    } 
}