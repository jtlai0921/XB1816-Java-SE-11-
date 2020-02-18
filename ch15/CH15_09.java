/*檔案:CH15_09
 *說明:ByteArrayOutputStream使用方法
 */

import java.io.*;

class CH15_09{
    public static void main(String[] args) throws IOException {
        byte[] fb="ByteArrayOutputStream".getBytes();
        ByteArrayOutputStream f=new ByteArrayOutputStream();
        f.write(fb);
        FileOutputStream f1=new FileOutputStream("test3.txt");
        f.writeTo(f1);
        f.close();
    }
}