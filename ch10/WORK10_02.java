//�Q�ΰ}�C���X�[�J���P��ƫ��A
import java.util.*;
public class WORK10_02{
    public static void main(String[] args){
        //�ŧi�ܼ�
        int intVal=2019;
        String strVal1=new String("Happy");
        String strVal2=new String("New");
        String strVal3=new String("Year");
        double doubleVal=99999;
        ArrayList<Comparable> multipleType=new ArrayList<Comparable>();
		
        //�s�W��Ʀr�}�C���X
        multipleType.add(intVal);
        multipleType.add(strVal1);
        multipleType.add(strVal2);
        multipleType.add(strVal3);
        multipleType.add(doubleVal);
		
        //�}�C���X��k������
        System.out.print("�ˬdmultipleType���X�����LdoubleVal����G");
        System.out.println(multipleType.contains(doubleVal));
        for(int i=0;i<multipleType.size();i++){
            System.out.print("multipleType���X�����ޭ� "+i+" ������Ȭ��G");
            System.out.println(multipleType.get(i));
        }
    }
}