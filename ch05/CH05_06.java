/*�ɮ�:CH05_06.java
 *����:Arrayclone �}�C�ƻs
 */ 

public class CH05_06{
    public static void main(String[] args){
        int A[]={2,4,6,8,10,12};
        System.out.println("�ƻs�e�}�C���������e");
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int B[]=new int[A.length];
        B=(int[])A.clone();
        System.out.println("�ƻs��}�C���������e");
        for (int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
        System.out.println();
    }
}