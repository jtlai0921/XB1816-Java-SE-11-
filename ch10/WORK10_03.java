// =============== Program Description ===============
// �{���W�١G WORK10_03.java                               
// �{���ت��G �B���ӯx�}�ۭ������G
// ===================================================

import java.io.*;
public    class WORK10_03
{
    public static void main(String args[]) throws IOException
    {
        int M,N,P;
        int i,j;
        String strM;
        String strN;
        String strP;
        String tempstr;
        BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("�п�J�x�}A������(M,N): ");
        System.out.print("�Х���J�x�}A��M��: ");
        strM=keyin.readLine();
        M=Integer.parseInt(strM);
        System.out.print("���ۿ�J�x�}A��N��: ");
        strN=keyin.readLine();
        N=Integer.parseInt(strN);
        int A[][]=new int[M][N];
        System.out.println("[�п�J�x�}A���U�Ӥ���]");
        System.out.println("�`�N�I�C��J�@�ӭȫ��UEnter��T�{��J");
        for(i=0;i<M;i++)
            for(j=0;j<N;j++)
            {
                System.out.print("a"+i+j+"=");
                tempstr=keyin.readLine();
                A[i][j]=Integer.parseInt(tempstr);
            }
        System.out.println("�п�J�x�}B������(N,P): ");
        System.out.print("�Х���J�x�}B��N��: ");
        strN=keyin.readLine();
        N=Integer.parseInt(strN);
        System.out.print("���ۿ�J�x�}B��P��: ");
        strP=keyin.readLine();
        P=Integer.parseInt(strP);
        int B[][]=new int[N][P];
        System.out.println("[�п�J�x�}B���U�Ӥ���]");
        System.out.println("�`�N�I�C��J�@�ӭȫ��UEnter��T�{��J");
        for(i=0;i<N;i++)
            for(j=0;j<P;j++)
            {
                System.out.print("b"+i+j+"=");
                tempstr=keyin.readLine();
                B[i][j]=Integer.parseInt(tempstr);
            }
        int C[][]=new int[M][P];
        MatrixMultiply(A,B,C,M,N,P);
        System.out.println("[AxB�����G�O]");
        for(i=0;i<M;i++)
        {
            for(j=0;j<P;j++)
            {
                System.out.print(C[i][j]);
                System.out.print('\t');
            }
            System.out.println();
	}
    }
    public static void MatrixMultiply(int arrA[][],int arrB[][],int arrC[][],int M,int N,int P)
    {
        int i,j,k,Temp;
        if(M<=0||N<=0||P<=0)
        {
            System.out.println("[���~:����M,N,P�����j��0]");
            return;
	}
        for(i=0;i<M;i++)
            for(j=0;j<P;j++)
            {
                Temp = 0;
                for(k=0;k<N;k++)
                Temp = Temp + arrA[i][k]*arrB[k][j];
                arrC[i][j] = Temp;
            }
    }
}