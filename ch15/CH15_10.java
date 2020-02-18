/*檔案:CH15_10
 *說明:讀取檔案類別（FileReader）使用方法
 */

import java.io.*;
class CH15_10{
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("FileReader.txt");  //建立FileReader物件
        BufferedReader bf=new BufferedReader(f);  //讀入緩衝器中
        String x;
        while((x=bf.readLine())!=null){
            System.out.println(x);  //開始讀取內容字元
        }
        f.close();
    }
}