/*檔案:CH09_08.java 
 *說明:建立套件*/

//封裝套件
package test.mypackage;
//匯入IO套件
import java.io.*;
//宣告類別
public class CH09_08{
    //宣告類別成員資料
    String myStr;
    //宣告成員方法
    public String input()throws IOException{
        BufferedReader myBuf;
        myBuf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入一個字串： ");
        myStr = myBuf.readLine();
        return myStr;
    }
}