/*�{���GCH15_13 DataOutputSream����*/
//���JIO�M��
import java.io.*;
public class CH15_13{
    //�]�w��Ʀ���
    private static String firstName[] = {"Alex", "Bob", "Celtic"};
    private static String lastName[] = {"Lee", "Lu", "Wang"};
    //�D�{���϶�
    public static void main(String args[]) throws IOException{
        //�إ�DataOutputStream����
        DataOutputStream myOut = new DataOutputStream(new 
                                 FileOutputStream("Customer.txt"));
        //�۩w�榡�Ƽg�X�ʧ@
        for(int i = 0; i < firstName.length; i++){
            myOut.writeChars(firstName[i]);
            myOut.writeChar('\t');
            myOut.writeChars(lastName[i]);
            myOut.writeChars("\n");
        }
        //�����ɮ�
        myOut.close();
    }
}