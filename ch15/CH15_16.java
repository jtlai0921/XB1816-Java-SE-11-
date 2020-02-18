/*程式：檔名過濾器實作*/
//載入IO套件
import java.io.*;
public class CH15_16 implements FilenameFilter{
    private String myFilename;
    //類別建構子
    public CH15_16(String myStr){
        this.myFilename = myStr;
    }
    //重載介面的accept方法
    public boolean accept(File dir, String filename){
        boolean isMatch = true;
        if(myFilename != null)
            isMatch &= filename.startsWith(myFilename);
        return isMatch;
    }
    //主程式區塊
    public static void main(String args[]){
        //利用主程式區塊參數建立File物件
        File myFile = new File(args[0]);
        //建立主類別物件
        CH15_16 myObject = new CH15_16(args[1]);
        System.out.println("在目標路徑： " + args[0] + " 內搜尋符合 " + 
		            args[1] + "關鍵字的檔案\n");
        System.out.println("搜尋結果如下所示：");
        //列出檔案清單
        String fileList[] = myFile.list(myObject);
        for(int i = 0; i < fileList.length; i++)
            System.out.println(fileList[i]);
    }
}
