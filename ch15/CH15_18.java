/*�{���G�G�i�줸�ɮ׽ƻs���O��@*/
//���JIO�M��
import java.io.*;
public class CH15_18{
    private static byte[] myData;
    //�D�{���϶�
    public static void main(String args[])throws IOException{
        //�إ�FileInputStream����
        FileInputStream myInput = new FileInputStream(args[0]);
        //�Ȧs�ɮ׸��
        int dataSize = myInput.available();
        myData = new byte[dataSize];
        myInput.read(myData);
        //�إ�FileOutputStream����
        FileOutputStream myOutput = new FileOutputStream(args[1]);
        //�g�J�ɮ�
        myOutput.write(myData);
        //������Ƭy����
        myInput.close();
        myOutput.close();
        System.out.println("�ӷ��ɮסG " + args[0] + 
		           " ���\�ƻs���ت��ɮסG " + args[1]);
    }
}