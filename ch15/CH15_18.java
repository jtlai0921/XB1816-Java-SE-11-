/*程式：二進位元檔案複製指令實作*/
//載入IO套件
import java.io.*;
public class CH15_18{
    private static byte[] myData;
    //主程式區塊
    public static void main(String args[])throws IOException{
        //建立FileInputStream物件
        FileInputStream myInput = new FileInputStream(args[0]);
        //暫存檔案資料
        int dataSize = myInput.available();
        myData = new byte[dataSize];
        myInput.read(myData);
        //建立FileOutputStream物件
        FileOutputStream myOutput = new FileOutputStream(args[1]);
        //寫入檔案
        myOutput.write(myData);
        //關閉資料流物件
        myInput.close();
        myOutput.close();
        System.out.println("來源檔案： " + args[0] + 
		           " 成功複製為目的檔案： " + args[1]);
    }
}