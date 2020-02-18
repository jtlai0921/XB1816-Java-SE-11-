/*檔案:CH15_11
 *說明:讀取字元陣列類別（CharArrayReader）使用方法
 */

import java.io.*;
class CH15_11{
    public static void main(String[] args) throws IOException {
        String x="CharArrayReader test!!";
        char[] c=new char[x.length()];
        x.getChars(0,x.length(),c,0);  //將字串存入緩衝器中
        int a;
        CharArrayReader ch=new CharArrayReader(c);
        while((a=ch.read())!=-1){
            System.out.print((char)a); 
        }
    }
}