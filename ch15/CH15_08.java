/*�ɮ�:CH15_08
 *����:FileOutputStream�ϥΤ�k
 */

import java.io.*;
class CH15_08{
    public static void main(String[] args) throws IOException {
        byte[] fb="FileOutputStream".getBytes();
        FileOutputStream f=new FileOutputStream("test2.txt");
        for(int i=0;i<fb.length;i++){
            f.write(fb[i]);
        }
        f.close();
    }
}