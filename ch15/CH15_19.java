/*檔案:CH15_19
 *說明:緩衝器輸入資料流類別（BufferedInputStream） 使用方法 
 */

import java.io.*;
class CH15_19{
    public static void main(String[] args) throws IOException {
        byte[] c="BufferedInputStream !!".getBytes();
        ByteArrayInputStream b=new ByteArrayInputStream(c);
        BufferedInputStream buf=new BufferedInputStream(b);
        int x;
        while((x=buf.read())!=-1){
            System.out.print((char)x); 
        }
    }
}
