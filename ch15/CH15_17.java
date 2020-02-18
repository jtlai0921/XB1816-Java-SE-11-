/*程式：文字檔案複製指令實作*/
//載入IO套件
import java.io.*;
public class CH15_17{
    private static String myData;
    //主程式區塊
    public static void main(String args[])throws IOException{
        //建立檔案讀取物件
        FileReader myReader = new FileReader(args[0]);
        BufferedReader myBuf = new BufferedReader(myReader);
        //建立檔案寫入物件
        FileWriter myWriter = new FileWriter(args[1]);
        //執行寫入動作
        while((myData = myBuf.readLine()) != null){
            myWriter.write(myData + "\r\n");
        }
        //關閉資料流物件
        myReader.close();
        myWriter.close();
        System.out.println("來源檔案： " + args[0] + 
		           " 成功複製為目的檔案： " + args[1]);
    }
}