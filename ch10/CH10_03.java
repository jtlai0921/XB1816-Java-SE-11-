/*�ɮ�:CH10_03.java
 *����:Math���O���ƭ��ഫ��k
 */ 
public class CH10_03{
    public static void main(String[] args){
 		
        double d1=12.53,d2=12.5;
        System.out.println("d1="+d1);	
        System.out.println("rint("+d1+") ="+Math.rint(d1));
        System.out.println("round("+d1+") ="+Math.round(d1));
 		
        System.out.println("d2="+d2);	
        System.out.println("rint("+d2+") ="+Math.rint(d2));
        System.out.println("round("+d2+") ="+Math.round(d2));

        double d3=156.347;
        //���P��ƪ��i��k
        System.out.println("���p�ƫ�2�� ceil("+d3+") ="+Math.ceil(d3*100)/100);
        System.out.println("���p�ƫe2�� floor("+d3+")="+Math.floor(d3/100)*100);
        float f1=-12.45f;
        System.out.println(f1+"�������="+Math.abs(f1));
 		
        double rad=60;
        //�N�����ഫ������
        System.out.println("����("+rad+") = "+"����("+Math.toDegrees(60)+")");
    }	
}