/*�ɮ�:CH10_01.java
 *����:�üƪ��ϥΤ�k
 */ 
public class CH10_01{
    public static void main(String[] args){
        double a=Math.random();//���ͤ@��double���A���Ʀr
        System.out.println("�w�]���üƫ��A a="+a);
        System.out.println();
        int[] num=new int[6];
        System.out.println("�ۤv�]�w�j�ֳz���X�����;�");
        for(int i=0; i<num.length;i++){
            num[i]=(int)(Math.random()*49+1);//���͸��X
            System.out.print(num[i]+" ");
        }
        System.out.println("\n���ߤ��F�Y��2��!!!");
    }	
}