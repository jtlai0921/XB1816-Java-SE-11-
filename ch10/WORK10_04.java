// =============== Program Description ===============
// �{���W�١G WORK10_04.java                               
// �{���ت��G ���Y�}���x�}�ÿ�X���G
// ===================================================

import java.io.*;
public    class WORK10_04
{
    public static void main(String args[]) throws IOException
    {  
        final int _ROWS =8;	//�w�q�C��
        final int _COLS =9;	//�w�q���
        final int _NOTZERO =8;	//�w�q�}���x�}������0���Ӽ�
        int i,j,tmpRW,tmpCL,tmpNZ;
        int temp=1;
        int Sparse[][]=new int[_ROWS][_COLS];	//�ŧi�}���x�}
        int Compress[][]=new int[_NOTZERO+1][3];//�ŧi���Y�x�}
        for (i=0;i<_ROWS;i++)			//�N�}���x�}���Ҧ������]��0
            for (j=0;j<_COLS;j++)
                Sparse[i][j]=0;
        tmpNZ=_NOTZERO;
        for (i=1;i<tmpNZ+1;i++)
        {
            tmpRW=(int)(Math.random()*100);
            tmpRW = (tmpRW % _ROWS);
            tmpCL=(int)(Math.random()*100);
            tmpCL = (tmpCL % _COLS);
            if(Sparse[tmpRW][tmpCL]!=0)	//�קK�P�@�Ӥ����]�w�⦸�ƭȦӳy�����Y�x�}����0
                tmpNZ++;
            Sparse[tmpRW][tmpCL]=i; //�H�����͵}���x�}���D�s��������
        }
        System.out.println("[�}���x�}���U�Ӥ���]"); //�L�X�}���x�}���U�Ӥ���
        for (i=0;i<_ROWS;i++)
        {  
            for (j=0;j<_COLS;j++)
                System.out.print(Sparse[i][j]+" ");
            System.out.println();
        }
        /*�}�l���Y�}���x�}*/
        Compress[0][0] = _ROWS;
        Compress[0][1] = _COLS;
        Compress[0][2] = _NOTZERO;
        for (i=0;i<_ROWS;i++)
            for (j=0;j<_COLS;j++)
                if (Sparse[i][j] != 0)
                {  
                    Compress[temp][0]=i;
                    Compress[temp][1]=j;
                    Compress[temp][2]=Sparse[i][j];
                    temp++;
                }
        System.out.println("[�}���x�}���Y�᪺���e]"); //�L�X���Y�x�}���U�Ӥ���
        for (i=0;i<_NOTZERO+1;i++)
        {  
            for (j=0;j<3;j++)
                System.out.print(Compress[i][j]+" ");
            System.out.println();
        }
    }
}