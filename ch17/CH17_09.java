/*檔案:CH17_09.java 資料未同步*/ 
//主類別
public class CH17_09{
    //主程式
    public static void main(String[] args){
        //實作相關類別物件
        Account customerAccount = new Account();
        Deposit Customer = new Deposit(customerAccount);
        Withdraw Bank = new Withdraw(customerAccount);
        //啟動執行緒
        Customer.start();
        Bank.start();
    }
}

//實作銀行帳戶類別,提供存、提款方法
class Account{
    //宣告相關變數
    private int Credit;
    private boolean available = false;
    //以synhronized宣告存款方法
    public synchronized void put(int money){
        //當get()方法尚未執行時,等待get()方法執行
        while(available == true){
            try{
                wait();
            }
            catch(InterruptedException e){}
        }
        Credit = money;
        //告知get()方法款項已存入可進行提款動作
        available = true;
        notifyAll();
    }
    //以synhronized宣告提款方法
    public synchronized int get(){
        //當put()方法尚未執行時,等待put()方法執行
        while(available == false){
            try{
                wait();
            }
            catch(InterruptedException e){}
        }
        //告知put()方法應繳款項已扣除可進行存款動作
        available = false;
        notifyAll();
        return Credit;
    }
}


//實作貸款人類別,用以呼叫存款方法
class Deposit extends Thread{
    private Account account;
    //類別建構子,導入Account類別物件
    public Deposit(Account acc){
        account = acc;
    }
    //重新定義run()方法
    public void run(){
        for(int i = 1; i <= 5; i++){
            //呼叫Account類別put()方法,用以進行存款動作
            account.put(i);
            System.out.println("貸款人已將第"+i+"個月的款項匯入帳戶\n");
            try{
                //以random()方法亂數決定時間間隔
                sleep((int)(Math.random()*1000));
            }
            catch(InterruptedException e){}
        }
    }
}

//實作銀行類別,用以呼叫扣款方法
class Withdraw extends Thread{
    private Account account;
    //類別建構子,導入Account類別物件
    public Withdraw(Account acc){
        account = acc;
    }
    //重新定義run()方法
    public void run(){
        int depositCounter = 0;
        for(int i = 1; i <= 5; i++){
            //呼叫Account類別get()方法,用以進行扣款動作
            depositCounter = account.get();
            System.out.println("銀行由貸款人帳戶成功扣繳第"+depositCounter
			        +"個月的款項");
            try{
            //設定固定時間間隔1000毫秒
                sleep((int)(1000));
            }
            catch(InterruptedException e){}
        }
    }
}