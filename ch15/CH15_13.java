/*程式：CH15_13 DataOutputSream應用*/
//載入IO套件
import java.io.*;
public class CH15_13{
    //設定資料成員
    private static String firstName[] = {"Alex", "Bob", "Celtic"};
    private static String lastName[] = {"Lee", "Lu", "Wang"};
    //主程式區塊
    public static void main(String args[]) throws IOException{
        //建立DataOutputStream物件
        DataOutputStream myOut = new DataOutputStream(new 
                                 FileOutputStream("Customer.txt"));
        //自定格式化寫出動作
        for(int i = 0; i < firstName.length; i++){
            myOut.writeChars(firstName[i]);
            myOut.writeChar('\t');
            myOut.writeChars(lastName[i]);
            myOut.writeChars("\n");
        }
        //關閉檔案
        myOut.close();
    }
}