/*�{���G��r�ɮ׽ƻs���O��@*/
//���JIO�M��
import java.io.*;
public class CH15_17{
    private static String myData;
    //�D�{���϶�
    public static void main(String args[])throws IOException{
        //�إ��ɮ�Ū������
        FileReader myReader = new FileReader(args[0]);
        BufferedReader myBuf = new BufferedReader(myReader);
        //�إ��ɮ׼g�J����
        FileWriter myWriter = new FileWriter(args[1]);
        //����g�J�ʧ@
        while((myData = myBuf.readLine()) != null){
            myWriter.write(myData + "\r\n");
        }
        //������Ƭy����
        myReader.close();
        myWriter.close();
        System.out.println("�ӷ��ɮסG " + args[0] + 
		           " ���\�ƻs���ت��ɮסG " + args[1]);
    }
}