//說明:finally區塊使用
import java.io.*;
public class WORK14_01
{
    static int count = 1;
    static int sum = 0;
    public static void main(String args[]) throws IOException
    {
        //無限迴圈
        while(true)
        {
            int value;
            //try區塊
            try
            {
                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("請輸入第"+count+"個數字：");
                value = Integer.parseInt(buf.readLine());
                sum = sum + value;
                System.out.println("目前的總數為："+ sum);
                ++count;
            }
            //catch區塊
            catch(NumberFormatException Object)
            {
                System.out.println("請輸入整數型態數值格式，否則無法進行計算");
            }
            //finally區塊
            finally
            {
                //迴圈中斷判斷
                if (count > 5)
                {
                    System.out.println("已連續累加5個數字，程式正常結束");
                    break;
                }
            }
        }
    }
}