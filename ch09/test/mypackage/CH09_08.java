/*�ɮ�:CH09_08.java 
 *����:�إ߮M��*/

//�ʸˮM��
package test.mypackage;
//�פJIO�M��
import java.io.*;
//�ŧi���O
public class CH09_08{
    //�ŧi���O�������
    String myStr;
    //�ŧi������k
    public String input()throws IOException{
        BufferedReader myBuf;
        myBuf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("�п�J�@�Ӧr��G ");
        myStr = myBuf.readLine();
        return myStr;
    }
}