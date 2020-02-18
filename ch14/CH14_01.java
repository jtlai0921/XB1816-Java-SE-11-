/*程式:CH14_01.java
 *說明:例外處理的實作
 **/
import java.io.*;

public class CH14_01{
    public static void main(String[] args) throws IOException{
        try{
            int i;
            BufferedReader buf;
            buf = new BufferedReader(new InputStreamReader(System.in));
			
            System.out.print("請輸入整數 i : ");
            i = Integer.parseInt(buf.readLine());//將讀取的資料轉成int型別
			
            System.out.println("i = "+ i);
		
        }
        //例外處理的第一個catch區塊
        catch(NumberFormatException nfe){
            System.out.println("catch NumberFormatException...");
            System.out.println(nfe.toString());//輸出NumberFormatException的訊息
		
        }
        //例外處理的第二個catch區塊
        catch(Exception e){
            System.out.println("catch Exception...");
            System.out.println(e.toString());//輸出Exception的訊息
		
        }	
    }
}