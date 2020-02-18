/*檔案:CH15_20
 *說明:緩衝器輸出資料流類別（BufferedOutputStream） 使用方法
 */

import java.io.*;
class CH15_20{
    public static void main(String[] args) throws IOException {
        FileOutputStream fw=new FileOutputStream("D:BufferedOutputStream.txt");
        BufferedOutputStream buf=new BufferedOutputStream(fw);
        String str="BufferedOutputStream !!";
        char[] c=new char[str.length()];
        str.getChars(0,str.length(),c,0);
        for(int i=0;i<str.length();i++){
            buf.write(c[i]);
        }
        buf.flush();
        fw.close();
    }
}