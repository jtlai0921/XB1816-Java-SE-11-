/*�ɮ�:CH15_21
 *����:Ū���w�ľ����O�]BufferedReader�^�ϥΤ�k 
 */

import java.io.*;
class CH15_21{
    public static void main(String[] args) throws IOException {
        String str="BufferedReader !!";
        char[] c=new char[str.length()];
        str.getChars(0,str.length(),c,0);
        CharArrayReader b=new CharArrayReader(c);
        BufferedReader buf=new BufferedReader(b);
        int x;
        while((x=buf.read())!=-1){
        System.out.print((char)x); 
        }
    }
}