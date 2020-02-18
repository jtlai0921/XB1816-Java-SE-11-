//利用URL讀取檔案內容
import java.net.*;
import java.io.*;
public class WORK18_02{
    public static void main(String[] args){
    //捕捉例外
    try{
        //建立一個URL物件
        URL url=new URL("https://www.hinet.net/");
        BufferedReader in= new BufferedReader(new InputStreamReader(url.openStream()));

        String str;
        //將讀取資料印出
        while((str=in.readLine())!=null)
            System.out.println(str);
        //例外處理
        }catch(MalformedURLException e){
            System.out.println("URL位址錯誤。");
        }catch(IOException e){
            System.out.println("資料讀取錯誤錯誤。");
        }
    }
}