/*�ɮ�:CH05_07.java
 *����:�}�C���ƻs��k
 */ 
public class CH05_07{
    public static void main(String[] args){
  		
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=new int[5];
        //�j�骺�覡
        for(int i=0; i<arr1.length; i++)
            arr2[i]=arr1[i];
        //��X
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr2[i]+" ");
        }System.out.println();	
        char[] arr3=new char[]{'a','r','r','a','y'};
        char[] arr4=new char[arr3.length];//�Harr3���}�C���׬��j�p
        arr4=(char[])arr3.clone();//clone�覡
        //��X
        for(int i=0; i<arr1.length; i++) {
        System.out.print(arr4[i]+" ");
        }System.out.println();
        //�إߦr��}�C
        String[] str1=new String[]{"�U�g�������\��",
				   "�U�g�����֦~��",
				   "��}���骽����",
				   "���ݵL��ŧ�K"};
        System.out.println("���\�� (����Q)");
        for(int i=0; i<str1.length; i++)
            System.out.println(str1[i]);
        System.out.println();
        String[] str2=new String[]{"1","2","3","4"};//�إߦr��}�C
        System.arraycopy(str1,0,str2,1,2);//arraycopy�覡
        //��X
        for(int i=0; i<str2.length; i++)
            System.out.println(str2[i]);
    }	
}