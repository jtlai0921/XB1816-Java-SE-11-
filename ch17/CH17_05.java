/*�ɮ�:CH17_05.java �w�ɱƵ{����ܽd*/
//join( ) �ϥΤ�k����
class newThread implements Runnable {     //��@����
    private int a;
    public newThread(int x){
        a=x;
    }
    public void run(){  //�w�qRunnable����������k
        System.out.println("��"+a+"�s������C");
    }
}
class CH17_05{
    public static void main(String[] args) {
        newThread t1=new newThread(1);   
        newThread t2=new newThread(2);
		
        Thread tt1=new Thread(t1);    
        Thread tt2=new Thread(t2);
		
        tt1.start(); //�Ұʰ����
        try{
            tt1.join();
            System.out.println("����join()�A�}�l�����2������C");
            tt2.start();
        }catch(InterruptedException e) {}
    }
}