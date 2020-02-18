/*程式：File類別檔案管理方法應用*/
//載入IO套件
import java.io.*;
public class CH15_14{
    //主程式區塊
    public static void main(String args[]) throws IOException{
        //建立File物件
        File myFile = new File("Test.txt");
        File myRename = new File("Test.doc");
        //新增檔案
        if(myFile.createNewFile() == true)
            System.out.println("檔案Test.txt成功建立");
        else
            System.out.println("檔案Test.txt新增失敗");
        //變更檔案名稱
        if(myFile.renameTo(myRename) == true)
            System.out.println("檔案Test.txt成功更名為Test.doc");
        else
            System.out.println("檔案Test.txt更名失敗");
        //刪除檔案
        if(myRename.delete() == true)
            System.out.println("檔案Test.doc刪除成功");
        else
            System.out.println("檔案Test.doc刪除失敗");
    }
}