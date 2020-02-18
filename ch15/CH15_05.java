/*程式：CH15_05 StringReader/Writer應用*/
//載入IO套件
import java.io.*;
public class CH15_05{
    //建立成員資料
    private static String inputStr = "Test String";
    private static char[] inputChar = {'T','e','s','t',' ','C','h','a','r','A','r','r','a','y'};
    public static void main(String args[]) throws IOException{
        //建立Writer物件
        StringWriter myWriter = new StringWriter();
        //將字串與字元陣列成員寫入緩衝區中
        myWriter.write(inputStr);
        myWriter.write(" & ");
        myWriter.write(inputChar);
        //將緩衝區內容輸出轉存至myStr變數
        String myStr = myWriter.toString();
        System.out.println("底下是由StringWriter所寫入的字串內容：");
        System.out.println(myStr);
        //參照myStr變數建立兩個Reader物件
        StringReader readerCounter = new StringReader(myStr);
        StringReader myReader = new StringReader(myStr);
        System.out.println("\n底下是由StringReader所讀取的字串內容：");
        //讀取並依序輸出字串內容值
        while(readerCounter.read() != -1){
            System.out.print((char)(myReader.read()));
        }
        System.out.println("\n");
    }
}