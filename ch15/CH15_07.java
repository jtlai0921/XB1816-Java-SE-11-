/*�{���GCH15_07 BufferedWriter����*/
//���JIO�M��
import java.io.*;
public class CH15_07{
    //�ŧi�����ܼ�
    private static char[] myChar = {'H','e','l','l','o','!','!'};
    private static String myStr = "What a wonderful day it is !!"; 
    public static void main(String args[]) throws IOException{
        new File("Test.txt");
        //�ɮ׼g�J��Ƭy
        FileWriter myFileWriter = new FileWriter("Test.txt");
        //�إ߼g�J�Ȧs��
        BufferedWriter myBuffer = new BufferedWriter(myFileWriter);
        //��@�g�J�ʧ@
        myBuffer.write("ACSII�X120���۹�r����  ");
        myBuffer.write(120);
        myBuffer.newLine();
        myBuffer.write("�U������r�O�Ѧr���}�C�P�r��Ҳզ�\r\n");
        myBuffer.write(myChar);
        myBuffer.write(myStr);
        //������Ƭy����
        myBuffer.close();
        myFileWriter.close();
    }
}