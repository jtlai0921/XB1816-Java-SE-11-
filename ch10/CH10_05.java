/*�ɮ�:CH10_05.java
 *����:�ƭȻP�r�ꪺ�ഫ
 */ 
public class CH10_05{
    public static void main(String[] args){
 		
        System.out.println("�ƭ���r��");
        Integer I1=20;
        Double D2=4.56;
        String str1=I1.toString();
        String str2=D2.toString();
        String str3=Integer.toBinaryString(20);
        String str4=Integer.toString(20,8);
		
        System.out.println("[Integer -> Sting] str1="+str1);
        System.out.println("[Double -> String] str2="+str2);
        System.out.println("[20���G�i��] -> str3="+str3);
        System.out.println("[20���K�i��] -> str4="+str4);
        Double a=123.9870;
        System.out.println("�N�Ʀr�ഫ���r��:"+String.valueOf(a));//�r�����O�̤��йL
		
        System.out.println("\n�r����Ʀr");
        String s1=new String("123");
        int i1=Integer.parseInt(s1);//�Ns1�r���ഫ��int��ƫ��O
        String s2=new String("456");
        int i2=Integer.valueOf(s2).intValue();//�Ns2�r���ഫ��int��ƫ��O
        System.out.println("s1="+s1+"\t"+"s2="+s2);
        System.out.println("i1="+i1+"\t"+"i2="+i2);
        System.out.println("s1+5="+(s1+5));
        System.out.println("i1+5="+(i1+5) );
        System.out.println("i2+i1="+(i2+i1));
    }	
}