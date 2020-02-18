/*程式：CH15_04 CharArrayReader/Writer應用*/
//載入IO套件
import java.io.*;
public class CH15_04{
    //建立成員資料
    private static String inputStr = "Test String";
    private static char[] inputChar = {'T','e','s','t',' ','C','h','a','r','A','r','r','a','y'};
    public static void main(String args[]) throws IOException{
        //建立Writer物件
        CharArrayWriter myWriter = new CharArrayWriter();
        //將字串與字元陣列成員寫入緩衝區中
        myWriter.write(inputStr);
        myWriter.write(" & ");
        myWriter.write(inputChar);
        //將緩衝區內容輸出轉存至myChar變數
        char[] myChar = myWriter.toCharArray();
        System.out.println("底下是由CharArrayWriter所寫入的字元陣列內容：");
        System.out.println(myChar);
        //參照myChar變數建立兩個Reader物件
        CharArrayReader readerCounter = new CharArrayReader(myChar);
        CharArrayReader myReader = new CharArrayReader(myChar);
        System.out.println("\n底下是由CharArrayReader所讀取的字元陣列內容：");
        //讀取並依序輸出字元陣列內容值
        while(readerCounter.read() != -1){
            System.out.print((char)(myReader.read()));
        }
        System.out.println("\n");
    }
}