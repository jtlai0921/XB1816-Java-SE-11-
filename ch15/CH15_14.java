/*�{���GFile���O�ɮ׺޲z��k����*/
//���JIO�M��
import java.io.*;
public class CH15_14{
    //�D�{���϶�
    public static void main(String args[]) throws IOException{
        //�إ�File����
        File myFile = new File("Test.txt");
        File myRename = new File("Test.doc");
        //�s�W�ɮ�
        if(myFile.createNewFile() == true)
            System.out.println("�ɮ�Test.txt���\�إ�");
        else
            System.out.println("�ɮ�Test.txt�s�W����");
        //�ܧ��ɮצW��
        if(myFile.renameTo(myRename) == true)
            System.out.println("�ɮ�Test.txt���\��W��Test.doc");
        else
            System.out.println("�ɮ�Test.txt��W����");
        //�R���ɮ�
        if(myRename.delete() == true)
            System.out.println("�ɮ�Test.doc�R�����\");
        else
            System.out.println("�ɮ�Test.doc�R������");
    }
}