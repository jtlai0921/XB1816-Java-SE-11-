//�{���GCH16_04.java
//�Q�ΰ}�C���X�[�J���P��ƫ��A
import java.util.*;
public class CH16_04{
    public static void main(String[] args){
        //�ŧi�ܼ�
        ArrayList<String> alArray =new ArrayList<String> ();		
    
        //�s�W��Ʀܰ}�C���X
        alArray.add("����");
        alArray.add("���R");
        alArray.add("�H�q");
        alArray.add("�M��");
		
        //�}�C���X��k������
        System.out.print("�ˬdalArray���X�����L���w����G");
        System.out.println(alArray.contains("���R"));
        for(int i=0;i<alArray.size();i++){
            System.out.print("alArray���X�����ޭ� "+i+" ������Ȭ��G");
            System.out.println(alArray.get(i));
        }
    }
}