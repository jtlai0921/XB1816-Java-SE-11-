/*�{���GCH15_02 System.err��������*/
public class CH15_02{
    public static void main(String args[]){
        //�ŧi�ܼ�
        int divisor = 5;
        int dividend = 100;
        //�]�m�L���j��
        while(true){
            if(divisor == 0){
                //�C�X���~�T��
                System.err.println("�{�����~,���_����..���Ƥ��o���s!!");
                break;
            }
            //��X���浲�G
            System.out.println(dividend + " ���H " + divisor 
	                   + " ���� " + (dividend / divisor));
            divisor --;
        }
    }
}