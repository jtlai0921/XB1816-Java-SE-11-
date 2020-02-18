/*�ɮ�:CH17_09.java ��ƥ��P�B*/ 
//�D���O
public class CH17_09{
    //�D�{��
    public static void main(String[] args){
        //��@�������O����
        Account customerAccount = new Account();
        Deposit Customer = new Deposit(customerAccount);
        Withdraw Bank = new Withdraw(customerAccount);
        //�Ұʰ����
        Customer.start();
        Bank.start();
    }
}

//��@�Ȧ�b�����O,���Ѧs�B���ڤ�k
class Account{
    //�ŧi�����ܼ�
    private int Credit;
    private boolean available = false;
    //�Hsynhronized�ŧi�s�ڤ�k
    public synchronized void put(int money){
        //��get()��k�|�������,����get()��k����
        while(available == true){
            try{
                wait();
            }
            catch(InterruptedException e){}
        }
        Credit = money;
        //�i��get()��k�ڶ��w�s�J�i�i�洣�ڰʧ@
        available = true;
        notifyAll();
    }
    //�Hsynhronized�ŧi���ڤ�k
    public synchronized int get(){
        //��put()��k�|�������,����put()��k����
        while(available == false){
            try{
                wait();
            }
            catch(InterruptedException e){}
        }
        //�i��put()��k��ú�ڶ��w�����i�i��s�ڰʧ@
        available = false;
        notifyAll();
        return Credit;
    }
}


//��@�U�ڤH���O,�ΥH�I�s�s�ڤ�k
class Deposit extends Thread{
    private Account account;
    //���O�غc�l,�ɤJAccount���O����
    public Deposit(Account acc){
        account = acc;
    }
    //���s�w�qrun()��k
    public void run(){
        for(int i = 1; i <= 5; i++){
            //�I�sAccount���Oput()��k,�ΥH�i��s�ڰʧ@
            account.put(i);
            System.out.println("�U�ڤH�w�N��"+i+"�Ӥ몺�ڶ��פJ�b��\n");
            try{
                //�Hrandom()��k�üƨM�w�ɶ����j
                sleep((int)(Math.random()*1000));
            }
            catch(InterruptedException e){}
        }
    }
}

//��@�Ȧ����O,�ΥH�I�s���ڤ�k
class Withdraw extends Thread{
    private Account account;
    //���O�غc�l,�ɤJAccount���O����
    public Withdraw(Account acc){
        account = acc;
    }
    //���s�w�qrun()��k
    public void run(){
        int depositCounter = 0;
        for(int i = 1; i <= 5; i++){
            //�I�sAccount���Oget()��k,�ΥH�i�榩�ڰʧ@
            depositCounter = account.get();
            System.out.println("�Ȧ�ѶU�ڤH�b�ᦨ�\��ú��"+depositCounter
			        +"�Ӥ몺�ڶ�");
            try{
            //�]�w�T�w�ɶ����j1000�@��
                sleep((int)(1000));
            }
            catch(InterruptedException e){}
        }
    }
}