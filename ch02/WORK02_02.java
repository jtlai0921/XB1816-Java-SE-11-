// �h���޿�B��l�����λP�d�ҹ�@
public class WORK02_02 {
    public static void main (String args[]) {
        int bit_test=12;/* �w�q����ܼ� (00001100) */
        int bit_test1=7;/* �w�q����ܼ� (00000111)*/
        System.out.println("bit_test= "+bit_test+"  bit_test1= "+bit_test1);
        System.out.println("----------------------------------------------");
        /* ���� AND,OR,XOR �줸�B�� */ 
        System.out.println("���� AND �B�⪺���G:"+(bit_test & bit_test1));
        System.out.println("���� OR  �B�⪺���G:"+(bit_test | bit_test1));
        System.out.println("���� XOR �B�⪺���G:"+(bit_test ^ bit_test1));
    }
}