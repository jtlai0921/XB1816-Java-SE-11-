/*�ɮ�:CH10_02.java
 *����:Math���O���p���k
 */ 
public class CH10_02{
    public static void main(String[] args){
        int num1=68,num2=77;
        int Max=Math.max(num1,num2);
        System.out.println("Max="+Max);//��̤j��
        double d1=45.67,d2=86.11;
        double min=Math.min(d1,d2);//��̤p��
        System.out.println("min="+min);
 		
        System.out.println("����P�}�ڸ����p��:");
        int a=5,b=4,c=25;
        System.out.println(a+"��"+b+"����="+Math.pow(a,b));//�p�⦸��
        System.out.println(c+"���}�ڸ�="+Math.sqrt(c));//�p��}�ڸ�
    }	
}