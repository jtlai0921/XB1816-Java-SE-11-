// �۰ʫ��A�ഫ�P�j��A�ഫ�����
public class WORK02_03 {
    public static void main (String args[]) {
        int i=100, j=3; /* �w�q����ܼ� i �P j */
        float Result;      /* �w�q�B�I���ܼ� Result */
        System.out.println("�۰ʫ��A�ഫ�����浲�G");
        Result=i/j;       /* �۰ʫ��A�ഫ */
        System.out.println("Result=i/j="+i+"/"+j+"="+Result);
        System.out.println("-----------------------------------------");    
        System.out.println("�j��A�ഫ�����浲�G");
        Result=(float) i / j;  /* �j��A�ഫ */
        System.out.println("Result=(float)i/(float)j="+i+"/"+j+"="+Result);
        System.out.println("-----------------------------------------");   
    }
}