//�ϥ�Thread���O�������ڰʧ@
class Deposit extends Thread
{
    public int count = 0;
    //���s�w�qrun()
    public void run()  //�̶üƨ��o�s�ڪ��B�A�ò֭p�s�ھl�B
    {
        int deposit_money;
        while(WORK17_01.isRunning)
        {
            deposit_money = (int)(Math.random()*5000)+1;
            WORK17_01.Total = WORK17_01.Total - deposit_money;
            System.out.println("�g�L��"+(count+1)+"�����ڪ��B�s�x��" + deposit_money + 
                               "���A�ҳѾl�B�G" + WORK17_01.Total + "��");
            count++;
            try
            {
                Thread.currentThread();
                Thread.sleep((int)(Math.random()*500));
            }
            catch(InterruptedException e){}
         }
         System.out.println();
         System.out.println(Thread.currentThread() +
             "�w�W�L���ڦ��ơA�Ц��d�x�θɺP���i��ɵn�P");    
   }
}
public class WORK17_01
{
    static final int MAXTIMES = 20;
    static boolean isRunning = true;
    static int Total = 150000;
    //�D�{���϶�
    public static void main(String args[])
    {
        //�إ߰��������
        Deposit deposit = new Deposit();
        System.out.println("������s�ڪ��B" + WORK17_01.Total + "��");
        //�Ұʰ����
        deposit.start();
        while(true)
        {
            //��������
            System.out.println("deposit.count= "+deposit.count);
            if (deposit.count >= MAXTIMES)
            {
                isRunning = false;
                System.out.println("�ѤU�l�B"+ Total +"��");
                break;
            }
       }
    }
}