/*檔案:CH06_04.java
 *說明:字串類別的搜尋方法
 */
import java.io.*; 
public class CH06_04{	 	
    public static void main(String[] args)throws Exception{
        String str1="Time and Tide wait for no man.";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//定義從鍵盤輸入輸入
        System.out.println("str1:"+str1);
        String s1;
        System.out.print("請輸入要搜尋的字串:");
        s1=br.readLine();//從鍵盤輸入字串
        int index=0;	 		
        int len=str1.length();
        for(int i=1; i<len;i++){
            index =str1.indexOf(s1,index);
        }
        System.out.println("在"+index+"位置找到搜尋的字串");			
    } 
}