/*程式：CH15_07 BufferedWriter應用*/
//載入IO套件
import java.io.*;
public class CH15_07{
    //宣告相關變數
    private static char[] myChar = {'H','e','l','l','o','!','!'};
    private static String myStr = "What a wonderful day it is !!"; 
    public static void main(String args[]) throws IOException{
        new File("Test.txt");
        //檔案寫入資料流
        FileWriter myFileWriter = new FileWriter("Test.txt");
        //建立寫入暫存區
        BufferedWriter myBuffer = new BufferedWriter(myFileWriter);
        //實作寫入動作
        myBuffer.write("ACSII碼120的相對字元為  ");
        myBuffer.write(120);
        myBuffer.newLine();
        myBuffer.write("下面的文字是由字元陣列與字串所組成\r\n");
        myBuffer.write(myChar);
        myBuffer.write(myStr);
        //關閉資料流物件
        myBuffer.close();
        myFileWriter.close();
    }
}