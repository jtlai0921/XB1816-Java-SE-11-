//說明:FileInputStream使用
import java.io.*;
public class WORK15_01
{
    private static String myPath, myFileData;
    public static void main(String args[]) throws IOException 
    {       
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("檔案名稱：");
        myPath = buf.readLine();
        System.out.println("\n檔案資料內容如下\n");
        //實作FileInputStream物件
        FileInputStream myFileIS = new FileInputStream(myPath);
        int myDataSize = myFileIS.available();
        byte[] myData = new byte[myDataSize];
        myFileIS.read(myData);
        myFileData = new String (myData, 0, myDataSize);
        //顯示資料
        System.out.println(myFileData);
        myFileIS.close();
    }
}