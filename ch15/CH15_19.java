/*�ɮ�:CH15_19
 *����:�w�ľ���J��Ƭy���O�]BufferedInputStream�^ �ϥΤ�k 
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
