/*程式CH14_03.java
 *說明:throw的實作
 **/
import java.io.*;

public class CH14_03{
    public static void main(String[] args) throws IOException{
        try{
            int month;
            BufferedReader buf;
            buf = new BufferedReader(new InputStreamReader(System.in));			
			
            System.out.print("請輸入月份 : ");
            month = Integer.parseInt(buf.readLine());			

            if(month<0 | month>12)
                throw new ArithmeticException("沒有這個月份喔!!!");
                System.out.println("您輸入的月份為 = "+ month+ "月份");				
            }
            catch(ArithmeticException ae){
                System.out.println("catch ArithmeticException...");
                System.out.println(ae.toString());
            }

	}
}