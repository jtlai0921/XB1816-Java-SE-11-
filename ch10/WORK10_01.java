//�H�h���}�C��@�üƲ��;�
import java.util.*;
public class WORK10_01{
    public static void main(String[] args){
        //�ܼƫŧi
        int intCreate=1000000;//���ͶüƦ���
        int intRand;//���ͪ��üƸ��X
        int[][] intArray=new int[2][42];//�m��üư}�C
		
        //�N���ͪ��üƦs��ܰ}�C
        while(intCreate-->0){
            intRand=(int)(Math.random()*42);
            intArray[0][intRand]++;
            intArray[1][intRand]++;
        }
		
        //��intArray[0]�}�C���Ƨ�
        Arrays.sort(intArray[0]);
		
        //��X�̤j�Ƥ��ӼƦr���X
        for(int i=41;i>(41-6);i--){

            //�v�@�ˬd���ƬۦP��
            for(int j=41;j>=0;j--){

                //���ƲŦX�ɦL�X
                if(intArray[0][i]==intArray[1][j]){
                    System.out.println("�üƸ��X "+(j+1)+" �X�{ "+intArray[0][i]+" ��");
                    intArray[1][j]=0;//�N��쪺�ƭȱN�����k�s
                    break;           //���_���j��A�~��~�j��
                }	
            }
        }
    }
}