/*�ɮ�:CH15_11
 *����:Ū���r���}�C���O�]CharArrayReader�^�ϥΤ�k
 */

import java.io.*;
class CH15_11{
    public static void main(String[] args) throws IOException {
        String x="CharArrayReader test!!";
        char[] c=new char[x.length()];
        x.getChars(0,x.length(),c,0);  //�N�r��s�J�w�ľ���
        int a;
        CharArrayReader ch=new CharArrayReader(c);
        while((a=ch.read())!=-1){
            System.out.print((char)a); 
        }
    }
}