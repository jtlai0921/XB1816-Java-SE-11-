//使用Thread類別模擬提款動作
class Deposit extends Thread
{
    public int count = 0;
    //重新定義run()
    public void run()  //依亂數取得存款金額，並累計存款餘額
    {
        int deposit_money;
        while(WORK17_01.isRunning)
        {
            deposit_money = (int)(Math.random()*5000)+1;
            WORK17_01.Total = WORK17_01.Total - deposit_money;
            System.out.println("經過第"+(count+1)+"次提款金額新台幣" + deposit_money + 
                               "元，所剩餘額：" + WORK17_01.Total + "元");
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
             "已超過取款次數，請至櫃台或補摺機進行補登摺");    
   }
}
public class WORK17_01
{
    static final int MAXTIMES = 20;
    static boolean isRunning = true;
    static int Total = 150000;
    //主程式區塊
    public static void main(String args[])
    {
        //建立執行緒物件
        Deposit deposit = new Deposit();
        System.out.println("原先的存款金額" + WORK17_01.Total + "元");
        //啟動執行緒
        deposit.start();
        while(true)
        {
            //結束條件
            System.out.println("deposit.count= "+deposit.count);
            if (deposit.count >= MAXTIMES)
            {
                isRunning = false;
                System.out.println("剩下餘額"+ Total +"元");
                break;
            }
       }
    }
}