/*�ɮ�:CH06_13.java
 *����:�r��w�İ�--���o�����r��
 */ 

public class CH06_13{
    public static void main(String[] args){
        StringBuffer  sb=new StringBuffer("Hello Java"); 
			
		
        char a[]=new char[12];
        sb.getChars(6,10,a,0);
        System.out.println("���o�����r��="+sb);
    }
}