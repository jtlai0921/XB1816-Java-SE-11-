/*檔案:CH15_22
 *說明:寫入緩衝器類別（BufferedWriter）使用方法
 */

import java.io.*;
class CH15_22{
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:BufferedWriter.txt");
        BufferedWriter buf=new BufferedWriter(fw);
        String str="BufferedWriter !!";
        char[] c=new char[str.length()];
        str.getChars(0,str.length(),c,0);
        for(int i=0;i<str.length();i++){
            buf.write(c[i]);
        }
            buf.flush();
            fw.close(); 
    }
}